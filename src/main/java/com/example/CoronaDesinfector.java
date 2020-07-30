package com.example;

@Deprecated
public class CoronaDesinfector {
    @InjectByType
    private Announcer announcer;
    @InjectByType
    private Policeman policeman;

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
