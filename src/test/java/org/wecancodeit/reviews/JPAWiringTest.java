package org.wecancodeit.reviews;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.wecancodeit.reviews.Models.MovieGenre;
import org.wecancodeit.reviews.Models.MovieReview;

import java.io.BufferedOutputStream;
import java.util.Properties;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
public class JPAWiringTest {
    @Autowired
    private MovieGenreRepository movieGenreRepo;
    @Autowired
    private MovieReviewRepository movieReviewRepo;
    @Autowired
    private TestEntityManager testEntityManager;
    @Autowired
    private HashtagRepository hashtagRepo;

    @Test
    public void movieGenreHasManyMoviesAndMoviesHasOneGenre() {
       MovieGenre testGenre = new MovieGenre("Action");
       movieGenreRepo.save(testGenre);
       MovieReview testReview1 = new MovieReview("Rush Hour", testGenre, 1998, "PG-13", "5 Stars",  "Temp Description", "Temp Review");
       MovieReview testReview2 = new MovieReview("Rush Hour 2", testGenre, 2001, "PG", "3 Stars", "Temp Another Description", "Temp Another Review");
       movieReviewRepo.save(testReview1);
       movieReviewRepo.save(testReview2);
       testEntityManager.flush();
       testEntityManager.clear();
       MovieGenre retrievedGenre = movieGenreRepo.findById(testGenre.getId()).get();
       assertThat(retrievedGenre.getItems()).contains(testReview1, testReview2);
    }
    @Test
    public void movieReviewHasManyHashtagsAndHashtagsHasManyReviews() {
        MovieGenre testGenre = new MovieGenre("Action");
        movieGenreRepo.save(testGenre);
        MovieReview testReview1 = new MovieReview("Rush Hour", testGenre, 1998, "PG-13", "5 Stars",  "Temp Description", "Temp Review");
        MovieReview testReview2 = new MovieReview("Rush Hour 2", testGenre, 2001, "PG", "3 Stars",  "Temp Another Description", "Temp Another Review");
        movieReviewRepo.save(testReview1);
        movieReviewRepo.save(testReview2);
        Hashtag testHashtag1 = new Hashtag("must see", testReview1);
        Hashtag testHashtag2 = new Hashtag("hilarious", testReview1, testReview2);
        Hashtag testHashtag3 = new Hashtag("critics choice");
        hashtagRepo.save(testHashtag1);
        hashtagRepo.save(testHashtag2);
        hashtagRepo.save(testHashtag3);
        testEntityManager.flush();
        testEntityManager.clear();
        MovieReview retrievedReview1 = movieReviewRepo.findById(testReview1.getId()).get();
        MovieReview retrievedReview2 = movieReviewRepo.findById(testReview2.getId()).get();
        assertThat(retrievedReview1.getHashtagList()).contains(testHashtag1, testHashtag2);
        assertThat(retrievedReview2.getHashtagList()).contains(testHashtag2);

//        MovieGenre retrievedGenre = movieGenreRepo.findById(testGenre.getId()).get();
//        assertThat(retrievedGenre.getItems()).contains(testReview1, testReview2);
    }





}
