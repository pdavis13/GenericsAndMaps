package common;

import java.util.Comparator;

public class MovieByID implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {
        return Integer.toString(m1.getMovieID()).compareTo(Integer.toString(m2.getMovieID()));
    }
}
