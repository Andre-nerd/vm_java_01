package com.boukreev.template_spring_boot.controllers;

import lombok.Data;

import java.util.List;

@Data
public class EventResponse {
    private List<Event> events;
}
