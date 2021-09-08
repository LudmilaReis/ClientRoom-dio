package com.github.ludmilareis.saladereuniao.repository;

import com.github.ludmilareis.saladereuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
