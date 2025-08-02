package com.example.demo.controller;

import com.example.demo.model.EncounterRecord;
import com.example.demo.service.EncounterRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/encounters")
public class EncounterRecordController {

    @Autowired
    private EncounterRecordService service;

    @GetMapping("/max-submitted")
    public List<EncounterRecord> getMaxSubmittedRecords() {
        return service.getMaxSubmittedRecords();
    }
}