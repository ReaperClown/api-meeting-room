package com.manager.room.meeting.meetingroom.repository;

import com.manager.room.meeting.meetingroom.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {
    
}
