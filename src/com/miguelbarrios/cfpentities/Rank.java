package com.miguelbarrios.cfpentities;

public class Rank {
	private int rank;
	
	private String school;
	
	private String conference;
	
	private int firstPlaceVotes;
	
	private int points;

	public Rank(int rank, String school, String conference, int firstPlaceVotes, int points) {
		super();
		this.rank = rank;
		this.school = school;
		this.conference = conference;
		this.firstPlaceVotes = firstPlaceVotes;
		this.points = points;
	}

	@Override
	public String toString() {
		return "Rank [rank=" + rank + ", school=" + school + ", conference=" + conference + ", firstPlaceVotes="
				+ firstPlaceVotes + ", points=" + points + "]";
	}
	
	
}