package com.stackroute.domain;

import com.stackroute.domain.Actor;
import org.springframework.beans.factory.annotation.Autowired;

public class Movie
{

    private String movieName;
    private String director;
    private Actor actor;

    public Movie() { }

    public Movie(String movieName, String director, Actor actor1) {
        this.movieName = movieName;
        this.director = director;
        this.actor = actor1;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", director='" + director + '\'' +
                ", actor=" + actor +
                '}';
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}