package com.tobiasjohansson.emusicms.services;

import com.tobiasjohansson.emusicms.models.Artist;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArtistServiceInterface {

    // *** GETS ***

    //get all artists (by alphabetical)
    List<Artist> getAllArtists();

    //get artist by id
    Optional<Artist> getArtistById(int id);

    //get artist by name
    List<Artist> getArtistsByName(String name);

    List<Artist> getArtistsByGenre(int id);
    // *** POSTS ***

    List<Artist> getArtistsByGenreName(String genreName);

    //create artist
    Artist createArtist(Artist artistToCreate);

    // *** PUTS ***

    //update artist
    Artist updateArtist(Artist artist, int id);

    // *** DELETE ***

    //Delete artist
    void deleteArtist(int id);


    /*   Artist findByArtist(String name);*/
}