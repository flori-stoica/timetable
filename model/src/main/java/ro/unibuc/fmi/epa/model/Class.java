package ro.unibuc.fmi.epa.model;

public final class Class {

    private final String name;

    public Class(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Class aClass = (Class) o;
        return name.equals(aClass.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
