package com.example.todo_api.hw;

import com.example.todo_api.bean.MyBean;
import com.example.todo_api.bean.MySubBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan
@SpringBootTest
public class MyControllerTest {
    @Autowired
    private MyController myController;
    @Test
    public void controllerTest(){
        myController.printController();
    }
}
