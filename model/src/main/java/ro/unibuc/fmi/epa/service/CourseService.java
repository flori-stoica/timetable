package ro.unibuc.fmi.epa.service;

import ro.unibuc.fmi.epa.model.Class;
import ro.unibuc.fmi.epa.model.Course;
import ro.unibuc.fmi.epa.model.Professor;
import ro.unibuc.fmi.epa.model.Room;

import java.util.Collection;

public interface CourseService {

    public Collection<Course> getCourses();

    public Collection<Course> getCourses(Room room);

    public Collection<Course> getCourses(Professor professor);

    public Collection<Course> getCourses(Class clazz);
}
