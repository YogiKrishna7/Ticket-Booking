package com.ticketbooking.app;

public class Screens {

	int screen_id;
    String screen_name;
    String location;
    String city;
    String state;
    String country;
    int seating_capacity;
    String created_by;
    String create_date;
    String modified_by;
    String modified_date;
    
	public Screens(int screen_id, String screen_name, String location, String city, String state, String country,
			int seating_capacity, String created_by, String create_date, String modified_by, String modified_date) {
		super();
		this.screen_id = screen_id;
		this.screen_name = screen_name;
		this.location = location;
		this.city = city;
		this.state = state;
		this.country = country;
		this.seating_capacity = seating_capacity;
		this.created_by = created_by;
		this.create_date = create_date;
		this.modified_by = modified_by;
		this.modified_date = modified_date;
	}
	public int getScreen_id() {
		return screen_id;
	}
	public void setScreen_id(int screen_id) {
		this.screen_id = screen_id;
	}
	public String getScreen_name() {
		return screen_name;
	}
	public void setScreen_name(String screen_name) {
		this.screen_name = screen_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getSeating_capacity() {
		return seating_capacity;
	}
	public void setSeating_capacity(int seating_capacity) {
		this.seating_capacity = seating_capacity;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	public String getModified_date() {
		return modified_date;
	}
	public void setModified_date(String modified_date) {
		this.modified_date = modified_date;
	}
    
    
}
