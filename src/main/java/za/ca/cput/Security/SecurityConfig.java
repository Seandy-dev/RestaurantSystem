package za.ca.cput.Security;

/* AddressEntity.java
   Author : Hlombekazi Mbelu (209024666)
   Date : 20 October 2021
 */

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("{noop}12345")
                .roles("ADMIN")
                .and()
                .withUser("client")
                .password("{noop}54321")
                .roles("USER"); }
    @Override
    protected void configure(HttpSecurity http) throws Exception{
                 http.httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST,"**/create").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE,"**/delete").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "**/update").hasRole("USER")
                .antMatchers(HttpMethod.GET, "**/getall").hasAnyRole("ADMIN","USER")
                .and()
                .csrf().disable()
                .formLogin().disable();
    }}


