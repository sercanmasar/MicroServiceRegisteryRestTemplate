package com.office.department;

import com.office.department.entity.Department;
import com.office.department.repository.DepartmentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class DepartmentServiceApplication implements CommandLineRunner {
    private final DepartmentRepository departmentRepository;

    public DepartmentServiceApplication(DepartmentRepository departmentRepository, Department department) {
        this.departmentRepository = departmentRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DepartmentServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Department department = new Department();
        department.setDepartmentId(1);
        department.setDepartmentAddress("Istanbul");
        department.setDepartmentCode("!0");
        department.setDepartmentName("IT-1");
        Department department1 = new Department();
        department1.setDepartmentId(2);
        department1.setDepartmentAddress("Izmir");
        department1.setDepartmentCode("!1");
        department1.setDepartmentName("IT-2");
        Department department2 = new Department();
        department2.setDepartmentId(3);
        department2.setDepartmentAddress("Samsun");
        department2.setDepartmentCode("!2");
        department2.setDepartmentName("IT-3");
        ArrayList<Department> departmentList = new ArrayList<>();
        departmentList.add(department);
        departmentList.add(department1);
        departmentList.add(department2);
        departmentRepository.saveAll(departmentList);
    }
}
