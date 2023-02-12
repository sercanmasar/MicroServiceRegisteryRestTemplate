package com.office.department.service;

import com.office.department.entity.Department;
import com.office.department.exception.DepartmentNotFoundException;
import com.office.department.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public ResponseEntity<Department> getByDepartmentId(Long id) {
        return ResponseEntity.ok(departmentRepository.findById(id).orElseThrow(() -> new DepartmentNotFoundException("Department not found")));
    }
}
