package com.example.dependencyinjectiondemo;

import com.example.dependencyinjectiondemo.controllers.ConstructorInjectedController;
import com.example.dependencyinjectiondemo.controllers.MyController;
import com.example.dependencyinjectiondemo.controllers.PropertyInjectedController;
import com.example.dependencyinjectiondemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctc = SpringApplication.run(DependencyInjectionDemoApplication.class, args);

        MyController controller = (MyController) ctc.getBean("myController");

        System.out.println(controller.hello());
        System.out.println(ctc.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctc.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctc.getBean(ConstructorInjectedController.class).sayHello());
    }

}
