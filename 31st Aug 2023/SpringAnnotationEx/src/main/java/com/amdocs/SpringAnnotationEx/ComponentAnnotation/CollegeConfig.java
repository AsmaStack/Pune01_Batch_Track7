package com.amdocs.SpringAnnotationEx.ComponentAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.amdocs.SpringAnnotationEx.BeanAnnotation.College;

@Configuration
@Component(value = "BeanAnnotation")

public class CollegeConfig {
	// Creating College class Bean
    // using Bean annotation
    public College collegeBean()
    {
 
        // Returns the College class object
        return new College();
    }
}
