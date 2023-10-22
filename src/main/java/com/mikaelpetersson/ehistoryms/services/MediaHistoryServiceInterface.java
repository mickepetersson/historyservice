package com.mikaelpetersson.ehistoryms.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mikaelpetersson.ehistoryms.models.MediaHistory;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.List;

@Repository
public interface MediaHistoryServiceInterface {

    //get all media history
    List<MediaHistory> getAll();

    //get media history by user
    List<MediaHistory> getByUserId(int userId);

    MediaHistory addHistoryItem(int mediaId) throws JsonProcessingException;

    //POST add history
    MediaHistory addTrack(int mediaId);
    MediaHistory addPod(int mediaId);

    MediaHistory addVideo(int mediaId);


}
