package com.tobiasjohansson.emusicms.services;

import com.tobiasjohansson.emusicms.components.CompareDates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;

@Service
public class CompareDatesService {

    @Autowired
    private CompareDates compareDates;

    public CompareDatesService(){}

    public <T> List<T> sortReleaseDates(List<T> obj, Function<T, String> dateExtractor) {
        compareDates.sortByDate(obj, dateExtractor);
        return obj;
    }
}