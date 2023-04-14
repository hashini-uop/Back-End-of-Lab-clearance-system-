package com.system.labClearanceSystem.service;


import com.system.labClearanceSystem.entity.Lab;

import java.util.List;

public interface LabService {

    public Lab saveLab(Lab lab);
    public List<Lab> getAllLabs();
    public Lab updateLab(Lab lab);
    public boolean deleteLab(Lab lab);

    public Lab getLabByLabID(int labID);

    public Lab getLabByLabIDANDLabType(int labID , String labType);
}
