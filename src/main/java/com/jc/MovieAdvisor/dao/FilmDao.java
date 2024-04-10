package com.jc.MovieAdvisor.dao;

import com.jc.MovieAdvisor.model.Film;

import java.util.Collection;

public interface FilmDao {

    public Film findById(long id);

    public Collection<Film> findAll();

    public void insert(Film film);

    public void edit(Film film);

    public void delete(long id);

}
