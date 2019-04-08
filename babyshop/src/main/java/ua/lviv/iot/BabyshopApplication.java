package ua.lviv.iot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.lviv.iot.models.Chair;
import ua.lviv.iot.models.SafetyStandard;
import ua.lviv.iot.repository.ChairRepository;

@SpringBootApplication
public class BabyshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(BabyshopApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunnerChair(final ChairRepository chairRepository) {
		Chair chair = new Chair("Brand chair", "Chicco", 2999.99, SafetyStandard.EN_1400_2016,
				14, 30, 3, "National delievery", "Ukraine", 56,
				44, 42, 42, "wood");
		return (args) -> {
			chairRepository.save(chair);
		};
	}

}
