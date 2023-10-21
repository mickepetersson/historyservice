package com.mikaelpetersson.ehistoryms.models;

import jakarta.persistence.*;

@Entity
public class MediaHistory extends History {



    public MediaHistory() {
    }

    public MediaHistory(int id, String media, MediaType mediaType, String artist, User user) {
        super(id, media, mediaType, artist, user);
    }

    @Override
    public MediaType getMediaType() {
        return super.getMediaType();
    }

    @Override
    public void setMediaType(MediaType mediaType) {
        super.setMediaType(mediaType);
    }

    @Override
    public String getMedia() {
        return super.getMedia();
    }

    @Override
    public void setMedia(String media) {
        super.setMedia(media);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getArtist() {
        return super.getArtist();
    }

    @Override
    public void setArtist(String artist) {
        super.setArtist(artist);
    }

    @Override
    public User getUser() {
        return super.getUser();
    }

    @Override
    public void setUser(User user) {
        super.setUser(user);
    }
}
