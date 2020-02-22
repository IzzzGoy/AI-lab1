package com.company.entities.study;

import java.util.Objects;

public class Lesson {
    private LessonsName name;
    private byte type;
    private int hours;
    private boolean needComputers;
    private boolean needProjector;

    public Lesson(LessonsName name, byte type, int hours, boolean needComputers, boolean needProjector) {
        this.name = name;
        this.type = type;
        this.hours = hours;
        this.needComputers = needComputers;
        this.needProjector = needProjector;
    }

    public byte getType() {
        return type;
    }

    public int getHours() {
        return hours;
    }

    public LessonsName getName() {
        return name;
    }

    public boolean isNeedComputers() {
        return needComputers;
    }

    public boolean isNeedProjector() {
        return needProjector;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return type == lesson.type &&
                hours == lesson.hours &&
                needComputers == lesson.needComputers &&
                needProjector == lesson.needProjector &&
                name == lesson.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, hours, needComputers, needProjector);
    }
}
