package com.example;

import java.io.Console;

public class CoronaDesinfector {
    private Announcer announcer = ObjectFactory.getInstance().createObject(Announcer.class);
    private Policeman policeman = ObjectFactory.getInstance().createObject(Policeman.class);

    public void start(Room room) {
        desinfect(room);
    }

    private void desinfect(Room room) {
        announcer.announce("begin desinfetion, all go out");
        policeman.makePeopleLeaveRoom();
        announcer.announce("You can go in");
        System.out.println("Disable virus");
    }
}
