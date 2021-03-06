package ua.lviv.iot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.lviv.iot.models.*;
import ua.lviv.iot.repository.ChairRepository;
import ua.lviv.iot.repository.DiapersRepository;

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
		return (args) -> chairRepository.save(chair);
	}

	@Bean
	public CommandLineRunner commandLineRunnerDiapers(final DiapersRepository diapersRepository) {
		Diapers diapers = new Diapers("Diapers active baby", "Pampers", 899.99,
				SafetyStandard.EN_1400_2016, 40, 0, 3, "Pampers logistics",
				"China", 174, DiapersSize.MEDIUM, KidWeight.FROM_4_TO_9);
		return (args -> diapersRepository.save(diapers));
	}

}
