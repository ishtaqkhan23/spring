package com.smart.hospital.config;

import com.smart.hospital.model.DBConfig;
import com.smart.hospital.model.Notification;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Notification notificationBeanProvider(){
        Notification notification = new Notification();
        notification.setMessage("Hello, you have a new notification.");
        return notification;
    }

    @Bean
    public DBConfig dbConfigProvider(){
        DBConfig dbConfig = new DBConfig("jdbc:mysql://localhost:3307/mycompany", "root","root");
        return dbConfig;
    }

}
