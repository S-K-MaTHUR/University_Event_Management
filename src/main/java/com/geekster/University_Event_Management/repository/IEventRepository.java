package com.geekster.University_Event_Management.repository;

import com.geekster.University_Event_Management.model.EventModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Iterator;
import java.util.List;
@Repository
public interface IEventRepository  extends CrudRepository<EventModel,Integer>{

    Iterator<EventModel> notifyAll(List<EventModel> eventList);

    void updateEventDetailById(Integer id, EventModel eventDetails);

    void deleteEventDetails(int id);
}
