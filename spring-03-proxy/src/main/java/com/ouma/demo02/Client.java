package com.ouma.demo02;

import javax.xml.ws.Service;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setTarget(userService);
        UserService proxy = (UserService) proxyInvocationHandler.getProxy();
        proxy.add();
        proxy.search();
    }
}
