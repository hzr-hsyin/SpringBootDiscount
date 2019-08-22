package com.huseyin.DiscountCalculator;

import com.huseyin.DiscountCalculator.Entities.Ticket;
import com.huseyin.DiscountCalculator.Repository.TicketRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class DiscountCalculatorApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DiscountCalculatorApplication.class, args);
	}


	/* KOD URETİP KAYIT ETME
	@Bean
	CommandLineRunner runner(TicketRepository repository){
		return args -> {
			repository.save(new Ticket(createRandomCode()));
		};

	}
*/


}
