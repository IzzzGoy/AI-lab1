package com.company.entities.teacher;

import com.company.entities.study.LessonsName;

import java.util.Set;

public class Teacher {
    private String name;
    private Set<LessonsName> lessonsNames;
    private boolean isBusy = false;

    public Teacher(String name, Set<LessonsName> lessonsNames) {
        this.name = name;
        this.lessonsNames = lessonsNames;
    }

    public void addLessonName(LessonsName lessonsName) {
        lessonsNames.add(lessonsName);
    }

    public String getName() {
        return name;
    }

    public Set<LessonsName> getLessonsNames() {
        return lessonsNames;
    }

    public boolean canTeach(LessonsName lessonsName) {
        return lessonsNames.contains(lessonsName);
    }
}
