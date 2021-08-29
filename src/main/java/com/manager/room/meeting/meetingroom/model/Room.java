package com.manager.room.meeting.meetingroom.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "meetingroom")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "startHour", nullable = false)
    private LocalDateTime startHour;

    @Column(name = "endHour", nullable = false)
    private LocalDateTime endHour;

    @Override
    public String toString() {
        return "Room [id="+id+",name="+name+",startHour="+startHour+",endHour="+endHour+"]";
    }

}
