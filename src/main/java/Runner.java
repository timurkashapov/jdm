import com.shako.app.Download;
import com.shako.app.State;

/**
 * Запускатель.
 */
public class Runner {

    static {}
    {}

    public static void main(String[] args) {

        String title = "NewDownload";

        // ---------------------------------------------------
        // добавляем новый процесс загрузки:

        // java legacy
        new Thread(new Runnable() {
            @Override
            public void run() {
                new Download();
            }
        }, title).start();

        // lava
        new Thread(() -> new Download(State.INIT), title).start();

        // lava+mref
        // new Thread(Download::new, title).start();
        // ---------------------------------------------------
    }
}
