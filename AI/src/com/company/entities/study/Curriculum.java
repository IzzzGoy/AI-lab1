package com.company.entities.study;

import com.company.entities.group.Directions;
import com.company.entities.group.Group;

import java.util.Vector;

public class Curriculum {
    private Vector<Lesson> lessons;
    private Directions directions;
    private int grade;

    public Curriculum(int grade, Directions direction) {
        this.lessons = new Vector<>();
        this.grade = grade;
        this.directions = direction;

    }

    public boolean checkSchedule(Group group) {
        for (Day day : group.getOptimalSchedule()) {
            for (Lesson lesson : day.getLessons()) {
                if (!isLesson(lesson)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isLesson(Lesson lesson) {
        for (Lesson less : lessons) {
            if (less.equals(lesson)) {
                return true;
            }
        }
        return false;
    }

    public boolean addLesson(Lesson lesson) {
        return lessons.add(lesson);
    }

    public int getGrade() {
        return grade;
    }

    public Directions getDirections() {
        return directions;
    }

    public Vector<Lesson> getLessons() {
        return lessons;
    }
}
