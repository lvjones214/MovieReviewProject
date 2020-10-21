package org.wecancodeit.reviews.Controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wecancodeit.reviews.Hashtag;
import org.wecancodeit.reviews.Models.MovieGenre;
import org.wecancodeit.reviews.Models.MovieReview;
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

    @GetMapping("/reviews/{id}")

    public String showMovieReview(Model model, @PathVariable long id){
//        log.info("The id is: " + id);
//        log.info(movieStorage.retrieveMovieReviewById(id).toString());
        model.addAttribute("movieReview", movieStorage.retrieveMovieReviewById(id));  
        return "reviewtemplates";
    }
    @PostMapping("/moviereview")
    public String addMovieReview(@RequestParam String movieName, @RequestParam String genreName, @RequestParam int yearReleased,@RequestParam String mpaaRating,@RequestParam String starRating,@RequestParam String hashtagName,@RequestParam String imgUrlName,@RequestParam String movieDescriptionName,@RequestParam String movieReviewName){
        MovieReview movieReviewToAdd = new MovieReview(movieName, genreName, yearReleased, mpaaRating, starRating, movieDescriptionName, movieReviewName);
   // should be genre object for genre name
        // figure out how to add img URL and hashtag to movie review object.
        hashtagStorage.addHashtag(hashtagToAdd);
        return "redirect:/reviews/"+reviewId;
    }

}
