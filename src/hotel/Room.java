package hotel;

public class Room {
	private int room_number;
	private int room_capacity;
	private String room_type;

	public Room(int room_number, int room_capacity, String room_type) {
		this.room_number = room_number;
		this.room_capacity = room_capacity;
		this.room_type = room_type;
	}

	public int getRoom_number() {
		return room_number;
	}

	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}

	public int getRoom_capacity() {
		return room_capacity;
	}

	public void setRoom_capacity(int room_capacity) {
		this.room_capacity = room_capacity;
	}

	public String getRoom_type() {
		return room_type;
	}

	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}

	@Override
	public String toString() {
		return "RoomVO [room_number=" + room_number + ", room_capacity=" + room_capacity + ", room_type=" + room_type
				+ "]";
	}

}
