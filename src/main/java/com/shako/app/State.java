package com.shako.app;

import com.shako.app.resource.R;

/**
 * Модель состояний процесса загрузки.
 */
public enum State {

    INIT(
            R.STATE_INIT_NAME,
            R.STATE_INIT_CODE),
    DOWNLOADING(
            R.STATE_DOWNLOADING_NAME,
            R.STATE_DOWNLOADING_CODE),
    PAUSED(
            R.STATE_PAUSED_NAME,
            R.STATE_PAUSED_CODE),
    COMPLETE(
            R.STATE_COMPLETE_NAME,
            R.STATE_COMPLETE_CODE),
    CANCELLED(
            R.STATE_CANCELLED_NAME,
            R.STATE_CANCELLED_CODE),
    ERROR(
            R.STATE_ERROR_NAME,
            R.STATE_ERROR_CODE);

    /**
     * Наименование состояния.
     */
    private String name;

    /**
     * Код состояния.
     */
    private Integer code;

    State(String name, Integer code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
}
