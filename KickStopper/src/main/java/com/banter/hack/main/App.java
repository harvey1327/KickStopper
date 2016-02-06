package com.banter.hack.main;

import com.banter.hack.scrape.Scrape;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
    	String searchTerm = "art";
		String test = new Scrape().getKickstarterScrape(searchTerm).toString();
		System.out.println(test);
    }
}
