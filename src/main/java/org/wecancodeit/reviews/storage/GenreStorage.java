package org.wecancodeit.reviews.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.Models.MovieGenre;
import org.wecancodeit.reviews.MovieGenreRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class GenreStorage {
//    Map<Long, MovieGenre> genreList = new HashMap<>();

    private MovieGenreRepository movieGenreRepo;

    public GenreStorage(MovieGenreRepository movieGenreRepo) {
        this.movieGenreRepo = movieGenreRepo;
    }

    public void addGenre(MovieGenre genreToAdd) {
        movieGenreRepo.save(genreToAdd);
    }

    public Iterable<MovieGenre>
    retrieveAllGenres() {
        return movieGenreRepo.findAll();
    }

    public MovieGenre
    retrieveGenreById(Long id) {
        Optional<MovieGenre> retrievedMovieGenreOptional = movieGenreRepo.findById(id);
        if (retrievedMovieGenreOptional.isPresent()) {
            MovieGenre retrievedMovieGenre = retrievedMovieGenreOptional.get();
            return retrievedMovieGenre;
        } else {
            return null;
        }
    }

}

