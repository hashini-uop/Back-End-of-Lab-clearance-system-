package com.system.labClearanceSystem.service;


import com.system.labClearanceSystem.entity.Lab;
import com.system.labClearanceSystem.repository.LabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabServiceImp implements LabService{
    @Autowired
    private LabRepository labRepository;
    @Override
    public Lab saveLab(Lab lab){

        return labRepository.save(lab);
    }

    @Override
    public List<Lab> getAllLabs(){

        return labRepository.findAll();
    }

    @Override
    public Lab updateLab(Lab lab){

        return labRepository.save(lab);
    }

    @Override
    public boolean deleteLab(Lab lab){

        return true;
    }

    @Override
    public Lab getLabByLabID(int labID){

        return labRepository.getLabByLabID(labID);
    }

    public Lab getLabByLabIDANDLabType(int labID , String labType){

        return labRepository.getLabByLabIDANDLabType(labID , labType);
    }


}
