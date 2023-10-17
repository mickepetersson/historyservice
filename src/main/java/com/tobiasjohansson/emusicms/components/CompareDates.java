package com.tobiasjohansson.emusicms.components;


import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.function.Function;

@Component
public class CompareDates {

    public CompareDates() {
    }

    public <T> void sortByDate(List<T> objects, Function<T, String> releaseDateExtractor) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        objects.sort((obj1, obj2) -> {
            try {
                String dateStr1 = releaseDateExtractor.apply(obj1);
                String dateStr2 = releaseDateExtractor.apply(obj2);

                LocalDate date1 = LocalDate.parse(dateStr1, formatter);
                LocalDate date2 = LocalDate.parse(dateStr2, formatter);
                return date2.compareTo(date1);
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        });
    }


}
