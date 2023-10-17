package com.tobiasjohansson.emusicms.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "albums")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "album_title")
    private String title;

    @Column(name = "release_date")
    private String releaseDate;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
    private List<Track> trackList = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "artist_id")
    private Artist artist;
    public Album() {
    }

    public Album(String title) {
        this.title = title;
    }

    public Album(String title, List<Track> trackList) {
        this.title = title;
        this.trackList = trackList;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Track> getTrackList() {
        return trackList;
    }

    public void setTrackList(Track track) {
        this.trackList.add(track);
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
