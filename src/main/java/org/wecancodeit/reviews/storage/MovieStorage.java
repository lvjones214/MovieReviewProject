package org.wecancodeit.reviews.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.Models.MovieReview;
import org.wecancodeit.reviews.MovieReviewRepository;

import java.util.Collection;

@Service
public class MovieStorage {
private MovieReviewRepository movieReviewRepo;

    public MovieStorage(MovieReviewRepository movieReviewRepo) {
        this.movieReviewRepo = movieReviewRepo;

    }

    public void addReview(MovieReview reviewToAdd) {
        movieReviewRepo.save(reviewToAdd);
    }

    public Iterable<MovieReview>
    retrieveAllMovieReviews() {
        return movieReviewRepo.findAll();
    }

    public MovieReview
    retrieveMovieReviewById(Long id) {
        return movieReviewRepo.findById(id).get();
    }
}
