package com.example.cqrs.infa.config;

import com.example.cqrs.CqrsApplication;
import com.example.cqrs.infa.adapters.out.repositories.PostGrUserRepository;
import com.example.cqrs.infa.adapters.out.repositories.PostGrUserRepositoryImpl;
import com.example.cqrs.infa.adapters.out.repositories.ReadUserRepositoryImpl;
import com.example.cqrs.infa.adapters.out.repositories.WriteUserRepositoryImpl;
import com.example.cqrs.infa.ports.out.repository.ReadOnlyRepository;
import com.example.cqrs.infa.ports.out.repository.SavingRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = CqrsApplication.class)
public class BeanConfiguration {

    @Bean
    ReadOnlyRepository rUserRepository() {
        return new ReadUserRepositoryImpl();
    }

    @Bean
    SavingRepository wUserRepository() {
        return new WriteUserRepositoryImpl();
    }
}
