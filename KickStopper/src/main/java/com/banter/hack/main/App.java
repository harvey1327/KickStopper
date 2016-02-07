package com.banter.hack.main;

import java.util.List;

import com.banter.hack.scrape.JSONParser;
import com.banter.hack.scrape.Project;
import com.banter.hack.scrape.Scrape;

public class App 
{
    public static void main(String[] args)
    {
    	String searchTerm = "maxwell and friends play games";
		List<Project> projectList = new Scrape().getKickstarterScrape(searchTerm);
		String test = new JSONParser().parseProjectListToJSON(projectList);
		System.out.println(test);
    }
}
