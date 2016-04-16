package ro.unibuc.fmi.epa.model;

public final class Room {
    private final String name;

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        return name.equals(room.name);

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
