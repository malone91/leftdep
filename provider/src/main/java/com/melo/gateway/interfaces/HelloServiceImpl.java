package com.melo.gateway.interfaces;

import com.melo.rpc.HelloService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String str) {
        return str + " melo";
    }
}
