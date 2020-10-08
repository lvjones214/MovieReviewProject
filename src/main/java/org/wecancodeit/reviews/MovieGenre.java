package org.wecancodeit.reviews;

import java.util.Collection;

public class MovieGenre {
    private String name;
    private Collection<MovieReview> items;

    public MovieGenre(String name, Collection<MovieReview> items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public Collection<MovieReview> getItems() {
        return items;
    }
}
