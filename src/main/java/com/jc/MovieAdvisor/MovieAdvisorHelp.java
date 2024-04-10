package com.jc.MovieAdvisor;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

@Component
public class MovieAdvisorHelp {

    private String help;

    @PostConstruct
    public void init() {
        try {
            // @formatter:off
            help = Files
                    .lines(Paths.get(ResourceUtils.getFile("classpath:ayuda.txt").toURI()))
                    .collect(Collectors.joining("\n"));
            // @formatter:on
        } catch (IIOException e) {
            System.err.println("Error cargando el texto de ayuda");
            System.exit(-1);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getHelp() {
        return help;
    }

}
