/**
 * 
 */
package com.studiohub.user.application.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.util.StringUtils;

import com.studiohub.user.application.manager.UserManager;

/**
 * @author MXA86SG
 *
 */
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	UserManager userManager;
	
	@Autowired
	AuthenticationSuccessHandler successHandler;
	
	@Autowired
	AuthenticationFailureHandler failureHandler;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
				.antMatchers("/", "/home", "/css/**", "/login*").permitAll()
				.antMatchers("/user/**").hasAnyRole("USER")
				.anyRequest().authenticated()
				.and()
				
				.formLogin().loginPage("/login")
				.successHandler(successHandler)
				.failureHandler(failureHandler)
				.permitAll().and()
				
				.exceptionHandling().accessDeniedPage("/403").and()
				
				.logout().permitAll();
		
		http.csrf().disable();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userManager).passwordEncoder(getPasswordEncoder());
	}

	private PasswordEncoder getPasswordEncoder() {
		return new PasswordEncoder() {
			
			@Override
			public boolean matches(CharSequence rawPassword, String encodedPassword) {
				
				if(StringUtils.isEmpty(rawPassword)) {
					return false;
				}
				
				return rawPassword.equals(encodedPassword);
			}
			
			@Override
			public String encode(CharSequence rawPassword) {				
				return rawPassword.toString();
			}
		};
	}
	
	
	
	

}
