import com.shako.app.Download;
import com.shako.app.DownloadManager;
import com.shako.app.State;
import javax.swing.*;

/**
 * Запускатель.
 */
public class Runner {

    static {}
    {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DownloadManager::new);


        //String title = "NewDownload";

        // ---------------------------------------------------
        // добавляем новый процесс загрузки:

        // java legacy
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                new Download();
//            }
//        }, title).start();

        // lava
        // new Thread(() -> new Download(State.INIT), title).start();

        // lava+mref
        // new Thread(Download::new, title).start();
        // ---------------------------------------------------
    }
}
