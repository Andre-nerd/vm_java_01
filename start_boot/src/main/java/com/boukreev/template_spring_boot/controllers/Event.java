package com.boukreev.template_spring_boot.controllers;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Event {
    private int id;
    private String date;
    private String time;
    private String place;
    private String description;

    public Event(int id, String date, String time, String place, String description) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.place = place;
        this.description = description;
    }
}
