package com.shako.app.resource;

/**
 * Константы проекта.
 */
public class R {

    /**
     * Максимальный размер буфера загрузки.
     */
    public static final int MAX_BUFFER_SIZE = 1024;

    /**
     * Коды модели состояний процесса загрузки.
     */
    public static final int    STATE_INIT_CODE = 0;
    public static final int    STATE_DOWNLOADING_CODE = 1;
    public static final int    STATE_PAUSED_CODE = 2;
    public static final int    STATE_COMPLETE_CODE = 3;
    public static final int    STATE_CANCELLED_CODE = 4;
    public static final int    STATE_ERROR_CODE = 5;

    /**
     * Наименования модели состояний процесса загрузки.
     */
    public static final String STATE_INIT_NAME = "Initialization";
    public static final String STATE_DOWNLOADING_NAME = "Downloading";
    public static final String STATE_PAUSED_NAME = "Paused";
    public static final String STATE_COMPLETE_NAME = "Complete";
    public static final String STATE_CANCELLED_NAME = "Cancelled";
    public static final String STATE_ERROR_NAME = "Error";
}
