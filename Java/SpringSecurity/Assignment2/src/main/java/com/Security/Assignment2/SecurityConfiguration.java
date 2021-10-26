package com.Security.Assignment2;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("naveen").password("1234").roles("admin").and().withUser("foo")
				.password("foo").roles("user");
	}

	@Bean
	// provides password encoder
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				// custom validation: checks for admin role to allow access
				.antMatchers("/admin").hasAnyRole("admin")
				// custom validation: checks for user role to allow access
				.antMatchers("/user").hasAnyRole("user", "admin")
				// permit all others to access
				.antMatchers("/").permitAll()
				// specifies form based login
				.and().formLogin();
	}
}
