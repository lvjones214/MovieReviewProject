package org.wecancodeit.reviews;

public class MovieReview {

    private String movieTitle;
    private String genre;
    private int yearReleased;
    private String mpaaRating;
    private String starRating;
    private String hashtagList;
    private String description;
    private String review;
    private long id;

    public MovieReview(String movieTitle, String genre, int yearReleased, String mpaaRating, String starRating, String hashtagList, String description, String review, long id) {
        this.movieTitle = movieTitle;
        this.genre = genre;
        this.yearReleased = yearReleased;
        this.mpaaRating = mpaaRating;
        this.starRating = starRating;
        this.hashtagList = hashtagList;
        this.description = description;
        this.review = review;
        this.id = id;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getGenre() {
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

    }


