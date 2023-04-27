package com.pack.beanannot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Resort {

	/*@Value(value = "ramcharan")
	private String name;
	@Value(value = "bachelor party")
	private String eventtype;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEventtype() {
		return eventtype;
	}
	public void setEventtype(String eventtype) {
		this.eventtype = eventtype;
	}
	@Override
	public String toString() {
		return "Resort [name=" + name + ", eventtype=" + eventtype + "]";
	}*/
	
	public void display() {
		
		System.out.println("Bookings are open");
	}
	
	
}
