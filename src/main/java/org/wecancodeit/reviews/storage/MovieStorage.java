package org.wecancodeit.reviews.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.Models.MovieReview;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class MovieStorage {
    Map<Long, MovieReview> movieReviewList = new HashMap<>();

    public MovieStorage() {

    }

    public void addReview(MovieReview reviewToAdd) {
        movieReviewList.put(reviewToAdd.getId(), reviewToAdd);
    }

    public Collection<MovieReview>
    retrieveAllMovieReviews() {
        return movieReviewList.values();
    }

    public MovieReview
    retrieveMovieReviewById(Long id) {
        return movieReviewList.get(id);
    }
}
