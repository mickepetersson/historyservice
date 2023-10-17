package com.tobiasjohansson.emusicms.controllers;

import com.tobiasjohansson.emusicms.models.Track;
import com.tobiasjohansson.emusicms.services.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/music/api/v1")
public class TrackController {

    @Autowired
    private TrackService trackService;

    public TrackController() {
    }

    // search track by name
    @GetMapping("/gettrackbyname/{trackName}")
    public Track getTrackByName(@PathVariable("trackName") String trackName){
        return trackService.getTrackByName(trackName);
    }
    // GET ALL TRACKS
    @GetMapping("/getall")
    public List<Track> getAllAllTracks(){
        return trackService.getAllTracks();
    }
    // GET TRACKS BY ID todo: ResponseEntity <----------------------
    @GetMapping("/getbyid/{id}")
    public Optional<Track> trackById(@PathVariable("id") int id){
        return trackService.getTrackById(id);
    }

    // POST, CREATE/SAVE NEW TRACK
    @PostMapping("/add")
    public Track saveTrack(Track newTrack){
        return trackService.saveTrack(newTrack);
    }

    // UPDATE

    // DELETE TRACK
    // returnerar en sträng som bekräftelse todo: kan ändras <-----------
    @DeleteMapping("/delete/{id}")
    public String deleteTrack(@PathVariable("id") int id){
        return trackService.deleteTrack(id);
    }

    @GetMapping("/bygenre/{genreName}")
    public List<Track> findTrackByGenre(@PathVariable("genreName")String genreName){
        genreName = genreName.replace("-", " ").replace("+", " ").replace("%", " ");
        return trackService.findTrackByGenre(genreName);
    }

    @GetMapping("/byalbum/{albumName}")
    public List<Track> findAlbumbyTrack(@PathVariable("albumName")String albumName){
        albumName = albumName.replace("-", " ").replace("+", " ").replace("%", " ");
        return trackService.findTrackByAlbum(albumName);
    }

    @PutMapping("/updateTracks/{id}")
    public ResponseEntity<Track> updateTracks(@PathVariable("id")int id, @RequestBody Track track) {
        return ResponseEntity.ok(trackService.updateTracks(track, id));
    }
}

