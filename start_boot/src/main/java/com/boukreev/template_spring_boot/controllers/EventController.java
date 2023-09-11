package com.boukreev.template_spring_boot.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EventController {

    @GetMapping("/event")
    public ResponseEntity<EventResponse> getEvents(){
        EventResponse response = new EventResponse();
        List<Event> list = createList();
        response.setResult(list);
        return ResponseEntity.ok(response);
    }

    private List<Event> createList(){
        List<Event> list = new ArrayList<>();
        list.add(new Event(1,"13.10.2023","08:00","Форум триумф",""));
        list.add(new Event(2,"13.10.2023","09:00","Форум триумф зал Б",""));
        list.add(new Event(3,"13.10.2023","08:00","Зал П 302",""));
        list.add(new Event(4,"13.10.2023","11:00","Зал Д 1010",""));
        return list;
    }
}
