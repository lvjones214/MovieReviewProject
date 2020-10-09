package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Component
public class Populator implements CommandLineRunner {
    private GenreStorage genreStorage;
    public Populator(GenreStorage genreStorage) {
        this.genreStorage = genreStorage;
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

        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description", "Temp Review"));
        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description", "Temp Review"));
        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description", "Temp Review"));
        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description", "Temp Review"));
        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description", "Temp Review"));
        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description", "Temp Review"));
        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description", "Temp Review"));
        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description", "Temp Review"));
        genreStorage.addGenre(action);
        genreStorage.addGenre(family);
        genreStorage.addGenre(comedy);
        genreStorage.addGenre(horror);
        genreStorage.addGenre(drama);
        genreStorage.addGenre(documentary);
        genreStorage.addGenre(mystery);
        genreStorage.addGenre(romance);
    }



}
