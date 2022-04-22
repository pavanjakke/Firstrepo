package com.zensar.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class Skill {
	@Id
	int skilllevel;
	@Column
	String skillName;
	
	
	
	public Skill(String skillName) {
		super();
		this.skillName = skillName;
	}
	public Skill(String skillName, int skilllevel) {
		super();
		this.skillName = skillName;
		this.skilllevel = skilllevel;
	}
	public Skill() {
		super();
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public int getSkilllevel() {
		return skilllevel;
	}
	public void setSkilllevel(int skilllevel) {
		this.skilllevel = skilllevel;
	}
	@Override
	public String toString() {
		return "Skill [skillName=" + skillName + ", skilllevel=" + skilllevel + "]";
	}
	
	
	

}
