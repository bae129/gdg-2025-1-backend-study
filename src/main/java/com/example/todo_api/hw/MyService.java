package com.example.todo_api.hw;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
@Getter
@Component
public class MyService {

    public final MyRepository myRepository;

    public void printService(){
        System.out.println("service");
        myRepository.printRepository();
    }
}
