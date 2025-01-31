package com.yogish.zeebe.paymentprocessor.reusable.zeebe.config;

import io.camunda.zeebe.client.ZeebeClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.net.URI;
import java.net.URISyntaxException;

@Configuration
public class ZeebeConfig {


    @Bean
    @Primary
    public ZeebeClient zeebeClient() throws URISyntaxException {
        URI uri = new URI("http://127.0.0.1:26500");
        return ZeebeClient.newClientBuilder().grpcAddress(uri) // Replace with your Zeebe broker address
                .usePlaintext()
                .build();
    }

}
