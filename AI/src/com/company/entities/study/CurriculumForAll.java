package com.company.entities.study;

import com.company.entities.group.Directions;
import com.company.entities.group.Group;

import java.util.HashMap;
import java.util.Vector;

public class CurriculumForAll {

    private Vector<HashMap<Directions, Curriculum>> curriculums;

    public CurriculumForAll() {
        curriculums = new Vector<>(5);
        for (int i = 0; i < curriculums.capacity(); i++) {
            curriculums.add(new HashMap<>());
        }
    }

    public boolean addCurriculum(Curriculum curriculum) {
        if (curriculums.get(curriculum.getGrade()).isEmpty()) {
            curriculums.get(curriculum.getGrade()).put(curriculum.getDirections(), curriculum);
            return true;
        } else if (curriculums.get(curriculum.getGrade()).containsKey(curriculum.getDirections())) {
            curriculums.get(curriculum.getGrade()).put(curriculum.getDirections(), curriculum);
            return true;
        } else {
            return false;
        }
    }

    public Curriculum getCurriculum(Directions direction, int grade) {
        return curriculums.get(grade).get(direction);
    }

    public Curriculum getCurriculum(Group group) {
        return curriculums.get(group.getGrade()).get(group.getDirection());
    }
}
