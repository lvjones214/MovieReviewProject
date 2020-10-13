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

    @Test
    public void movieGenreHasManyMoviesAndMoviesHasOneGenre() {
       MovieGenre testGenre = new MovieGenre("Action");
       movieGenreRepo.save(testGenre);
       MovieReview testReview1 = new MovieReview("Rush Hour", testGenre, 1998, "PG-13", "5 Stars", "Assign Hashtags", "Temp Description", "Temp Review");
       MovieReview testReview2 = new MovieReview("Rush Hour 2", testGenre, 2001, "PG", "3 Stars", "Assign Another Hashtags", "Temp Another Description", "Temp Another Review");
       movieReviewRepo.save(testReview1);
       movieReviewRepo.save(testReview2);
       testEntityManager.flush();
       testEntityManager.clear();
       MovieGenre retrievedGenre = movieGenreRepo.findById(testGenre.getId()).get();
       assertThat(retrievedGenre.getItems()).contains(testReview1, testReview2);

    }


}
