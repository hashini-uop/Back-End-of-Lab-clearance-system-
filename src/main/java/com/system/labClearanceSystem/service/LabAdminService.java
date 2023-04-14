package com.system.labClearanceSystem.service;

import com.system.labClearanceSystem.entity.LabAdmin;
import com.system.labClearanceSystem.entity.Student;

import java.util.List;

public interface LabAdminService {

    public LabAdmin saveLabAdmin(LabAdmin labAdmin);
    public List<LabAdmin> getAllLabAdmins();
}
