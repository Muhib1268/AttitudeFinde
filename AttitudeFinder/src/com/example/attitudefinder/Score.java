package com.example.attitudefinder;

public class Score {
	private int TotalScore=0;
	public void addScore(int score)
	{
		TotalScore+=score;
	}
	public void subtractScore(int score){
		TotalScore-=score;
	}
	public int getCurrentScore(){
		return TotalScore;
	}
	public String getAttitude(){
		if(TotalScore>=45)
			return "Optimist";
		else if(TotalScore>=35 && TotalScore<45)
			return "Confused";
		else
			return "Pessimist";
	}
}
