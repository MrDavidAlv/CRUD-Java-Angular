package com.example.Ejemplo01;

import javax.persistence.*;

@Entity
@Table(name = "empleado")

public class Empleado {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String activity;
	@Column
	private String date1;
	@Column
	private String date2;
	@Column
	private boolean status;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public String getDate1() {
		return date1;
	}
	public void setDate1(String date1) {
		this.date1 = date1;
	}
	public String getDate2() {
		return date2;
	}
	public void setDate2(String date2) {
		this.date2 = date2;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
