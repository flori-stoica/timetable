package ro.unibuc.fmi.epa.service;

import ro.unibuc.fmi.epa.db.Database;
import ro.unibuc.fmi.epa.model.Course;
import ro.unibuc.fmi.epa.model.Room;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

public final class RoomServiceImpl implements RoomService {

    @Override
    public Collection<Room> getRooms() {
        return Database.COURSE_LIST
                .stream()
                .map(Course::getRoom)
                .collect(Collectors.toSet());
    }

    @Override
    public Optional<Room> getRoom(String name) {
        return Database.COURSE_LIST
                .stream()
                .map(Course::getRoom)
                .filter(r -> r.getName().equals(name))
                .findFirst();
    }
}
