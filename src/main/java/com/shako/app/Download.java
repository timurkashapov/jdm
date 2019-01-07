package com.shako.app;

import java.util.Optional;

/**
 * Загрузка файла и сохранение его содержимого на диске.
 */
public class Download {

    /**
     * Текущее состояние.
     */
    private State state;

    static {

    }
    {}
    public Download() {}
    public Download(State state) {
        this.state = Optional.ofNullable(state).get();
    }
}
