package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<String> findMovieByTime(LocalDateTime time) {
        List<String> playInSelectedTime = new ArrayList<>();
        for (Movie movie: movies) {
            if (movie.getTimes().contains(time)) {
                playInSelectedTime.add(movie.getTitle());
            }
        }
        return playInSelectedTime;
    }
}
