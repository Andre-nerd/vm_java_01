package com.boukreev.spring.projectboot.controllers;

import com.boukreev.spring.projectboot.models.Event;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/event")
public class EventController {

    @GetMapping("/stopIndexing")
    public ResponseEntity<List<Event>> stopIndexing(){
        EventResponse response = new IndexingResponse();
    }
}
