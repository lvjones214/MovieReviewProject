package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.Models.MovieGenre;
import org.wecancodeit.reviews.Models.MovieReview;
import org.wecancodeit.reviews.storage.GenreStorage;
import org.wecancodeit.reviews.storage.MovieStorage;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class Populator implements CommandLineRunner {
    private GenreStorage genreStorage;
    private MovieStorage movieStorage;
    private HashtagRepository hashtagRepo;
    public Populator(GenreStorage genreStorage, MovieStorage movieStorage, HashtagRepository hashtagRepo) {
        this.genreStorage = genreStorage;
        this.movieStorage = movieStorage;
        this.hashtagRepo = hashtagRepo;
    }
    @Override
    public void run(String... args) throws Exception {
        MovieGenre action = new MovieGenre("Action");
        MovieGenre family = new MovieGenre("Family");
        MovieGenre comedy = new MovieGenre("Comedy");
        MovieGenre horror = new MovieGenre("Horror/Thriller");
        MovieGenre drama = new MovieGenre("Drama");
        MovieGenre documentary = new MovieGenre("Documentary");
        MovieGenre mystery = new MovieGenre("Mystery");
        MovieGenre romance = new MovieGenre("Romance");

        genreStorage.addGenre(action);
        genreStorage.addGenre(family);
        genreStorage.addGenre(comedy);
        genreStorage.addGenre(horror);
        genreStorage.addGenre(drama);
        genreStorage.addGenre(documentary);
        genreStorage.addGenre(mystery);
        genreStorage.addGenre(romance);
        MovieReview movieReviewToAdd1 = new MovieReview("Rush Hour", action, 1998, "PG-13", "5 Stars",  "Temp Description", "Temp Review");
        movieStorage.addReview(movieReviewToAdd1);
        MovieReview movieReviewToAdd2 = new MovieReview("Rush Hour 2", action, 1998, "PG-13", "5 Stars",  "Temp Description", "Temp Review");
        movieStorage.addReview(movieReviewToAdd2);
        hashtagRepo.save(new Hashtag("#mustsee", movieReviewToAdd1));
        hashtagRepo.save(new Hashtag("#hilarious", movieReviewToAdd1, movieReviewToAdd2));
    }



}
