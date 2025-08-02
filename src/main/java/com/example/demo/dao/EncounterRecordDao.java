package com.example.demo.dao;

import com.example.demo.model.EncounterRecord;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EncounterRecordDao {

    private List<EncounterRecord> records = Arrays.asList(
        new EncounterRecord("E1", "14.30"),
        new EncounterRecord("E2", "22.30"),
        new EncounterRecord("E1", "21.20"),
        new EncounterRecord("E2", "23.50")
    );

    public List<EncounterRecord> getMaxSubmittedRecords() {
        Map<String, String> maxMap = new HashMap<>();
        for (EncounterRecord rec : records) {
            if (!maxMap.containsKey(rec.getEncounterId()) ||
                rec.getSubmittedTime().compareTo(maxMap.get(rec.getEncounterId())) > 0) {
                maxMap.put(rec.getEncounterId(), rec.getSubmittedTime());
            }
        }
        List<EncounterRecord> result = new ArrayList<>();
        for (Map.Entry<String, String> entry : maxMap.entrySet()) {
            result.add(new EncounterRecord(entry.getKey(), entry.getValue()));
        }
        return result;
    }
}