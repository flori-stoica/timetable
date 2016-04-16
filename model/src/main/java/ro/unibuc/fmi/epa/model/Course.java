package ro.unibuc.fmi.epa.model;

public class Course {

    private final String name;
    private final Professor professor;
    private final Room room;
    private final Class clazz;
    private final String day;
    private final String time;

    public Course(String name, Professor professor, Room room, Class clazz, String day, String time) {
        this.name = name;
        this.professor = professor;
        this.room = room;
        this.clazz = clazz;
        this.day = day;
        this.time = time;
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;
        return name.equals(course.name) &&
                professor.equals(course.professor) &&
                room.equals(course.room) &&
                clazz.equals(course.clazz) &&
                day.equals(course.day) &&
                time.equals(course.time);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + professor.hashCode();
        result = 31 * result + room.hashCode();
        result = 31 * result + clazz.hashCode();
        result = 31 * result + day.hashCode();
        result = 31 * result + time.hashCode();
        return result;
    }
}
