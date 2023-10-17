package com.tobiasjohansson.emusicms.services;

import com.tobiasjohansson.emusicms.models.Album;

import java.util.List;

public interface AlbumInterface {

    Album getAlbumByTitle(String albumTitle);

    List<Album> findAlbumsByArtistName(String artistName);

    Album findAlbumByTrackName(String trackName);

    Album updateAlbum(Album album, int id);
}


