package ro.unibuc.fmi.epa.service;

import ro.unibuc.fmi.epa.db.Database;
import ro.unibuc.fmi.epa.model.Course;
import ro.unibuc.fmi.epa.model.Professor;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

public final class ProfessorServiceImpl implements ProfessorService {

    @Override
    public Collection<Professor> getProfessors() {
        return Database.COURSE_LIST
                .stream()
                .map(Course::getProfessor)
                .collect(Collectors.toSet());
    }

    public Optional<Professor> getProfessor(String name) {
        return Database.COURSE_LIST
                .stream()
                .map(Course::getProfessor)
                .filter(p -> p.getName().equals(name))
                .findFirst();
    }
}
