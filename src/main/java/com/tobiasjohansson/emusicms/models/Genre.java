package com.tobiasjohansson.emusicms.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "genres")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genre_id")
    private int id;

    @Column(name = "genre_name")
    String genreName;

    @ManyToMany
    @JoinTable(
            name = "genre_media_type",
            joinColumns = @JoinColumn(name = "genre_id"),
            inverseJoinColumns = @JoinColumn(name = "media_type_id")
    )
    private List<MediaType> mediaTypes;

    /*
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "albumId")
    private Album album;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "artistId")
    private Artist artist;
 */

    public Genre() {
    }

    public Genre(int id, String genreName) {
        this.id = id;
        this.genreName = genreName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

}
