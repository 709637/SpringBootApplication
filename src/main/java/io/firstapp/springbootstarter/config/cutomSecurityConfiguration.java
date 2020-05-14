package io.firstapp.springbootstarter.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class cutomSecurityConfiguration extends WebSecurityConfigurerAdapter{
	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//		
//		auth.inMemoryAuthentication()
//		    .withUser("vipul")
//		    .password("vipul")
//		    .roles("USER")
//		    .and()
//		    .withUser("Rahul")
//		    .password("Rahul")
//		    .roles("ADMIN");
//	}
//	
//	@Bean
//	public PasswordEncoder getPasswordEncode() {
//		return  NoOpPasswordEncoder.getInstance();
//	}
	
	@Autowired
	MyUSerDetailsService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.userDetailsService(userDetailsService);
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
			// TODO Auto-generated method stub
			http.authorizeRequests()
			    .antMatchers("/admin").access("ADMIN")
			    .antMatchers("./user").access("USER")
			    .antMatchers("/").permitAll()
			    .and().formLogin();
		}
	
	@Bean
	public PasswordEncoder getPasswordEncode() {
		return  NoOpPasswordEncoder.getInstance();
	}
	
}
