package com.tobiasjohansson.emusicms.repositories;

import com.tobiasjohansson.emusicms.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Integer> {

    Album findAlbumByTitleContainsIgnoreCase(@Param("albumTitle") String albumTitle);

    @Query("SELECT a FROM Album a JOIN a.artist artist WHERE artist.name = :artistName")
    List<Album> findAlbumsByArtistName(@Param("artistName") String artistName);
    @Query("SELECT a FROM Album a JOIN a.trackList track WHERE track.name = :trackName")
    Album findAlbumByTrackName(@Param("trackName") String trackName);


}