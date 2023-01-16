package org.example;

import org.example.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws IOException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        ResultsProcessor resultsProcessor = applicationContext.getBean(ResultsProcessor.class);
        List<Runner> runner = resultsProcessor.getRunners("5km","F");
        runner.forEach(System.out::println);
    }
}
