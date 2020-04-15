package com.medium.danieldiasjava.openwebeans.controller;

import javax.inject.Named;

@Named
public class MyBean {

   public void getHelloBean(String name) {
       System.out.println("Hello " + name + " the OpenWebBeans started successfully !");
   }
}