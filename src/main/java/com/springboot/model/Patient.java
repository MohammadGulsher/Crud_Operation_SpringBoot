package com.springboot.model;

import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String address;
	 @CreatedDate
	 @Column(updatable = false)
	 @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime date;
	private String saturday;
	private String sunday;
	private String monday;
	private String tuesday;
	private String wednesday;
	private String thursday;
	private String friday;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Patient(int id, String name, String email, String address, LocalDateTime date, String saturday,
			String sunday, String monday, String tuesday, String wednesday, String thursday, String friday) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.date = date;
		this.saturday = saturday;
		this.sunday = sunday;
		this.monday = monday;
		this.tuesday = tuesday;
		this.wednesday = wednesday;
		this.thursday = thursday;
		this.friday = friday;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	/**
	 * @return the saturday
	 */
	public String getSaturday() {
		return saturday;
	}
	/**
	 * @param saturday the saturday to set
	 */
	public void setSaturday(String saturday) {
		this.saturday = saturday;
	}
	/**
	 * @return the sunday
	 */
	public String getSunday() {
		return sunday;
	}
	/**
	 * @param sunday the sunday to set
	 */
	public void setSunday(String sunday) {
		this.sunday = sunday;
	}
	/**
	 * @return the monday
	 */
	public String getMonday() {
		return monday;
	}
	/**
	 * @param monday the monday to set
	 */
	public void setMonday(String monday) {
		this.monday = monday;
	}
	/**
	 * @return the tuesday
	 */
	public String getTuesday() {
		return tuesday;
	}
	/**
	 * @param tuesday the tuesday to set
	 */
	public void setTuesday(String tuesday) {
		this.tuesday = tuesday;
	}
	/**
	 * @return the wednesday
	 */
	public String getWednesday() {
		return wednesday;
	}
	/**
	 * @param wednesday the wednesday to set
	 */
	public void setWednesday(String wednesday) {
		this.wednesday = wednesday;
	}
	/**
	 * @return the thursday
	 */
	public String getThursday() {
		return thursday;
	}
	/**
	 * @param thursday the thursday to set
	 */
	public void setThursday(String thursday) {
		this.thursday = thursday;
	}
	/**
	 * @return the friday
	 */
	public String getFriday() {
		return friday;
	}
	/**
	 * @param friday the friday to set
	 */
	public void setFriday(String friday) {
		this.friday = friday;
	}


	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", date=" + date
				+ ", saturday=" + saturday + ", sunday=" + sunday + ", monday=" + monday + ", tuesday=" + tuesday
				+ ", wednesday=" + wednesday + ", thursday=" + thursday + ", friday=" + friday + "]";
	}
	

}
