package com.github.ludmilareis.saladereuniao.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Getter
@Setter
@Entity
@Table(name = "meetingroom")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "date", nullable = false)
    private String date;

    @Column(name = "starHour", nullable = false)
    private String startHour;

    @Column(name = "endHour", nullable = false)
    private String endHour;

    public String toString(){
        return "Room [id= "+id+", name= "+name+", date= "+ date+", star hour= "+startHour+", end hour= "+endHour+"]";
    }
}

