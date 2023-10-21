package com.mikaelpetersson.ehistoryms.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mikaelpetersson.ehistoryms.models.MediaHistory;
import com.mikaelpetersson.ehistoryms.repositories.MediaHistoryRepository;
import com.mikaelpetersson.ehistoryms.repositories.UserRepository;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MediaHistoryServices implements MediaHistoryServiceInterface {

    @Autowired
    private MediaHistoryRepository mediaHistoryRepository;
    @Autowired
    private UserRepository userRepository;

    private final RestTemplate restTemplate;

    @Autowired
    public MediaHistoryServices(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public List<MediaHistory> getAll() {
        return mediaHistoryRepository.findAll();
    }

    @Override
    public List<MediaHistory> getByUserId(int userId) {
        return null;
    }

    @Override
    public MediaHistory addMedia() throws JsonProcessingException {
        String getTrack = "http://localhost:7070/music/api/v1/track/getbyid/1";
        ResponseEntity<String> response = restTemplate.getForEntity(getTrack, String.class);
        String responseBody = response.getBody();
        Map<String,Object> result =
                new ObjectMapper().readValue(responseBody, HashMap.class);
        String specificValue = (String) result.get("name");
        MediaHistory m = new MediaHistory();
        m.setMedia(String.valueOf(specificValue));
        mediaHistoryRepository.save(m);
        return m;
    }

    /*public Object requestObjectFromOtherMicroservice() {
        String url = "http://other-microservice/get-object";
        ResponseEntity<Object> response = restTemplate.getForEntity(url, Object.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            return response.getBody();
        } else {
            // Handle error, e.g., throw an exception or return a default value
            return null;
        }*/

}
