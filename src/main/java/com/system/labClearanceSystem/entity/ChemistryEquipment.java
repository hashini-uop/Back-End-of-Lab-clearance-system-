package com.system.labClearanceSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity
@IdClass(CEID.class)
public class ChemistryEquipment extends Equipment{
    @Column(name = "volume")

    private String volume;

    public ChemistryEquipment() {
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}













