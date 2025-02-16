package org.example.githubbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        BeautySalon beautySalon = context.getBean(BeautySalon.class);
        HairStylist hairStylist = context.getBean(HairStylist.class);

        System.out.println("salon: " + beautySalon.getSalonName());
        System.out.println("Main hairstylist: " + hairStylist.getStylistName());

        context.close();
    }

    @Configuration
    @ComponentScan(basePackages = "org.example.githubbackend")
    public static class AppConfig {
    }
}
