package com.de.app;

import com.de.app.model.User;
import com.de.app.repo.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootMysqlDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMysqlDockerApplication.class, args);
	}

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init(){
        userRepository.save(new User("Nikhil","nikhil@gmail.com"));
        userRepository.save(new User("Raj","raj@gmail.com"));
        userRepository.save(new User("Komal","komal@gmail.com"));
        userRepository.save(new User("Komal","komal123@gmail.com"));
        userRepository.save(new User("Nikhil","nikhil123@gmail.com"));
        userRepository.save(new User("Raj","raj123@gmail.com"));


    }
}
