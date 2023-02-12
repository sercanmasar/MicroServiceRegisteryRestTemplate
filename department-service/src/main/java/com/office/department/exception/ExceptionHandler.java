//package com.office.department.exception;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//import org.springframework.web.ErrorResponseException;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//@RestControllerAdvice
//public class ExceptionHandler extends ErrorResponseException {
//
//    public ExceptionHandler(HttpStatusCode status) {
//        super(status);
//    }
//    @org.springframework.web.bind.annotation.ExceptionHandler
//    public ResponseEntity<?> handle(DepartmentNotFoundException exception) {
//        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
//    }
//}
