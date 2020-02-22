package com.company;

import com.company.entities.group.Directions;
import com.company.entities.group.Group;
import com.company.entities.study.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        LessonBuilder lessonBuilder = new LessonBuilder();
        lessonBuilder.setHours(2).setName(LessonsName.PHYSICS).setNeedComputers(true).setType((byte) 0).setNeedProjector(false);

        CurriculumForAll curriculumForAll = new CurriculumForAll();
        curriculumForAll.addCurriculum(new Curriculum(1, Directions.IT));

        curriculumForAll.getCurriculum(Directions.IT, 1).addLesson(lessonBuilder.build());
        curriculumForAll.getCurriculum(Directions.IT, 1).addLesson(lessonBuilder.setName(LessonsName.MATH).build());
        curriculumForAll.getCurriculum(Directions.IT, 1).addLesson(lessonBuilder.setType((byte) 1).setHours(1).build());


        ArrayList<Group> groups = new ArrayList<>(3);

        ArrayList<Day> schedule = new ArrayList<>(7);
        schedule.add(new Day(new ArrayList<Lesson>()));


        lessonBuilder.setHours(2).setName(LessonsName.PHYSICS).setNeedComputers(true).setType((byte) 0).setNeedProjector(false);
        schedule.get(0).getLessons().add(lessonBuilder.build());
        schedule.get(0).getLessons().add(lessonBuilder.setName(LessonsName.MATH).build());
        schedule.get(0).getLessons().add(lessonBuilder.setType((byte) 1).setHours(1).build());
        groups.add(new Group(1, 1, Directions.IT, schedule));

        System.out.println(curriculumForAll.getCurriculum(groups.get(0)).checkSchedule(groups.get(0)));

        //TODO Написать норм инициализацию
    }
}
