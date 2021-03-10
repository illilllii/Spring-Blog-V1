package com.cos.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration // IoC 등록
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	// IoC등록만 하면 AuthenticationManager가 Bcrypt로 자동 검증해줌.
	@Bean
	public BCryptPasswordEncoder encode() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests()
		.antMatchers("/user", "/post").access("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
		.antMatchers("/admin").access("hasRole('ROLE_ADMIN')")
		.anyRequest().permitAll()
		.and()
		.formLogin()
		.loginPage("/loginForm")// x-www-form-urlencoded
		.loginProcessingUrl("/login");// 스프링 시큐리티가 Post방식의 "/login" 주소가 들어오면 낚아챈다.
		
	}
}