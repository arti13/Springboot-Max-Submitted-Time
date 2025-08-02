package com.example.demo.model;

public class EncounterRecord {
    private String encounterId;
    private String submittedTime;

    public EncounterRecord() {}

    public EncounterRecord(String encounterId, String submittedTime) {
        this.encounterId = encounterId;
        this.submittedTime = submittedTime;
    }

    public String getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    public String getSubmittedTime() {
        return submittedTime;
    }

    public void setSubmittedTime(String submittedTime) {
        this.submittedTime = submittedTime;
    }
}