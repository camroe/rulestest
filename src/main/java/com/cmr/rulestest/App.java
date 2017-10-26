package com.cmr.rulestest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Hello world!
 */
@SpringBootApplication
public class App implements CommandLineRunner {
    final static Logger log = LoggerFactory.getLogger(App.class);


    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
        application.run(args);

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("----------------------------------------------------------------");
        System.out.println("HelloWorld");
        System.out.println("----------------------------------------------------------------");
        DroolsManager dr = new DroolsManager();
        dr.apply();



    }

    private void loggerReport() {
        log.debug("Debug logging Enabled");
        log.info("Info Logging Enabled");
        log.warn("Warning Logging Enabled");
        log.error("Error Logging Enabled");
    }


}

