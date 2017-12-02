package net.ukrtel.ddns.ff.utilities.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /*@Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User
                .withUsername("user")
                .password("user")
                .roles("USER")
                .build());

        manager.createUser(User
                .withUsername("admin")
                .password("admin")
                .roles("USER", "ADMIN")
                .build());

        return manager;
    }*/

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .mvcMatchers("/admin").hasRole("ADMIN")
                    .anyRequest().authenticated()
                    .and()
                //.formLogin()        // enables redirect at login page
                //    .and()
                .requiresChannel()  // redirecting all requests at https
                    .anyRequest().requiresSecure()
                    .and()
                .httpBasic();       // enables inbrowser auth
    }

    public static class SpringSecurityInitializer extends AbstractSecurityWebApplicationInitializer {
        // enabling filters chain
    }
}
