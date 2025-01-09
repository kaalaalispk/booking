package com.pk.booking.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
public class BookingConfiguration {
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	@Bean
	ModelMapper mapper() {
		return new ModelMapper();
	}


}
