package com.cg.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;



@Entity
@Table(name = "theater")
public class Theater implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int theaterId;
	private String theaterName;
	private String theaterCity;
	
	@OneToMany(targetEntity = Movie.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="tm_fk", referencedColumnName = "theaterId")
	@OnDelete(action=OnDeleteAction.CASCADE) 
	private List<Movie> movies = new ArrayList<>();
	
	@OneToMany(targetEntity = Screen.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name= "ts_fk", referencedColumnName = "theaterId")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private List<Screen> screens = new ArrayList<>();
	private String managerName;
	@Column(length = 10)
	private String managerContact;

	public Theater() {

	}

	public Theater(String theaterName, String theaterCity, List<Movie> movies, List<Screen> screens, String managerName,
			String managerContact) {
		super();
		this.theaterName = theaterName;
		this.theaterCity = theaterCity;
		this.movies = movies;
		this.screens = screens;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}


	public int getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getTheaterCity() {
		return theaterCity;
	}

	public void setTheaterCity(String theaterCity) {
		this.theaterCity = theaterCity;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public List<Screen> getScreens() {
		return screens;
	}

	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerContact() {
		return managerContact;
	}

	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}

	@Override
	public String toString() {
		return "Theater [theaterId=" + theaterId + ", theaterName=" + theaterName + ", theaterCity=" + theaterCity
				+ ", movies=" + movies + ", screens=" + screens + ", managerName=" + managerName + ", managerContact="
				+ managerContact + "]";
	}

}
