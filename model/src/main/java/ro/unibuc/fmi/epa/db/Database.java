package ro.unibuc.fmi.epa.db;

import ro.unibuc.fmi.epa.model.Class;
import ro.unibuc.fmi.epa.model.Course;
import ro.unibuc.fmi.epa.model.Professor;
import ro.unibuc.fmi.epa.model.Room;

import java.util.Arrays;
import java.util.Collection;

import static ro.unibuc.fmi.epa.db.Database.Courses.EPA;
import static ro.unibuc.fmi.epa.db.Database.Courses.TV;

/**
 * Hardcoded values in one place
 */
public final class Database {

    public static final Collection<Course> COURSE_LIST = Arrays.asList(
            EPA, TV
    );

    protected static interface Professors {
        public static final Professor FI = new Professor("Florentin Ipate");
    }

    protected static interface Rooms {
        public static final Room ROOM_5 = new Room("Sala 5");
        public static final Room ROOM_220 = new Room("Sala 220");
    }

    protected static interface Clazz {
        public static final Class MASTER_505 = new Class("Master 505(BD)");
        public static final Class MASTER_506 = new Class("Master 506(IngSoft)");
    }

    protected static interface Courses {
        public static final Course EPA = new Course("EPA", Professors.FI, Rooms.ROOM_5, Clazz.MASTER_505, "Joi", "14:00-16:00");
        public static final Course TV = new Course("TV", Professors.FI, Rooms.ROOM_220, Clazz.MASTER_506, "Joi", "16:00-18:00");
    }

}
