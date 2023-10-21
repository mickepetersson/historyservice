package com.mikaelpetersson.ehistoryms.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mikaelpetersson.ehistoryms.models.MediaHistory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MediaHistoryServiceInterface {

    //get all media history
    List<MediaHistory> getAll();

    //get media history by user
    List<MediaHistory> getByUserId(int userId);

    //POST add history
    MediaHistory addMedia() throws JsonProcessingException;


}
