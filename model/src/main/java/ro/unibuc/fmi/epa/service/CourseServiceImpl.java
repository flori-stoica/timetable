package ro.unibuc.fmi.epa.service;

import ro.unibuc.fmi.epa.model.Class;
import ro.unibuc.fmi.epa.model.Course;
import ro.unibuc.fmi.epa.model.Professor;
import ro.unibuc.fmi.epa.model.Room;

import java.util.Collection;
import java.util.stream.Collectors;

import static ro.unibuc.fmi.epa.db.Database.COURSE_LIST;

public final class CourseServiceImpl implements CourseService {

    @Override
    public Collection<Course> getCourses() {
        return COURSE_LIST;
    }

    @Override
    public Collection<Course> getCourses(Room room) {
        return COURSE_LIST
                .stream()
                .filter(c -> c.getRoom().equals(room))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<Course> getCourses(Professor professor) {
        return COURSE_LIST
                .stream()
                .filter(c -> c.getProfessor().equals(professor))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<Course> getCourses(Class clazz) {
        return COURSE_LIST
                .stream()
                .filter(c -> c.getClazz().equals(clazz))
                .collect(Collectors.toList());
    }
}
