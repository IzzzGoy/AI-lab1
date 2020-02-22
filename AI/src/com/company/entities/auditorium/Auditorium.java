package com.company.entities.auditorium;

import com.company.entities.group.Group;

import java.util.ArrayList;
import java.util.Vector;

public class Auditorium {
    private boolean computers;
    private boolean projector;
    private Vector<Group> groupsInThis;
    private int number;
    private boolean isBusy = false;

    public Auditorium(boolean computers, boolean projector, int capacity, int number) {
        this.computers = computers;
        this.projector = projector;
        this.groupsInThis = new Vector<>(capacity);
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    public boolean isComputers() {
        return computers;
    }

    public boolean isProjector() {
        return projector;
    }

    public boolean isFull() {
        return isBusy;
    }

    public boolean addGroup(Group group) {
        if (groupsInThis.size() == groupsInThis.capacity()) {
            return false;
        }
        groupsInThis.add(group);
        if (groupsInThis.size() == groupsInThis.capacity()) {
            isBusy = true;
        }
        return true;
    }
}
