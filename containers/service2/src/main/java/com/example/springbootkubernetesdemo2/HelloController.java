package com.example.springbootkubernetesdemo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            return String.format("host-address: %s host-name: %s",
                    localHost.getHostAddress(),
                    localHost.getHostName());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
