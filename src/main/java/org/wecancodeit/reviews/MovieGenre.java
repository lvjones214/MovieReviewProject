package org.wecancodeit.reviews;

import java.util.Collection;

public class MovieGenre {
    private String name;
    private Collection<MovieReview> items;
    private long id;

    public MovieGenre(String name, Collection<MovieReview> items, long id) {
        this.id = id;
        this.name = name;
        this.items = items;
    }

    public long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<MovieReview> getItems() {
        return items;
    }
}
