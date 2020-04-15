package com.medium.danieldiasjava.openwebeans.application;

import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;

import com.medium.danieldiasjava.openwebeans.controller.MyBean;

import org.apache.webbeans.config.WebBeansContext;
import org.apache.webbeans.spi.ContainerLifecycle;

public class OpenWebBeansApplication {
    
    private static ContainerLifecycle lifecycle = null;

    public static void main(String[] args) {

        lifecycle = WebBeansContext.getInstance().getService(ContainerLifecycle.class);
        lifecycle.startApplication(null);

       BeanManager beanManager = lifecycle.getBeanManager();
       Bean<?> bean = beanManager.getBeans("myBean").iterator().next();

       MyBean myBean = (MyBean) beanManager.getReference(bean, MyBean.class, beanManager.createCreationalContext(bean));

       myBean.getHelloBean("Daniel Dias");
        
        
    }
}