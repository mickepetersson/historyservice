package com.tobiasjohansson.emusicms.services;


import com.tobiasjohansson.emusicms.models.Track;

import java.util.List;

public interface TrackInterface {

    Track getTrackByName(String trackName);

    Track updateTracks(Track track, int id);

    List<Track> getTrackByArtist(String artistName);
}
