package com.tobiasjohansson.emusicms.services;


import com.tobiasjohansson.emusicms.models.Album;
import com.tobiasjohansson.emusicms.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumService implements AlbumInterface {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private CompareDatesService compareDatesService;


    public AlbumService() {
    }

    // Album by Track Name
    @Override
    public Album findAlbumByTrackName(String trackName) {
        return albumRepository.findAlbumByTrackName(trackName);
    }

    @Override
    public Album updateAlbum(Album album, int id) {
        Album a = albumRepository.findById(id).orElseThrow();
        a.setArtist(a.getArtist());
        a.setTitle(a.getTitle());
        a.setReleaseDate(a.getReleaseDate());
        albumRepository.save(a);
        return a;
    }

    // get all albums by artist name
    public List<Album> findAlbumsByArtistName(String artistName) {


        return compareDatesService.sortReleaseDates(
                albumRepository.findAlbumsByArtistName(artistName),
                Album::getReleaseDate);

    }

    // Get ALBUM by title
    @Override
    public Album getAlbumByTitle(String albumTitle) {

        return albumRepository.findAlbumByTitleContainsIgnoreCase(albumTitle);
    }

    // GET LIST OF ALBUMS
    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }

    // FIND ALBUM BY ID
    public Optional<Album> albumById(int id) {
        return albumRepository.findById(id);
    }

    // SAVE ALBUM
    public Album saveAlbum(Album newAlbum) {
        return albumRepository.save(newAlbum);
    }

    // UPDATE ALBUM
    // SKA DENNA FINNAS, KAN MAN UPDATERA ETT GAMMALT ALBUM?? ELLER SKAPAS BARA EN NY VERSION?

    // DELETE ALBUM
    // returnera String för bekräftelse av delete, (TESTNING) TODO: <--------------------------------
    public String deleteAlbum(int id) {
        Optional<Album> optionalAlbum = albumRepository.findById(id);

        if (optionalAlbum.isPresent()) {
            albumRepository.deleteById(id);
            return "Album was deleted";
        }
        return "Album id does not exist.....";
    }
}