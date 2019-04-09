package com.ranjit.config;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	// =========1========
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return provider;
	}
	
	// =========2========
	// @Bean
	// @Override
	// protected UserDetailsService userDetailsService() {
	// 	List<UserDetails> users = new ArrayList<>();
	// 	users.add(User.withDefaultPasswordEncoder().username("test").password("test").roles("USER").build());
	// 	return new InMemoryUserDetailsManager(users);
	// }
	// ========3=========
	// @Override
	// protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	//     auth.inMemoryAuthentication()
	//         // .withUser("admin").password("admin").roles("ADMIN")
	//         // .and()
	//         .withUser("test").password("test").roles("USER");
	// }
	 
	// @Override
	// protected void configure(HttpSecurity http) throws Exception {
		
	// 	http
	// 		.authorizeRequests().antMatchers("/").permitAll()
	// 		.and()
	// 		.authorizeRequests().antMatchers("/h2-console/**").permitAll()
	// 		.and()
	// 		.authorizeRequests().antMatchers("/api/**").permitAll()
	// 		.and()
	// 		.authorizeRequests().antMatchers("/login").permitAll()
	// 		;

	// 	http
	// 		.authorizeRequests()
	// 		.mvcMatchers("/home").hasRole("USER")
	// 		.anyRequest()
	// 		.fullyAuthenticated()
	// 		.and()
	// 		.httpBasic();

	// 	http.csrf().disable();
	// 	http.headers().frameOptions().disable();
	// }

	
}
