package org.wecancodeit.reviews.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class MovieGenre {
    private String name;
    @OneToMany (mappedBy = "genre")
    private Collection<MovieReview> items;
    @Id
    @GeneratedValue
    private long id;

protected MovieGenre() {}

    public MovieGenre(String name) {
        this.name = name;

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

    @Override
    public String toString() {
        return "MovieGenre{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MovieGenre that = (MovieGenre) o;

        if (id != that.id) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (int) (id ^ (id >>> 32));
        return result;
    }
}
