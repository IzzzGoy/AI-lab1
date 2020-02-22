package com.company.entities.study;

import java.util.ArrayList;

public class Day {
    private ArrayList<Lesson> lessons;

    public Day(ArrayList<Lesson> lessons) {
        this.lessons = lessons;
    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }
}
