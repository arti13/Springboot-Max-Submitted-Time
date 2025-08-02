package com.example.demo.service;

import com.example.demo.dao.EncounterRecordDao;
import com.example.demo.model.EncounterRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EncounterRecordService {

    @Autowired
    private EncounterRecordDao dao;

    public List<EncounterRecord> getMaxSubmittedRecords() {
        return dao.getMaxSubmittedRecords();
    }
}