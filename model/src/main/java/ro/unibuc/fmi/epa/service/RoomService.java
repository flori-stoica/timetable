package ro.unibuc.fmi.epa.service;

import ro.unibuc.fmi.epa.model.Room;

import java.util.Collection;
import java.util.Optional;

public interface RoomService {

    public Collection<Room> getRooms();

    public Optional<Room> getRoom(String name);
}
