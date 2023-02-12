package com.office.department.config;

import com.office.department.entity.Department;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DepartmentConfiguration {

    @Bean
    Department department() {
        return new Department();
    }
}
