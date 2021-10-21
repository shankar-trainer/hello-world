package com.cg.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
@Table(name = "show")
public class Show implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int showId;
	@Temporal(TemporalType.TIME)
	private Date showStartTime;
	@Temporal(TemporalType.TIME)
	private Date showEndtime;
	private String movieName ;
	private String showName;
	
	private int theaterid;
	@OneToMany(targetEntity = Seat.class, cascade=CascadeType.ALL, orphanRemoval=true)
	@JoinColumn(name="showseat_fk", referencedColumnName = "showId")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private List<Seat> seats = new ArrayList<>() ;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
  	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public Date getShowStartTime() {
		return showStartTime;
	}

	public void setShowStartTime(Date showStartTime) {
		this.showStartTime = showStartTime;
	}

	public Date getShowEndtime() {
		return showEndtime;
	}

	public void setShowEndtime(Date showEndtime) {
		this.showEndtime = showEndtime;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public int getTheaterid() {
		return theaterid;
	}

	public void setTheaterid(int theaterid) {
		this.theaterid = theaterid;
	}

	@Override
	public String toString() {
		return "Show [showId=" + showId + ", showStartTime=" + showStartTime + ", showEndtime=" + showEndtime
				+ ", movieName=" + movieName + ", showName=" + showName + ", theaterid=" + theaterid + ", seats="
				+ seats + "]";
	}
}