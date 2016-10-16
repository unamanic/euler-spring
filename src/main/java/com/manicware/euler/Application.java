package com.manicware.euler;

import com.manicware.euler.entity.Question;
import com.manicware.euler.repositoy.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.stream.Stream;

/**
 * Created by unamanic on 10/8/16.
 */
@SpringBootApplication
public class Application implements CommandLineRunner  {

    private final QuestionRepository questionRepository;

    @Autowired
    public Application(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);


    }

    @Override
    public void run(String... strings) throws Exception {
        questionRepository.deleteAll();

        Stream.of("Problem001",
                "Problem002",
                "Problem003",
                "Problem004",
                "Problem005",
                "Problem006",
                "Problem007",
                "Problem008",
                "Problem009",
                "Problem010")
                .forEach(p -> {
                    questionRepository.save(new Question(p, "#/problem/" + p.toLowerCase()));
                });
    };
}
