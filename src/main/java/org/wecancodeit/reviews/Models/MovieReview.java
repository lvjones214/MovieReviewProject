package org.wecancodeit.reviews.Models;

import org.wecancodeit.reviews.Hashtag;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class MovieReview {

    private String movieTitle;
    @ManyToOne
    private MovieGenre genre;
    private int yearReleased;
    private String mpaaRating;
    private String starRating;
    @ManyToMany(mappedBy = "movieReviews")
    private Collection<Hashtag> hashtagList;
    private String description;
    private String review;
    @Id
    @GeneratedValue
    private long id;

    protected MovieReview() {}

    public MovieReview(String movieTitle, MovieGenre genre, int yearReleased, String mpaaRating, String starRating, String description, String review) {
        this.movieTitle = movieTitle;
        this.genre = genre;
        this.yearReleased = yearReleased;
        this.mpaaRating = mpaaRating;
        this.starRating = starRating;
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

    public Collection<Hashtag> getHashtagList() {
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
        if (movieTitle != null ? !movieTitle.equals(that.movieTitle) : that.movieTitle != null) return false;
        if (genre != null ? !genre.equals(that.genre) : that.genre != null) return false;
        if (mpaaRating != null ? !mpaaRating.equals(that.mpaaRating) : that.mpaaRating != null) return false;
        if (starRating != null ? !starRating.equals(that.starRating) : that.starRating != null) return false;
        if (hashtagList != null ? !hashtagList.equals(that.hashtagList) : that.hashtagList != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        return review != null ? review.equals(that.review) : that.review == null;
    }

    @Override
    public int hashCode() {
        int result = movieTitle != null ? movieTitle.hashCode() : 0;
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + yearReleased;
        result = 31 * result + (mpaaRating != null ? mpaaRating.hashCode() : 0);
        result = 31 * result + (starRating != null ? starRating.hashCode() : 0);
        result = 31 * result + (hashtagList != null ? hashtagList.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (review != null ? review.hashCode() : 0);
        result = 31 * result + (int) (id ^ (id >>> 32));
        return result;
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        MovieReview that = (MovieReview) o;
//
//        if (yearReleased != that.yearReleased) return false;
//        if (id != that.id) return false;
//        if (!movieTitle.equals(that.movieTitle)) return false;
//        if (!genre.equals(that.genre)) return false;
//        if (!mpaaRating.equals(that.mpaaRating)) return false;
//        if (!starRating.equals(that.starRating)) return false;
//        if (!hashtagList.equals(that.hashtagList)) return false;
//        if (!description.equals(that.description)) return false;
//        return review.equals(that.review);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = movieTitle.hashCode();
//        result = 31 * result + genre.hashCode();
//        result = 31 * result + yearReleased;
//        result = 31 * result + mpaaRating.hashCode();
//        result = 31 * result + starRating.hashCode();
//        result = 31 * result + hashtagList.hashCode();
//        result = 31 * result + description.hashCode();
//        result = 31 * result + review.hashCode();
//        result = 31 * result + (int) (id ^ (id >>> 32));
//        return result;
//    }
}


