package com.geekster.University_Event_Management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class EventModel {

    @Column(name = "event_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer eventId;

    @Column(name = "event_name", unique = true)
    private String eventName;

    @Column(name = "event_location")
    private String locationOfEvent;

    @Column(name = "event_date")
    private String date;

    @Column(name = "event_start_time")
    private String startTime;

    @Column(name = "event_end_time")
    private String endTime;

}
