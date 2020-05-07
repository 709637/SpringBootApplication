package io.firstapp.springbootstarter.topic;


public class Topic {
	
private String name;
private String description;
private String skills;

public Topic(){
	
}

public Topic(String Name,String Description,String Skills) {
	this.description = Description;
	this.name = Name;
	this.skills = Skills;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getSkills() {
	return skills;
}
public void setSkills(String skills) {
	this.skills = skills;
}



}
