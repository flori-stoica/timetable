package ro.unibuc.fmi.epa.model;

public class Course {

    private final String name;
    private final Professor professor;
    private final Room room;
    private final Class clazz;

    public Course(String name, Professor professor, Room room, Class clazz) {
        this.name = name;
        this.professor = professor;
        this.room = room;
        this.clazz = clazz;
    }

    public Class getClazz() {
        return clazz;
    }

    public Room getRoom() {
        return room;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Course course = (Course) o;

        return name.equals(course.name) &&
                professor.equals(course.professor) &&
                room.equals(course.room) &&
                clazz.equals(course.clazz);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + professor.hashCode();
        result = 31 * result + room.hashCode();
        result = 31 * result + clazz.hashCode();
        return result;
    }
}
