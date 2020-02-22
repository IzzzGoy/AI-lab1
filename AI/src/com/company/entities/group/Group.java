package com.company.entities.group;

import com.company.entities.study.Day;

import java.util.ArrayList;

public class Group {
    private int number;
    private int grade;
    private Directions direction;
    private ArrayList<Day> optimalSchedule;

    public Group(int number, int grade, Directions direction, ArrayList<Day> optimalSchedule) {
        this.number = number;
        this.grade = grade;
        this.direction = direction;
        this.optimalSchedule = optimalSchedule;
    }

    public int getNumber() {
        return number;
    }

    public int getGrade() {
        return grade;
    }

    public Directions getDirection() {
        return direction;
    }

    public ArrayList<Day> getOptimalSchedule() {
        return optimalSchedule;
    }
}
