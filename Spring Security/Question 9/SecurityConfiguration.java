package io.javabrains.springsecurityjdbc;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	/*
	 * @Autowired DataSource dataSource;
	 */
	/*
	 * // to create a service for further OPs with hard-coded user details
	 * 
	 * @Autowired UserDetailsService userDetailsService;
	 */
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		
		auth.inMemoryAuthentication().withUser("akshat")
		.password("akshat")
        .roles("USER")
        .and()
        .withUser("admin")
        .password("$2a$09$9lq11vs9kR8HRp7cdRjCQuVNatbxcKCDd5bgS.HIh/jgh/7o5QM/q")
        .roles("ADMIN");
		//auth.userDetailsService(userDetailsService);
	}

	
	// authorization
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		// setting the authorization for the roles USER and ADMIN 
		
		  http.authorizeRequests() .antMatchers("/admin").hasRole("ADMIN")
		  						   .antMatchers("/user").hasAnyRole("USER","ADMIN")
		  						   .antMatchers("/").permitAll()
		  						   .and()
		  						   .formLogin() ;
		 
	}
	
	
	


	@Bean
	public PasswordEncoder getEncoder() {
		
		return new BCryptPasswordEncoder();
	}
	
	
}
