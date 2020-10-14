package org.wecancodeit.reviews.Controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.Models.MovieGenre;
import org.wecancodeit.reviews.storage.MovieStorage;

@Controller
public class MovieReviewController {

//    Logger log = LoggerFactory.getLogger(MovieReviewController.class);
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
    @RequestMapping("/reviews/{id}")
    public String showMovieReview(Model model, @PathVariable long id){
//        log.info("The id is: " + id);
//        log.info(movieStorage.retrieveMovieReviewById(id).toString());
        model.addAttribute("movieReview", movieStorage.retrieveMovieReviewById(id));  
        return "reviewtemplates";
    }

}
