package com.lumen.test;

import com.lumen.test.config.SpringConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(classes = SpringConfig.class)
public class BaseTest extends AbstractTestNGSpringContextTests {

    @Value("${env}")
   public String test;


    @Test
    public void demo(){
        System.out.println("env = " + test);
    }

}
