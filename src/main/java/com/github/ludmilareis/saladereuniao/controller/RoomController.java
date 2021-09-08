package com.github.ludmilareis.saladereuniao.controller;

import com.github.ludmilareis.saladereuniao.exceptions.ResourceNotFoundException;
import com.github.ludmilareis.saladereuniao.model.Room;
import com.github.ludmilareis.saladereuniao.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class RoomController {
    @Autowired
    private RoomRepository roomRepository;
    @GetMapping("/rooms")
    public List<Room> getAllRooms(){
        return  roomRepository.findAll();
    }
    @GetMapping("/rooms/id")
    public ResponseEntity<Room> getRoomById(@PathVariable(value = "id")long roomId)
        throws ResourceNotFoundException{
            Room room = roomRepository.findById(roomId)
                    .orElseThrow(()-> new ResourceNotFoundException("Room not found"+roomId));
            return ResponseEntity.ok().body(room);
    }
    
}
