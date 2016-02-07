package com.banter.hack.jdbc;

import java.sql.Date;


/**
 * Project objec which we use to populate our database with
 * @author bogdanmetea
 *
 */
public class Project {
	
	int id, backersCount, antiBackersCount, pledged, antiPledged, goal, antiGoal;
	String title, description, author;
	Date deadline;
	
	
	public Project(int id, int backersCount, int antiBackersCount, int pledged, int antiPledged, int goal, int antiGoal,
			String title, String description, String author, Date deadline) {
		super();
		this.id = id;
		this.backersCount = backersCount;
		this.antiBackersCount = antiBackersCount;
		this.pledged = pledged;
		this.antiPledged = antiPledged;
		this.goal = goal;
		this.antiGoal = antiGoal;
		this.title = title;
		this.description = description;
		this.author = author;
		this.deadline = deadline;
	}




	/**
	 * Auto generated getters and setters for our Project object
	 * @return
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBackersCount() {
		return backersCount;
	}
	public void setBackersCount(int backersCount) {
		this.backersCount = backersCount;
	}
	public int getAntiBackersCount() {
		return antiBackersCount;
	}
	public void setAntiBackersCount(int antiBackersCount) {
		this.antiBackersCount = antiBackersCount;
	}
	public int getPledged() {
		return pledged;
	}
	public void setPledged(int pledged) {
		this.pledged = pledged;
	}
	public int getAntiPledged() {
		return antiPledged;
	}
	public void setAntiPledged(int antiPledged) {
		this.antiPledged = antiPledged;
	}
	public int getGoal() {
		return goal;
	}
	public void setGoal(int goal) {
		this.goal = goal;
	}
	public int getAntiGoal() {
		return antiGoal;
	}
	public void setAntiGoal(int antiGoal) {
		this.antiGoal = antiGoal;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	
	
}
