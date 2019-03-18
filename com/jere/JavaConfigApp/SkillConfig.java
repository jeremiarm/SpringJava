package com.jere.JavaConfigApp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.jere.moveclasses")
@ComponentScan("com.jere.statusclasses")
@PropertySource("classpath:moves.properties")
public class SkillConfig {

}
