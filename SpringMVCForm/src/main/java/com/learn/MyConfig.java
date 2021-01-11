package com.learn;
import org.springframework.context.annotation.Bean;
//remove dispatcher-servlet.xml file in WEB-INF/
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
@ComponentScan({"com.learn"})
public class MyConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/view/");
		vr.setSuffix(".jsp");
		return vr;
	}

}
