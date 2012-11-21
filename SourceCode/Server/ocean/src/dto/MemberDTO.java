package dto;

import java.sql.Date;

public class MemberDTO {
	private int id;
	private String token;
	private Date update;
	private int point;
	
	public MemberDTO(){
		
	}
	public MemberDTO(int _id, String _token, Date _date, int _point) {
		id = _id;
		token = _token;
		update = _date;
		point = _point;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Date getUpdate() {
		return update;
	}
	public void setUpdate(Date update) {
		this.update = update;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
}
