package com.social.media.application.socialMediaApp.security;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {
	
	@Bean
	public SecurityFilterChain filterchain(HttpSecurity http) throws Exception {
		
		// all requests should be authenticated
		http.authorizeHttpRequests(
				auth-> auth.anyRequest().authenticated()
			);
		
		// if request in not authenticated , a web page is shown
		http.httpBasic(withDefaults());
		
		// CSRF -> PUT, POST
		http.csrf().disable();
		return http.build();
		
	}

}
