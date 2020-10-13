package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.Models.MovieGenre;

public interface MovieGenreRepository extends CrudRepository<MovieGenre, Long>  {
}
