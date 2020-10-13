package org.wecancodeit.reviews.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class MovieReview {

    private String movieTitle;
    @ManyToOne
    private MovieGenre genre;
    private int yearReleased;
    private String mpaaRating;
    private String starRating;
    private String hashtagList;
    private String description;
    private String review;
    @Id
    @GeneratedValue
    private long id;

    protected MovieReview() {}

    public MovieReview(String movieTitle, MovieGenre genre, int yearReleased, String mpaaRating, String starRating, String hashtagList, String description, String review) {
        this.movieTitle = movieTitle;
        this.genre = genre;
        this.yearReleased = yearReleased;
        this.mpaaRating = mpaaRating;
        this.starRating = starRating;
        this.hashtagList = hashtagList;
        this.description = description;
        this.review = review;

    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public String getStarRating() {
        return starRating;
    }

    public String getHashtagList() {
        return hashtagList;
    }

    public String getDescription() {
        return description;
    }

    public String getReview() {
        return review;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MovieReview{" +
                "movieTitle='" + movieTitle + '\'' +
                ", genre=" + genre +
                ", yearReleased=" + yearReleased +
                ", mpaaRating='" + mpaaRating + '\'' +
                ", starRating='" + starRating + '\'' +
                ", hashtagList='" + hashtagList + '\'' +
                ", description='" + description + '\'' +
                ", review='" + review + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MovieReview that = (MovieReview) o;

        if (yearReleased != that.yearReleased) return false;
        if (id != that.id) return false;
        if (!movieTitle.equals(that.movieTitle)) return false;
        if (!genre.equals(that.genre)) return false;
        if (!mpaaRating.equals(that.mpaaRating)) return false;
        if (!starRating.equals(that.starRating)) return false;
        if (!hashtagList.equals(that.hashtagList)) return false;
        if (!description.equals(that.description)) return false;
        return review.equals(that.review);
    }

    @Override
    public int hashCode() {
        int result = movieTitle.hashCode();
        result = 31 * result + genre.hashCode();
        result = 31 * result + yearReleased;
        result = 31 * result + mpaaRating.hashCode();
        result = 31 * result + starRating.hashCode();
        result = 31 * result + hashtagList.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + review.hashCode();
        result = 31 * result + (int) (id ^ (id >>> 32));
        return result;
    }
}


