package com.tobiasjohansson.emusicms.repositories;

import com.tobiasjohansson.emusicms.models.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TrackRepository extends JpaRepository<Track,Integer> {
    Track findTrackByNameContainsIgnoreCase(@Param("trackName") String trackName);

    Track findTrackById(@Param("trackId") int trackId);

    @Query("SELECT a FROM Track a JOIN a.genre genre WHERE genre.genreName = :genreName")
    List<Track> findTrackByGenreContainingIgnoreCase(@Param("genreName")String genreName);

    @Query("SELECT a FROM Track a JOIN a.album album WHERE album.title = :albumName")
    List<Track> findTrackByAlbumContainingIgnoreCase(@Param("albumName")String albumName);

    @Query("SELECT a FROM Track a JOIN a.artist artist WHERE artist.name = :artistName")
    List<Track> findTrackByArtistContainingIgnoreCase(@Param("artistName")String artistName);

  //  List<MediaInterface> findAllByMediaType(MediaType mediaType);


}
