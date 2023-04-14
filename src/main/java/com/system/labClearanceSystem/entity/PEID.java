package com.system.labClearanceSystem.entity;

import java.io.Serializable;

public class PEID implements Serializable {
    private String scale;
    private int e_id;

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }
}
