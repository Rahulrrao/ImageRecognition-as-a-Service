package edu.asu.cc.imageRecog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan("edu.asu.cc.imageRecog")
@SpringBootApplication
@EnableScheduling
//@EnableAutoConfiguration
public class CcImageRecognitionApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CcImageRecognitionApplication.class);
    }


	public static void main(String[] args) {
		SpringApplication.run(CcImageRecognitionApplication.class, args);
	}
}
