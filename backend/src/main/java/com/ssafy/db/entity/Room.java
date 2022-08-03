package com.ssafy.db.entity;


import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Getter
public class Room {

    @Id @GeneratedValue
    @Column(name = "room_no")
    private Long no;

    @Column(name = "room_name")
    @NotNull
    private String name;

    @Column(name = "room_code", unique = true)
    private String code;

    @Column(name = "room_host")
    @NotNull
    private String host;

    @Column(name = "room_roomsize")
    @NotNull
    private int roomSize; // 방 최대인원

    @Column(name = "room_starttime")
    @NotNull
    private LocalDateTime startTime;

    @Column(name = "room_endtime")
    private LocalDateTime endTime;

    @Column(name = "room_gameno")
    private int gameno;

    @Column(name = "room_isprivate")
    private Boolean isPrivate;

    protected Room(){}

    protected Room(String name, String code, String host, int roomSize) {
        // setter에 대한 것은 추후에
        this.name = name;
        this.code = code;
        this.host = host;
        this.roomSize = roomSize;
        this.startTime = LocalDateTime.now();
    }

    public static Room createRoom(String name, String code, String host, int roomSize){
        return new Room(name, code, host, roomSize);
    }
}