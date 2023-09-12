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
        response.setEvents(list);
        return ResponseEntity.ok(response);
    }

    private List<Event> createList(){
        List<Event> list = new ArrayList<>();
        list.add(new Event(1,1,"10.10.2023","08:00","10Форум триумф",""));
        list.add(new Event(2,1,"10.10.2023","09:00","10Форум триумф зал Б",""));
        list.add(new Event(3,2,"10.10.2023","13:00","10Зал П 302",""));
        list.add(new Event(4,2,"10.10.2023","11:00","10Зал Д 1010",""));
        list.add(new Event(1,1,"11.10.2023","08:00","11Форум триумф",""));
        list.add(new Event(2,2,"11.10.2023","09:00","11Форум триумф зал Б",""));
        list.add(new Event(3,1,"11.10.2023","13:00","11Зал П 302",""));
        list.add(new Event(4,2,"11.10.2023","11:00","11Зал Д 1010",""));
        list.add(new Event(5,3,"12.10.2023","08:00","12Форум триумф",""));
        list.add(new Event(6,1,"12.10.2023","09:00","12Форум триумф зал Б",""));
        list.add(new Event(1,1,"13.10.2023","08:00","Форум триумф",""));
        list.add(new Event(2,3,"13.10.2023","09:00","Форум триумф зал Б",""));
        list.add(new Event(3,2,"13.10.2023","08:00","Зал П 302",""));
        list.add(new Event(4,1,"13.10.2023","11:00","Зал Д 1010",""));
        list.add(new Event(5,2,"14.10.2023","08:00","14Форум триумф",""));
        list.add(new Event(6,2,"14.10.2023","09:00","14Форум триумф зал Б",""));
        list.add(new Event(7,1,"14.10.2023","08:00","14Зал П 302",""));
        list.add(new Event(8,1,"14.10.2023","15:00","14Зал Д 1010",""));
        list.add(new Event(9,1,"14.10.2023","08:00","14Форум триумф",""));
        list.add(new Event(10,1,"15.10.2023","09:00","14Форум триумф зал Б",""));
        list.add(new Event(11,1,"15.10.2023","08:00","14Зал П 302",""));
        list.add(new Event(12,1,"15.10.2023","15:00","14Зал Д 1010",""));
        return list;
    }
}
