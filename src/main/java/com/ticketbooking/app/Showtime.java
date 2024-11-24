package com.ticketbooking.app;

public class Showtime {
    int show_time_id;
    int screen_id;
    String show_time;
    int is_active;
    int current_movie_id;
    String created_by;
    String create_date;
    String modified_by;
    String modified_date;
	public Showtime(int show_time_id, int screen_id, String show_time, int is_active, int current_movie_id,
			String created_by, String create_date, String modified_by, String modified_date) {
		super();
		this.show_time_id = show_time_id;
		this.screen_id = screen_id;
		this.show_time = show_time;
		this.is_active = is_active;
		this.current_movie_id = current_movie_id;
		this.created_by = created_by;
		this.create_date = create_date;
		this.modified_by = modified_by;
		this.modified_date = modified_date;
	}
	public int getShow_time_id() {
		return show_time_id;
	}
	public void setShow_time_id(int show_time_id) {
		this.show_time_id = show_time_id;
	}
	public int getScreen_id() {
		return screen_id;
	}
	public void setScreen_id(int screen_id) {
		this.screen_id = screen_id;
	}
	public String getShow_time() {
		return show_time;
	}
	public void setShow_time(String show_time) {
		this.show_time = show_time;
	}
	public int getIs_active() {
		return is_active;
	}
	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}
	public int getCurrent_movie_id() {
		return current_movie_id;
	}
	public void setCurrent_movie_id(int current_movie_id) {
		this.current_movie_id = current_movie_id;
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

