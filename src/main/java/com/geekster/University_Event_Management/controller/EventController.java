package com.geekster.University_Event_Management.controller;

import com.geekster.University_Event_Management.model.EventModel;
import com.geekster.University_Event_Management.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping(value = "/addEvent")
    public String addEvent(@RequestBody List<EventModel> eventList)
    {
        return eventService.addEventDetails(eventList);
    }
    @PutMapping(value = "/updateEvent/{id}")
    public void updateEvent(@PathVariable Integer id , @RequestBody EventModel eventDetails){
         eventService.updateEventDetails(id,eventDetails);
    }
    @DeleteMapping(value = "/deleteEvent/{id}")
    public void deleteEvent(@PathVariable int id)
    {
        eventService.deleteEventDetails(id);
    }

}
