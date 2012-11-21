package dto;

public class ObjectDTO {
	private int id;
	private int own;
	private int type;
	private int state;
	private float pos_x;
	private float pos_y;
	
	public ObjectDTO(int _id, int _own, int _type, int _state, float _pos_x, float _pos_y) {
		id = _id;
		own = _own;
		type = _type;
		state = _state;
		pos_x = _pos_x;
		pos_y = _pos_y;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOwn() {
		return own;
	}

	public void setOwn(int own) {
		this.own = own;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public float getPos_x() {
		return pos_x;
	}

	public void setPos_x(float pos_x) {
		this.pos_x = pos_x;
	}

	public float getPos_y() {
		return pos_y;
	}

	public void setPos_y(float pos_y) {
		this.pos_y = pos_y;
	}
	
}
