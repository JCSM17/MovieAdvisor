package com.jc.MovieAdvisor.dao;

import com.jc.MovieAdvisor.config.AppConfig;
import com.jc.MovieAdvisor.model.Film;
import jdk.jshell.execution.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UtilFilmFileReader {

    public static List<Film> readFile(final String path, final String separator, final String listSeparator) {

        //Bin para leer fichero

        List<Film> result = new ArrayList<>();
        //@formatter:off

        try {
        Files.lines(Paths.get(ResourceUtils.getFile(path).toURI()))
        .skip(1)
        .map(line -> {
            String[] values = line.split(separator);
            new Film(Long.parseLong(values[0]), values[1], values[2], Arrays.asList(values[3].split(listSeparator)));
        return null;}).collect(Collectors.toList());

        } catch (IOException e) {
            System.exit(-1);
        }
        //@formatter:on

        return result;
    }
}
