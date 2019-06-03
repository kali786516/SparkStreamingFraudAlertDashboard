package com.fraudalertdashboard.dashboard; /**
 * Created by kalit_000 on 6/3/19.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = {"com.fraudalertdashboard.dashboard", "com.fraudalertdashboard.dao"})
public class FraudAlertDashboard {

    public static void main(String[] args)
    {
        SpringApplication.run(FraudAlertDashboard.class, args);
    }
}
