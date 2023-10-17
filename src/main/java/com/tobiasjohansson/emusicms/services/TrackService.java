package com.tobiasjohansson.emusicms.services;

import com.tobiasjohansson.emusicms.models.Track;
import com.tobiasjohansson.emusicms.repositories.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrackService implements TrackInterface{

    @Autowired
    private TrackRepository trackRepository;

    @Autowired
    private CompareDatesService compareDatesService;

    public TrackService() {
    }

    // Search Track by Name
    @Override
    public Track getTrackByName(String trackName) {
        return trackRepository.findTrackByNameContainsIgnoreCase(trackName);
    }

    @Override
    public Track updateTracks(Track track, int id) {
        Track t = trackRepository.findById(id).orElseThrow();
        t.setArtist(t.getArtist());
        t.setGenre(t.getGenre());
        t.setName(t.getName());
        t.setMediaType(t.getMediaType());
        t.setReleaseDate(t.getReleaseDate());
        trackRepository.save(t);
        return t;
    }

    @Override
    public List<Track> getTrackByArtist(String artistName) {
        return trackRepository.findTrackByArtistContainingIgnoreCase(artistName);
    }

    // GET ALL
    public List<Track> getAllTracks(){

        return trackRepository.findAll();
        // TODO sort tracks, TEST
        //  return compareDatesService.sortReleaseDates(trackRepository.findAll(),Track::getReleaseDate);

    }
    // GET BY ID
    public Optional<Track> getTrackById(int id){
        return trackRepository.findById(id);
    }

    // SAVE
    public Track saveTrack(Track newTrack){
        return trackRepository.save(newTrack);
    }
    // UPDATE todo:  <------------------

    // DELETE
    public String deleteTrack(int id){
        Optional<Track> optionalTrack = trackRepository.findById(id);
        if(optionalTrack.isPresent()){
            trackRepository.deleteById(id);
            return "Track was deleted successfully";
        }
        return "Could not find Track with that id";
    }

    public List<Track> findTrackByGenre(String genreName){
        return trackRepository.findTrackByGenreContainingIgnoreCase(genreName);
    }

    public List<Track> findTrackByAlbum(String albumName){
        return trackRepository.findTrackByAlbumContainingIgnoreCase(albumName);
    }

}
