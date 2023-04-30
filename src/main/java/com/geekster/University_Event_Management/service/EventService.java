package com.geekster.University_Event_Management.service;

import com.geekster.University_Event_Management.model.EventModel;
import com.geekster.University_Event_Management.repository.IEventRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
@Service
public class EventService
{

    @Autowired
    IEventRepository eventRepo;
    public String addEventDetails(List<EventModel> eventList) {


        Iterator<EventModel> list = eventRepo.notifyAll(eventList);
        if(list != null){
            return "Event start on Time....!!!1";
        }else {
            return "Event has been postponed";
        }

    }


    @Transactional
    public void updateEventDetails(Integer id, EventModel eventDetails) {
        eventRepo.updateEventDetailById(id,eventDetails);
    }
    @Transactional
    public void deleteEventDetails(int id) {
        eventRepo.deleteEventDetails(id);
    }
}
