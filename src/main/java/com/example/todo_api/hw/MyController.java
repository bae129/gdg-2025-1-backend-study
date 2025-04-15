package com.example.todo_api.hw;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
@Getter
@Component
public class MyController {
    private final MyService myService;

    public void printController(){
        System.out.println("controller");
        myService.printService();
    }

}
