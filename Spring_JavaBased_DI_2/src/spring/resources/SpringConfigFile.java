package spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.beans.Bean_1;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Bean_1 Sample_1() {
		return new Bean_1();
	}

}
