package com.example;

public class CoronaDesinfector {
    private Announcer announcer = new ConsoleAnnouncer();
    private Policeman policeman = new PolicemanImpl();

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
