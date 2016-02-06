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
	
	public String parseProjectListToJASON(List<Project> projectList){
		String result = "";
		
		return result;
	}
}
