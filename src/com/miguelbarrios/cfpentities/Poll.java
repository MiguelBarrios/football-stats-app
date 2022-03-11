package com.miguelbarrios.cfpentities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Poll {

	private String name;
	
	private int week;
	
	private int season;

	private List<PollItem> items;
	
	public Poll(String name, int week, int season) {
		this.name = name;
		this.week = week;
		this.season = season;
		items = new ArrayList<>();
		if(name.equals("AP Top 25"))
			System.out.printf("name: %s season: %s week: %d\n", name, season, week);
	}
	
	public List<PollItem> getItems() {
		return this.items;
	}

	public void addItem(PollItem item) {
		this.items.add(item);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String pollInfo() {
		return name + " " + " season: " + season + " week: " + week;
	}
	
	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public int getSeason() {
		return season;
	}

	public void setSeason(int season) {
		this.season = season;
	}

	public void displayPoll() {
		System.out.println(pollInfo());
		for(PollItem item : items) {
			String res = String.format("\t%s coference: %s rank: %d points: %d", item.getSchool(), item.getConference(),item.getRank(), item.getPoints());
			System.out.println(res);
		}
	}
	
	


	
	

}