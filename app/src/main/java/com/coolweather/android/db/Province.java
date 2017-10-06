package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 马云山 on 2017/10/6.
 */

public class Province extends DataSupport {
    private int id;
    private String procinceName;
    private int procinceCode;
    private int getId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProcinceName() {
        return procinceName;
    }

    public void setProcinceName(String procinceName) {
        this.procinceName = procinceName;
    }

    public int getProcinceCode() {
        return procinceCode;
    }

    public void setProcinceCode(int procinceCode) {
        this.procinceCode = procinceCode;
    }

    public int getGetId() {
        return getId;
    }

    public void setGetId(int getId) {
        this.getId = getId;
    }
}
