package ro.unibuc.fmi.epa.model;

public final class Professor {
    private final String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Professor professor = (Professor) o;
        return name.equals(professor.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
