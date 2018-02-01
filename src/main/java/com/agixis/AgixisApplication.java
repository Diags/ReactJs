package com.agixis;

import com.agixis.idees.entities.Idea;
import com.agixis.idees.repository.IdeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;
import java.util.stream.Stream;

@SpringBootApplication
@ComponentScan(basePackages = {"com.agixis.idees.services"})
@EntityScan ("com.agixis.idees.entities")
@EnableJpaRepositories("com.agixis.idees.repository")
public class AgixisApplication implements CommandLineRunner{

	@Autowired
	private IdeaRepository ideaRepository;

	public static void main(String[] args) {
		SpringApplication.run(AgixisApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
	Stream.of("bonjour","comment").forEach(idea -> ideaRepository.save(new Idea(idea,"tot@gmail.com",idea)));
		ideaRepository.findAll().stream().forEach(System.out::println);

	}
}
