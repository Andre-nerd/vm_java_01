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
    private int type;
    private String date;
    private String time;
    private String timeClose;
    private String place;
    private String description;

    public Event(int id, int type, String date, String time,String timeClose, String place, String description) {
        this.id = id;
        this.type = type;
        this.date = date;
        this.time = time;
        this.place = place;
        this.description = description;
    }
}
