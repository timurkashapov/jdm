package com.shako.app;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Toolkit;

/**
 * Пользовательский интерфейс и управление процессом загрузки.
 */
public class DownloadManager extends JFrame  {

    private DownloadsTableModel model;
    private ProgressRenderer renderer;

    public DownloadManager() {
        setTitle("Javka Download Manager");
        setEnabled(Boolean.TRUE);
        setDefaultLookAndFeelDecorated(Boolean.TRUE);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(Boolean.TRUE);
    }

    public DownloadsTableModel getModel() {
        return model;
    }
    public void setModel(DownloadsTableModel model) {
        this.model = model;
    }
    public ProgressRenderer getRenderer() {
        return renderer;
    }
    public void setRenderer(ProgressRenderer renderer) {
        this.renderer = renderer;
    }
}
