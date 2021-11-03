package com.Security.Assignment3;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	DataSource dataSource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// configures automatically to look at embedded data source (h2)
		auth.jdbcAuthentication().dataSource(dataSource);
		// query by username or based on specific filed like user type, etc
//				.usersByUsernameQuery("select username,password, enabled" + "from users" + " where username = ?")
//				.authoritiesByUsernameQuery("select username, authority" + " from authorities " + "where username = ?");

//				understanding default features for data source		
//				creates a default schema
//				.withDefaultSchema().withUser(User.withUsername("user").password("pass").roles("user"))
//				.withUser(User.withUsername("admin").password("pass").roles("admin"));
	}

	@Bean
	// provides password encoder
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				// checks for role that can be allowed to access
				.antMatchers("/admin").hasAnyRole("ADMIN").antMatchers("/user").hasAnyRole("USER", "ADMIN")
				// permit all others to access
				.antMatchers("/").permitAll()
				// specifies form based login
				.and().formLogin();
	}
}
