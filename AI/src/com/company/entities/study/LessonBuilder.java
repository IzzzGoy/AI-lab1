package com.company.entities.study;

public class LessonBuilder {
    private LessonsName name;
    private byte type;
    private int hours;
    private boolean needComputers;
    private boolean needProjector;

    public LessonBuilder() {
        needComputers = false;
        needProjector = false;
        type = -1;
    }

    public LessonBuilder setHours(int hours) {
        this.hours = hours;
        return this;
    }

    public LessonBuilder setName(LessonsName name) {
        this.name = name;
        return this;
    }

    public LessonBuilder setNeedComputers(boolean needComputers) {
        this.needComputers = needComputers;
        return this;
    }

    public LessonBuilder setNeedProjector(boolean needProjector) {
        this.needProjector = needProjector;
        return this;
    }

    public LessonBuilder setType(byte type) {
        this.type = type;
        return this;
    }

    public Lesson build() {
        if (name != null && type != -1 && hours != 0) {
            return new Lesson(name, type, hours, needComputers, needProjector);
        } else return null;
    }
}
