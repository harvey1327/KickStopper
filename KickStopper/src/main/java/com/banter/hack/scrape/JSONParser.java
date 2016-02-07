package com.banter.hack.scrape;

import java.util.ArrayList;
import java.util.List;

import org.json.*;

public class JSONParser {
	
	public List<Project> parseJSONToProjectList(String JSON){
		List<Project> projectList = new ArrayList<Project>();
		JSONObject jsonMasterObj = new JSONObject(JSON);
		JSONArray arr = jsonMasterObj.getJSONArray(ProjectConstants.PROJECTS);
		
		for (int i = 0; i < arr.length(); i++) {
			Project project = new Project();
			JSONObject jsonObject = arr.getJSONObject(i);
			String title = jsonObject.getString(ProjectConstants.NAME);
			String description = jsonObject.getString(ProjectConstants.BLURB);
			Integer backers = jsonObject.getInt(ProjectConstants.BACKERS_COUNT);
			Integer pledge = jsonObject.getInt(ProjectConstants.PLEDGED);
			Double goal = jsonObject.getDouble(ProjectConstants.GOAL);
			Integer deadline = jsonObject.getInt(ProjectConstants.DEADLINE);
			Integer id = jsonObject.getInt(ProjectConstants.ID);
			String author = jsonObject.getJSONObject(ProjectConstants.CREATOR).getString(ProjectConstants.NAME);
			
			project.setAuthor(author);
			project.setBackers(backers);
			project.setDeadline(deadline);
			project.setDescription(description);
			project.setGoal(goal);
			project.setId(id);
			project.setPledge(pledge);
			project.setTitle(title);
			projectList.add(project);
		}
		return projectList;
	}
	
	public String parseProjectListToJSON(List<Project> projectList){
		String result = "";
		String jsonBegin = "{"+containQuotes(ProjectConstants.PROJECTS)+":[";
		String split = ":";
		String jsonEnd = "]}";
		for(int i=0;i<projectList.size();i++){
			Project project = projectList.get(i);
			String id = containQuotes(ProjectConstants.ID)+split+project.getId();
			String name = containQuotes(ProjectConstants.NAME)+split+project.getTitle();
			String desc = containQuotes(ProjectConstants.BLURB)+split+project.getDescription();
			String author = containQuotes(ProjectConstants.AUTHOR)+split+project.getAuthor();
			String backers = containQuotes(ProjectConstants.BACKERS_COUNT)+split+project.getBackers();
			String goal = containQuotes(ProjectConstants.GOAL)+split+project.getGoal();
			String deadline = containQuotes(ProjectConstants.DEADLINE)+split+project.getDeadline();
			String antiBackers = containQuotes(ProjectConstants.ANTIBACKERS)+split+project.getAntiBackers();
			String antiPledge = containQuotes(ProjectConstants.ANTIPLEDGE)+split+project.getAntiPledge();
			String antiGoal = containQuotes(ProjectConstants.ANTIGOAL)+split+project.getGoal();
		}
		return result;
	}
	
	private String containQuotes(String tag){
		String result = "\""+tag+"\"";
		return result;
	}
}
