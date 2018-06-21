/**
 * 
 */
package com.studiohub.user.application.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author MXA86SG
 *
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
    	 registry.addViewController("/").setViewName("user/home");
    	 registry.addViewController("/home").setViewName("user/home");
    	 registry.addViewController("/login").setViewName("user/login");
    	 registry.addViewController("/403").setViewName("403");
    }
}
