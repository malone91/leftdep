package com.melo.leftdep.consumer.api;

import com.melo.rpc.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/echo")
public class EchoController {

    @Reference(check = false, version = "1.0.0", interfaceClass = HelloService.class)
    private HelloService helloService;

    @GetMapping("hello")
    public String hello() {
        return helloService.hello("tcc");
    }
}
