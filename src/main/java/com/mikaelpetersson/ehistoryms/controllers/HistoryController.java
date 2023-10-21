package com.mikaelpetersson.ehistoryms.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mikaelpetersson.ehistoryms.models.MediaHistory;
import com.mikaelpetersson.ehistoryms.services.MediaHistoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/history")
public class HistoryController {

    @Autowired
    private MediaHistoryServices mediaHistoryServices;

    @PostMapping("/mediahistory/add")
    public MediaHistory addMHTest () throws JsonProcessingException {
        return mediaHistoryServices.addMedia();
    }

}
