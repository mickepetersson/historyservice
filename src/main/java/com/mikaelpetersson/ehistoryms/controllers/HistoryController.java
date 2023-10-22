package com.mikaelpetersson.ehistoryms.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mikaelpetersson.ehistoryms.models.MediaHistory;
import com.mikaelpetersson.ehistoryms.services.MediaHistoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/history")
public class HistoryController {


    @Autowired
    private MediaHistoryServices mediaHistoryServices;

/*    @PostMapping("/mediahistory/add")
    public MediaHistory addMHTest () throws JsonProcessingException {
        return mediaHistoryServices.addMedia();
    }*/

    @PostMapping("/MediaHistory/add/{mediaId}")
public MediaHistory createMH (@PathVariable("mediaId") int mediaId) throws JsonProcessingException {
        System.out.println(mediaHistoryServices.addHistoryItem(mediaId));
        return mediaHistoryServices.addHistoryItem(mediaId);
    }

}
