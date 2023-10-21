package com.mikaelpetersson.ehistoryms.models;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "media_name", length = 500)
    private String media;

    @ManyToOne
    @JoinColumn(name = "media_type_id")
    private MediaType mediaType;

    @Column(name = "artist")
    private String artist;

@ManyToOne
@JoinColumn(name = "user_id")
private User user;

    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public History() {
    }

    public History(int id, String media, MediaType mediaType, String artist, User user) {
        this.id = id;
        this.media = media;
        this.mediaType = mediaType;
        this.artist = artist;
        this.user = user;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

