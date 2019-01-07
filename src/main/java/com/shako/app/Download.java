package com.shako.app;

import java.io.File;
import java.net.URL;
import java.util.Observable;
import java.util.Optional;

/**
 * Обслуживание процесса загрузки.
 * - Загрузка файла.
 * - Сохранение содержимого файла на диске.
 */
public class Download extends Observable implements Runnable {

    /**
     * Текущее состояние.
     */
    private State state;

    /**
     * URL файла для загрузки.
     */
    private URL url;

    /**
     * Размер файла.
     */
    private Integer size;

    /**
     * Количество загруженных байтов.
     */
    private Integer downloadAmount;

    /**
     * Наименование загружаемого файла.
     */
    private String filename;

    static {

    }
    {}
    public Download() {}
    public Download(URL url) {
        this.url = url;
        this.size = -1;
        this.downloadAmount = 0;
        this.state = State.INIT;
        this.filename = getFileNameByURL(url);
        start();

    }
    public Download(State state) {
        this.state = Optional.ofNullable(state).get();
    }

    // загрузить файл
    public native void loadFile(URL url, File file);

    // сохранить содержимое файла на диске
    public native void saveFileOnDisk(File file);

    /**
     * Запуск процесса загрузки файла.
     */
    public void start() {
        new Thread(this).start();
    }

    /**
     * Отмена процесса загрузки файла.
     */
    public void cancel() {
        this.state = State.CANCELLED;
        stateChanged();

    }

    /**
     * Временная остановка процесса загрузки файла.
     */
    public void pause() {
        this.state = State.PAUSED;
        stateChanged();

    }

    /**
     * Возобновление процесса загрузки файла.
     */
    public void resume() {
        this.state = State.DOWNLOADING;
        stateChanged();

    }

    /**
     * Ошибка процесса загрузки файла.
     */
    private void error() {
        this.state = State.ERROR;
        stateChanged();

    }

    /**
     * Уведомление всех наблюдателей об изменении состояния загрузки файла.
     */
    private void stateChanged() {
        setChanged();
        notifyObservers();
    }

    /**
     * Получение загруженного объема файла в процентах.
     * @return объем файла в процентах.
     */
    public Float getProgress() {
        return  (downloadAmount / size) * 100f;
    }

    /**
     * Получить имя файла из URL.
     * @param url url
     * @return имя файла.
     */
    private String getFileNameByURL(URL url) {
        String filename = url.getFile();
        return filename.substring(filename.lastIndexOf("/") + 1);
    }

    @Override
    public void run() {
        this.state = State.DOWNLOADING;
        stateChanged();
        System.out.println("run");
    }

    public State getState() {
        return state;
    }
    public URL getUrl() {
        return url;
    }
    public Integer getSize() {
        return size;
    }
    public Integer getDownloadAmount() {
        return downloadAmount;
    }
}
