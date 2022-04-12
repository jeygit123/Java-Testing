package com.training;

public class PersonInfo {
	private int height;
	private int weight;
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
	    this.height = height;
	}
	public int getweight() {
		return weight;
	}
	
	public void setweight(int weight) {
		this.weight=weight;
		
	}
	public String getPersonInfo() {
		return "person's height is: " +this.height+" and weight is: "+this.weight;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      PersonInfo p1 = new PersonInfo();
      p1.setHeight(165);
      p1.setweight(60);
      System.out.println(p1.getPersonInfo());
      
      PersonInfo p2 = new PersonInfo();
      p2.setHeight(185);
      p2.setweight(70);
      System.out.println(p2.getPersonInfo());
	}

	
	}

	

	
		
	


