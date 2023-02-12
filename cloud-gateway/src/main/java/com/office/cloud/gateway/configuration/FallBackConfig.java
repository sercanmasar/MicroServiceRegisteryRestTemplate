//package com.office.cloud.gateway.configuration;
//
//import org.springframework.beans.factory.ObjectProvider;
//import org.springframework.cloud.circuitbreaker.resilience4j.ReactiveResilience4JCircuitBreakerFactory;
//import org.springframework.cloud.gateway.filter.factory.FallbackHeadersGatewayFilterFactory;
//import org.springframework.cloud.gateway.filter.factory.SpringCloudCircuitBreakerFilterFactory;
//import org.springframework.cloud.gateway.filter.factory.SpringCloudCircuitBreakerResilience4JFilterFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.reactive.DispatcherHandler;
//
//@Configuration
//public class FallBackConfig {
//    @Bean
//    public FallbackHeadersGatewayFilterFactory fallbackHeadersGatewayFilterFactory() {
//        return new FallbackHeadersGatewayFilterFactory();
//    }
//
//    @Bean
//    public SpringCloudCircuitBreakerFilterFactory resilience4JCircuitBreakerFactory(
//            ReactiveResilience4JCircuitBreakerFactory reactiveCircuitBreakerFactory,
//            ObjectProvider<DispatcherHandler> dispatcherHandlers) {
//        return new SpringCloudCircuitBreakerResilience4JFilterFactory(reactiveCircuitBreakerFactory, dispatcherHandlers);
//    }
//}
