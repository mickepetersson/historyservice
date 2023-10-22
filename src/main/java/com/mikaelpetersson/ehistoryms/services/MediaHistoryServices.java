package com.mikaelpetersson.ehistoryms.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.mikaelpetersson.ehistoryms.models.MediaHistory;
import com.mikaelpetersson.ehistoryms.repositories.MediaHistoryRepository;
import com.mikaelpetersson.ehistoryms.repositories.UserRepository;
import com.netflix.discovery.converters.Auto;
import org.h2.util.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import javax.print.attribute.standard.Media;
import java.util.List;

@Service
public class MediaHistoryServices implements MediaHistoryServiceInterface {

    @Autowired
    private MediaHistoryRepository mediaHistoryRepository;
    @Autowired
    private UserRepository userRepository;


    public MediaHistoryServices(MediaHistoryRepository mediaHistoryRepository, UserRepository userRepository) {
        this.mediaHistoryRepository = mediaHistoryRepository;
        this.userRepository = userRepository;
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
    public MediaHistory addHistoryItem(int mediaId) throws JsonProcessingException {
        MediaHistory m = new MediaHistory();
        WebClient webClient = WebClient.create();
        Mono<String> response = webClient.get()
                .uri("http://localhost:7070/music/api/v1/track/getbyid/" + mediaId)
                .retrieve()
                .bodyToMono(String.class);

    String responseJson = response.block();
        System.out.println(responseJson);
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(responseJson);
        JsonNode nestedJsonObject = jsonNode.get("artist");
        String artistName = nestedJsonObject.get("name").asText();
        String mediaName = jsonNode.get("name").asText();
        m.setArtist(artistName);
        m.setMedia(mediaName);
        return mediaHistoryRepository.save(m);
    }


/*    public class MyService {
        public void getDataFromOtherService() {
            WebClient webClient = WebClient.create();
            String responseJson = webClient.get()
                    .uri("http://other-microservice-url")
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();

            JSONObject jsonObject = new JSONObject(responseJson);
            String specificValue = jsonObject.get("specificKey").toString();
            String specificKeyValue = specificValue;
        }
    }*/


    //needs artistId TrackName id MediaTypeId and GenreId

    //getartist
    //getmedia
    //getgenre



/*
//extract artistName

    public Mono<String> getArtistName(Mono<String> jsonData){
        ObjectMapper objectMapper = new ObjectMapper();
        return jsonData.map(jsonString -> {
            try {
                JsonNode jsonNode = objectMapper.readTree(jsonString);
                String artistName = jsonNode.get("artistName").asText();
                return artistName;
            } catch (IOException e){
                throw new RuntimeException("Error parsing Json for artistName", e);
            }
                });
    }
    //extract mediaName
    public Mono<String> getMediaName(Mono<String> jsonData){
        ObjectMapper objectMapper = new ObjectMapper();
        return jsonData.map(jsonString -> {
            try {
                JsonNode jsonNode = objectMapper.readTree(jsonString);
                String mediaName = jsonNode.get("mediaName").asText();
                return mediaName;
            } catch (IOException e){
                throw new RuntimeException("Error parsing Json for mediaName", e);
            }
        });
    }

    public Mono<String> getGenre(Mono<String> jsonData){
        ObjectMapper objectMapper = new ObjectMapper();
        return jsonData.map(jsonString -> {
            try {
                JsonNode jsonNode = objectMapper.readTree(jsonString);
                String mediaName = jsonNode.get("genreName").asText();
                return mediaName;
            } catch (IOException e){
                throw new RuntimeException("Error parsing Json forgenreName", e);
            }
        });
    }*/
    //extract genre


        //parse json and extract ArtistName

        //parse json and extract GenreName



    public MediaHistory addTrack(int mediaId) {

        return null;
    }

    @Override
    public MediaHistory addPod(int mediaId) {
        return null;
    }

    @Override
    public MediaHistory addVideo(int mediaId) {
        return null;
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
