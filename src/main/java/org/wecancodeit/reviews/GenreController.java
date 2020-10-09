package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class GenreController {
    Map<Long, MovieGenre> genreList = new HashMap<>();

    public GenreController() {


        Collection<MovieReview> actionMovies = new ArrayList<>();

        MovieGenre action = new MovieGenre("Action", actionMovies, 1L);
        MovieGenre family = new MovieGenre("Family", Collections.EMPTY_LIST, 2L);
        MovieGenre comedy = new MovieGenre("Comedy", Collections.EMPTY_LIST, 3L);
        MovieGenre horror = new MovieGenre("Horror/Thriller", Collections.EMPTY_LIST, 4L);
        MovieGenre drama = new MovieGenre("Drama", Collections.EMPTY_LIST, 5L);
        MovieGenre documentary = new MovieGenre("Documentary", Collections.EMPTY_LIST, 6L);
        MovieGenre mystery = new MovieGenre("Mystery", Collections.EMPTY_LIST, 7L);
        MovieGenre romance = new MovieGenre("Romance", Collections.EMPTY_LIST, 8L);

        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description","Temp Review"));
        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description","Temp Review"));
        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description","Temp Review"));
        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description","Temp Review"));
        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description","Temp Review"));
        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description","Temp Review"));
        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description","Temp Review"));
        actionMovies.add(new MovieReview("Rush Hour", action.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description","Temp Review"));
        genreList.put(action.getId(), action);
        genreList.put(family.getId(), family);
        genreList.put(comedy.getId(), comedy);
        genreList.put(horror.getId(), horror);
        genreList.put(drama.getId(), drama);
        genreList.put(documentary.getId(), documentary);
        genreList.put(mystery.getId(), mystery);
        genreList.put(romance.getId(), romance);
    }

    @RequestMapping({"", "/"})
    public String displayHomePage(Model model) {
        model.addAttribute("genres", genreList.values());
        return "home";
    }

    @RequestMapping("genre/{id}")
    public String displaySingleGenre(Model model, @PathVariable Long id){
        model.addAttribute("genre", genreList.get(id));
        return "genre-template";
    }

}