public class Room {

    private int roomNr;
    private int id;
    private int idCount = 0;

    public Room(int roomNr) {
        this.roomNr = roomNr;
        id = idCount;
        idCount++;
    }

    public Room() {
        id = idCount;
        idCount++;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNr=" + roomNr +
                ", id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public int getRoomNr() {
        return roomNr;
    }

    public void setRoomNr(int roomNr) {
        this.roomNr = roomNr;
    }
}
