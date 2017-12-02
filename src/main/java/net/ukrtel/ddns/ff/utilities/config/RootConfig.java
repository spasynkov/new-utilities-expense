package net.ukrtel.ddns.ff.utilities.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"net.ukrtel.ddns.ff.utilities"},
        excludeFilters = @Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class))
@EnableJpaRepositories(basePackages = {"net.ukrtel.ddns.ff.utilities.repositories"})
public class RootConfig {
    // configuring placeholders bean to work with properties
    // like @PropertySource("WEB-INF/classes/db.properties") and then @Value("${property.name}") injection
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
