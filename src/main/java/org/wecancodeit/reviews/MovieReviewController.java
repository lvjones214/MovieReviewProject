package org.wecancodeit.reviews;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;

@Controller
public class MovieReviewController {


    private MovieStorage movieStorage;
public MovieReviewController(MovieStorage movieStorage) {
    this.movieStorage= movieStorage;
}
//    @RequestMapping("sample-movie-review")
//    public String showOneMovieReview(Model model){
//        MovieGenre sampleMovieGenre = new MovieGenre("Comedy", Collections.EMPTY_LIST, 1L);
//        MovieReview sampleMovieReview = new MovieReview("Rush Hour", sampleMovieGenre.getName(), 1998, "PG-13", "5 Stars", "Assign Hashtags", "","");
//
//        model.addAttribute("movieReview", sampleMovieReview);
//
//        return "reviewtemplates";
//    }
    @RequestMapping("reviews/{id}") 
    public String showMovieReview(Model model, @PathVariable Long id){
        model.addAttribute("movieReview", movieStorage.retrieveMovieReviewById(id));  
        return "reviewtemplates";
    }

}
