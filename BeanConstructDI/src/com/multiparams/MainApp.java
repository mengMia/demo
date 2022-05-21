package com.multiparams;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansMul.xml");
        Foo foo = (Foo) context.getBean("foo");
        foo.fooSpell();
    }
}
