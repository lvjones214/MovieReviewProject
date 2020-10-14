package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.Models.MovieReview;

public interface MovieReviewRepository  extends CrudRepository<MovieReview, Long> {

}
