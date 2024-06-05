package ch01;

public class ToDos {
	int userID;
	int id;
	String title;
	boolean completed;

	public ToDos(int userID, int id, String title, boolean completed) {
		this.userID = userID;
		this.id = id;
		this.title = title;
		this.completed = completed;
	}

	public int getUserID() {
		return userID;
	}

	public String getTitle() {
		return title;
	}
}