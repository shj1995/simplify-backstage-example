package com.shj1995.simplifybackstage.demo;

/**
 * @author shj1995
 * @since 1.0.0
 */

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author shj1995
 * @since 1.0.0
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.shj1995.simplifybackstage")
//@EnableJpaAuditing
@EnableConfigurationProperties
//@EnableJpaRepositories
public class Config {
}
