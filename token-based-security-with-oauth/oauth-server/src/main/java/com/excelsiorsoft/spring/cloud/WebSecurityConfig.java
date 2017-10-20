package com.excelsiorsoft.spring.cloud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManager();	
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user1").password("password1").roles("USER")
		.and().withUser("admin").password("password2").roles("ADMIN");
	}
	
@Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests().antMatchers("/**").permitAll().and()
        // default protection for all resources (including /oauth/authorize)
            .authorizeRequests()
                .anyRequest().hasRole("USER");
        // ... more configuration, e.g. for form login
   }
 	
}
