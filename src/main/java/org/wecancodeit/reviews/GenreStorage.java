package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class GenreStorage {
    Map<Long, MovieGenre> genreList = new HashMap<>();

    public GenreStorage() {
    }

    public void addGenre(MovieGenre genreToAdd) {
        genreList.put(genreToAdd.getId(), genreToAdd);
    }

    public Collection<MovieGenre>
    retrieveAllGenres() {
        return genreList.values();
    }

    public MovieGenre
    retrieveGenreById(Long id) {
        return genreList.get(id);
    }
}
