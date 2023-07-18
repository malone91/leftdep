package com.melo.gateway.interfaces;

import com.alibaba.fastjson.JSON;
import com.melo.dto.XReq;
import com.melo.rpc.HelloService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String str) {
        return str + " melo " + System.currentTimeMillis();
    }

    @Override
    public String add(XReq req) {
        return "you add me " + JSON.toJSONString(req) + System.currentTimeMillis();
    }

    @Override
    public String addPlus(String str, XReq req) {
        return "you also add me str " + str + " req " + JSON.toJSONString(req) + System.currentTimeMillis();
    }
}
