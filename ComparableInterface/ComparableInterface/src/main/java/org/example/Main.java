package org.example;

import java.util.ArrayList;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Doremon",8,2020));
        movieList.add(new Movie("Doremon2",8,2001));
        movieList.add(new Movie("Doremon3",8,2010));

        Collections.sort(movieList);

        System.out.println("Movies after sorting...");

        for (Movie movie:movieList){
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear() + " " );
        }
    }
}
