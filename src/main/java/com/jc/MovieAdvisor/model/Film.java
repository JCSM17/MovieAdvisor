package com.jc.MovieAdvisor.model;

import java.util.List;
import java.util.Objects;

public class Film {

    private long id;
    private String title;
    private String year;
    private List<String> genres;

    public Film() {
    }

    public Film(long id, String title, String year, List<String> genres) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genres = genres;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return id == film.id && Objects.equals(title, film.title) && Objects.equals(year, film.year) && Objects.equals(genres, film.genres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, year, genres);
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", genres=" + genres +
                '}';
    }
}
