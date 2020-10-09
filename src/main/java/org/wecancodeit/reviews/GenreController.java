package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class GenreController {
private GenreStorage genreStorage;
    public GenreController(GenreStorage genreStorage) {
        this.genreStorage= genreStorage;

    }
    @RequestMapping({"", "/"})
    public String displayHomePage(Model model) {
        model.addAttribute("genres", genreStorage.retrieveAllGenres());
        return "home";
    }

    @RequestMapping("genre/{id}")
    public String displaySingleGenre(Model model, @PathVariable Long id){
        model.addAttribute("genre", genreStorage.retrieveGenreById(id));
        return "genre-template";
    }
}