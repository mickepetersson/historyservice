package com.tobiasjohansson.emusicms.repositories;

import com.tobiasjohansson.emusicms.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {

    List<Artist> findArtistByNameContainingIgnoreCase(@Param("artist") String artist);
    /*    List<Artist> findArtistByGenre(int id);*/
    List<Artist> findArtistsByGenre_Id(@Param("id") int id);

//    List<MediaInterface> findAllByMediaType(MediaType mediaType);
}
