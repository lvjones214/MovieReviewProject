package org.wecancodeit.reviews.Controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wecancodeit.reviews.Models.MovieReview;
import org.wecancodeit.reviews.storage.GenreStorage;
import org.wecancodeit.reviews.storage.MovieStorage;

@Controller
public class MovieReviewController {

    Logger log = LoggerFactory.getLogger(MovieReviewController.class);
    private MovieStorage movieStorage;
    private GenreStorage genreStorage;
public MovieReviewController(MovieStorage movieStorage, GenreStorage genreStorage) {
    this.movieStorage= movieStorage;
    this.genreStorage = genreStorage;
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
    public String addMovieReview(@RequestParam String movieName, @RequestParam long genreId, @RequestParam int yearReleased,@RequestParam String mpaaRating,@RequestParam String starRating,@RequestParam String hashtagName,@RequestParam String imgUrlName,@RequestParam String movieDescriptionName,@RequestParam String movieReviewName){
        MovieReview movieReviewToAdd = new MovieReview(movieName, genreStorage.retrieveGenreById(genreId), yearReleased, mpaaRating, starRating, movieDescriptionName, movieReviewName, imgUrlName);
        movieStorage.addReview(movieReviewToAdd);
        return "redirect:/reviews/"+movieReviewToAdd.getId();
    }

    @RequestMapping("/edit-review/{id}")
    public String editMovieReview(Model model, @PathVariable long id){
        model.addAttribute("movieReview", movieStorage.retrieveMovieReviewById(id));
        return "editreviewtemplate";
    }

    @PostMapping("/changedescription")
    public String changeMovieDescription(@RequestParam String newDescription, @RequestParam long reviewId){
        MovieReview movieReviewToChange = movieStorage.retrieveMovieReviewById(reviewId);
        movieReviewToChange.setDescription(newDescription);
        log.info(movieReviewToChange.getDescription()+" | "+newDescription);
        return "redirect:/reviews/"+reviewId;
    }

    @PostMapping("/changereview")
    public String changeMovieReview(@RequestParam String newReview, @RequestParam long reviewId){
        movieStorage.retrieveMovieReviewById(reviewId).setReview(newReview);
        return "redirect:/reviews/"+reviewId;
    }

}
