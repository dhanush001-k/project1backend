package com.example.Project1CC1.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="game_details")
public class EntityDetails {
	@Id
	@Column(name="gid")
	private int gid;
	@Column(name="gname")
	private String gname;
	@Column(name="genre")
	private String genre;
	@Column(name="gprice")
	private int gprice;
	@Column(name="grelease")
	private int grelease;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	

	public int getGprice() {
		return gprice;
	}
	public void setGprice(int gprice) {
		this.gprice = gprice;
	}
	public int getGrelease() {
		return grelease;
	}
	public void setGrelease(int grelease) {
		this.grelease = grelease;
	}
	
	public EntityDetails(int gid, String gname, String genre, int gprice, int grelease) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.genre= genre;
		this.gprice = gprice;
		this.grelease = grelease;
	}
	
	public EntityDetails() {
		
	}
	public String toString()
	{
		return "gid="+gid+"gname="+gname+"genre="+genre+"gprice="+gprice+"grelease="+grelease;
	}
}