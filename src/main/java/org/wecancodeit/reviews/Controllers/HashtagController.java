package org.wecancodeit.reviews.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wecancodeit.reviews.Hashtag;
import org.wecancodeit.reviews.storage.HashtagStorage;
import org.wecancodeit.reviews.storage.MovieStorage;

@Controller
public class HashtagController {
    private HashtagStorage hashtagStorage;
    private MovieStorage movieStorage;
    public HashtagController(HashtagStorage hashtagStorage, MovieStorage movieStorage) {
        this.hashtagStorage = hashtagStorage;
        this.movieStorage = movieStorage;
    }


    @RequestMapping("/Hashtag/{id}")
    public String displayHashtags(Model model, @PathVariable long id) {
        model.addAttribute("hashtags", hashtagStorage.retrieveHashtagById(id));
return "Hashtagtemplate";
    }
  @PostMapping("/hashtag")

  public String addHashtag(@RequestParam String hashtagName ,@RequestParam long reviewId ){
       Hashtag hashtagToAdd = new Hashtag(hashtagName, movieStorage.retrieveMovieReviewById(reviewId));
      hashtagStorage.addHashtag(hashtagToAdd);

      return "redirect:/reviews/"+reviewId;

  }

}

