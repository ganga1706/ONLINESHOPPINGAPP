package com.online99.shoppppingcart.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@Import({WebSecurityConfig.class,HibernateJpaAutoConfigurationBeans.class})
@Configuration
@EnableWebMvc
public class WebConfiguration {
 
    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        // Load file: validation.properties
        messageSource.setBasename("classpath:validation");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
  
}