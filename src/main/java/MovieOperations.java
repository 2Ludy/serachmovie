import java.util.*;

public class MovieOperations {
    private List<MovieDTO> movieList;

    public MovieOperations() {
        this.movieList = new ArrayList<>();
    }

    public void addMovie(MovieDTO movie) {
        movieList.add(movie);
    }

    public void printMovies() {
        movieList.sort(Comparator.comparingDouble(MovieDTO::getRating).reversed());
        for (MovieDTO movie : movieList) {
            System.out.println(movie);
        }
    }

    public void searchMoviesByGenre(int genre) {
        for (MovieDTO movie : movieList) {
            if (movie.getGenre() == genre) {
                System.out.println(movie);
            }
        }
    }

    public List<MovieDTO> getMovieList() {
        return movieList;
    }
}