//package com.office.cloud.gateway;
//
//import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class FallbackMethodController {
//    @CircuitBreaker(name = "userServiceFallbackMethodCircuitBreaker", fallbackMethod = "userServiceFallbackMethod")
//    @PostMapping("USER-SERVER/save")
//    public String userServiceFallbackMethod() {
//        return "UserService beklenenden uzun sure cevap veremedi" +
//                "Letfen tekrar deneyin";
//    }
//
//    @CircuitBreaker(name = "departmentServiceFallbackCircuitBreaker", fallbackMethod = "departmentServiceFallback")
//    @PostMapping("DEPARTMENT-SERVER/save")
//    public String departmentServiceFallbackMethod() {
//        return "DepartmentService beklenenden uzun sure cevap veremedi" +
//                "Letfen tekrar deneyin";
//    }
//}
