package com.jc.MovieAdvisor.service;

import com.jc.MovieAdvisor.model.Film;

import java.util.Collection;

public interface FilmQueryService {

    public Collection<Film> exec();

    public FilmQueryService anyGenre(String... genres);

    public FilmQueryService allGenres(String... genres);

    public FilmQueryService year(String year);

    public FilmQueryService titleContains(String title);

    FilmQueryService betweenYears(String from, String to);
}
