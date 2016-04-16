package ro.unibuc.fmi.epa.service;

import ro.unibuc.fmi.epa.model.Professor;

import java.util.Collection;
import java.util.Optional;

public interface ProfessorService {

    public Collection<Professor> getProfessors();

    public Optional<Professor> getProfessor(String name);
}
