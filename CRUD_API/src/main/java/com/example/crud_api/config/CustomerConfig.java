package com.example.crud_api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class CustomerConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth){
        try{
            auth.inMemoryAuthentication()
                    .withUser("user").password("{noop}123456").roles("USER")
                    .and()
                    .withUser("admin").password("{noop}123456").roles("ADMIN");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/api/**").hasAnyRole("HOST", "ADMIN", "USER")
                .antMatchers(HttpMethod.PUT, "/api/**").hasAnyRole("HOST", "ADMIN", "USER")
                .antMatchers(HttpMethod.DELETE, "/api/**").hasAnyRole("HOST", "ADMIN", "USER")
                .anyRequest().authenticated()
                .and()
                .httpBasic()
                .and()
                .csrf()
                .ignoringAntMatchers("/api/**");
    }
}
