package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Component
public class Populator implements CommandLineRunner {
    private GenreStorage genreStorage;
    private MovieStorage movieStorage;
    public Populator(GenreStorage genreStorage, MovieStorage movieStorage) {
        this.genreStorage = genreStorage;
        this.movieStorage = movieStorage;
    }
    @Override
    public void run(String... args) throws Exception {
        Collection<MovieReview> actionMovies = new ArrayList<>();
        MovieGenre action = new MovieGenre("Action", actionMovies, 1L);
        MovieGenre family = new MovieGenre("Family", Collections.EMPTY_LIST, 2L);
        MovieGenre comedy = new MovieGenre("Comedy", Collections.EMPTY_LIST, 3L);
        MovieGenre horror = new MovieGenre("Horror/Thriller", Collections.EMPTY_LIST, 4L);
        MovieGenre drama = new MovieGenre("Drama", Collections.EMPTY_LIST, 5L);
        MovieGenre documentary = new MovieGenre("Documentary", Collections.EMPTY_LIST, 6L);
        MovieGenre mystery = new MovieGenre("Mystery", Collections.EMPTY_LIST, 7L);
        MovieGenre romance = new MovieGenre("Romance", Collections.EMPTY_LIST, 8L);

        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description", "Temp Review", 1L));
        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description", "Temp Review", 2L));
        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description", "Temp Review", 3L));
        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description", "Temp Review", 4L));
        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description", "Temp Review", 5L));
        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description", "Temp Review", 6L));
        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description", "Temp Review", 7L));
        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description", "Temp Review", 8L));
        genreStorage.addGenre(action);
        genreStorage.addGenre(family);
        genreStorage.addGenre(comedy);
        genreStorage.addGenre(horror);
        genreStorage.addGenre(drama);
        genreStorage.addGenre(documentary);
        genreStorage.addGenre(mystery);
        genreStorage.addGenre(romance);

        for(MovieReview movie : actionMovies){
            movieStorage.addReview(movie);
        }
    }



}
