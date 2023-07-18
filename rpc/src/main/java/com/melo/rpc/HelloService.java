package com.melo.rpc;

import com.melo.dto.XReq;

public interface HelloService {

    String hello(String str);

    String add(XReq req);

    String addPlus(String str, XReq req);
}
