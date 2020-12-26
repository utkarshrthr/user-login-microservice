package app.utk.ms;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserLoginApplication implements CommandLineRunner, ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(UserLoginApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

	}

	@Override
	public void run(String... args) throws Exception {

	}
}
