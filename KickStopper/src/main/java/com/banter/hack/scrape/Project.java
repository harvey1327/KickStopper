package com.banter.hack.scrape;

public class Project {

	private String title = "";
	
	private String description = "";
	
	private String author = "";
	
	private Integer backers = -1;
	
	private Integer pledge = -1;
	
	private Double goal = -1.0;
	
	private Integer deadline = -1;
		
	private Integer id = -1;
	
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

	public Integer getBackers() {
		return backers;
	}

	public void setBackers(Integer backers) {
		this.backers = backers;
	}

	public Integer getPledge() {
		return pledge;
	}

	public void setPledge(Integer pledge) {
		this.pledge = pledge;
	}

	public Double getGoal() {
		return goal;
	}

	public void setGoal(Double goal) {
		this.goal = goal;
	}

	public Integer getDeadline() {
		return deadline;
	}

	public void setDeadline(Integer deadline) {
		this.deadline = deadline;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
