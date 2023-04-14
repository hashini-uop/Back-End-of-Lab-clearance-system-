package com.system.labClearanceSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;

@Entity
@IdClass(PEID.class)
public class PhysicsEquipment extends Equipment{
    @Column(name = "scale")
    private String scale;

    public PhysicsEquipment() {
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }
}
