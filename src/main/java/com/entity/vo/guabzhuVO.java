package com.entity.vo;

import java.io.Serializable;

public class guabzhuVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private long id;
    private long guabzhuid;
    private String tablename;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getGuabzhuid() {
        return guabzhuid;
    }

    public void setGuabzhuid(long guabzhuid) {
        this.guabzhuid = guabzhuid;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }
}
