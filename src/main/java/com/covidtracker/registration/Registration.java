package com.covidtracker.registration;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registration {
	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String phone;
	private String email;
	private Date Birthday;
	private String reportNumber;
	private String blockName;
	private String suggeationbyDoctor;
	
 
	
	
	
	
	
	

}
