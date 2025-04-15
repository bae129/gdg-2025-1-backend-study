package com.example.todo_api.hw;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;




@Component
public class MyRepository {
    public void printRepository(){
        System.out.println("repository");
    }
}
