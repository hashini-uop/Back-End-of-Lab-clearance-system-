package com.system.labClearanceSystem.entity;

import java.io.Serializable;

public class CEID implements Serializable {
    private int e_id;
    private String volume;

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}
