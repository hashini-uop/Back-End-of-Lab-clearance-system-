package com.system.labClearanceSystem.service;

import com.system.labClearanceSystem.entity.LabAdmin;
import com.system.labClearanceSystem.repository.LabAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabAdminServiceImp implements LabAdminService{
    @Autowired
    private LabAdminRepository labAdminRepository;
    @Override
    public LabAdmin saveLabAdmin(LabAdmin labAdmin){
        return labAdminRepository.save(labAdmin);
    }

    @Override
    public List<LabAdmin> getAllLabAdmins(){
        return labAdminRepository.findAll();
    }


}
