package com.example.todo_api.bean;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class MyBean {
    private final MySubBean mySubBean;


    public MyBean(MySubBean mySubBean) {
        this.mySubBean = mySubBean;
    }
}
