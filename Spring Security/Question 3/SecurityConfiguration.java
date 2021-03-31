package com.capgemini.SpringSecurity;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Autowired
	DataSource dataSource;
	
	// authentication using embedded database H2
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
		auth.jdbcAuthentication().dataSource(dataSource)
								 .withDefaultSchema()
								 .withUser(User.withUsername("akshat").password("akshat").roles("USER"))
								 .withUser(User.withUsername("admin").password("admin").roles("ADMIN"))
								 ;
	}

	
	// authorization
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		// setting the authorization for the roles USER and ADMIN 
				http.authorizeRequests()
					.antMatchers("/admin").hasRole("ADMIN")
					.antMatchers("/user").hasAnyRole("USER","ADMIN")
					.antMatchers("/").permitAll()
					.and().formLogin();
	}
	
	@Bean
	public PasswordEncoder getEncoder() {
		
		return NoOpPasswordEncoder.getInstance();
	}
	
	
}
