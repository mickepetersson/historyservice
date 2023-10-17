package com.tobiasjohansson.emusicms.services;


import com.tobiasjohansson.emusicms.models.MediaType;
import com.tobiasjohansson.emusicms.models.Track;
import com.tobiasjohansson.emusicms.repositories.ArtistRepository;
import com.tobiasjohansson.emusicms.repositories.GenreRepository;
import com.tobiasjohansson.emusicms.repositories.MediaTypeRepository;
import com.tobiasjohansson.emusicms.repositories.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
public class MediaServices  {

    @Autowired
    private TrackRepository trackRepository;

    @Autowired
    private ArtistRepository artistRepository;

    @Autowired
    private MediaTypeRepository mediaTypeRepository;

    @Autowired
    private GenreRepository genreRepository;
/*
    public List<MediaInterface> getAllMedia() {
        List<Track> allTracks = trackRepository.findAll();
        List<Video> allVideos = videoRepository.findAll();

        Set<MediaInterface> set = new LinkedHashSet<>(allTracks);
        set.addAll(allVideos);
        ArrayList<MediaInterface> allMedia = new ArrayList<>(set);
        return allMedia;
    }

    public List<MediaInterface> allMediaByMediaType(String type) {

        MediaType mediaType = mediaTypeRepository.findMediaTypeByType(type);
        Set<MediaInterface> set = new LinkedHashSet<>();

        List<MediaInterface> artistCC = artistRepository.findAllByMediaType(mediaType);
        List<MediaInterface> podHostCC = podhostRepository.findAllByMediaType(mediaType);
        List<MediaInterface> videoMI = videoRepository.findAllByMediaType(mediaType);

        set.addAll(artistCC);
        set.addAll(podHostCC);
        set.addAll(videoMI);

        ArrayList<MediaInterface> allMedia = new ArrayList<>(set);
        return allMedia;
    }
*/
}
