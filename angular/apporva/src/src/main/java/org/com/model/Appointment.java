package org.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appointmentId;
	private int userId;
	private int diagnosticCentreId;
	private int testId;
	private String date1;
	private String time1;
	private float totalCost;
	private Boolean approved;
	
//	@ManyToOne
//	@JoinColumn(name="diagnosticCentreId")
//	private DiagnosticCentre diagnosticCentre;
	
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getDiagnosticCentreId() {
		return diagnosticCentreId;
	}
	public void setDiagnosticCentreId(int diagnosticCentreId) {
		this.diagnosticCentreId = diagnosticCentreId;
	}
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public String getDate1() {
		return date1;
	}
	public void setDate1(String date1) {
		this.date1 = date1;
	}
	public String getTime1() {
		return time1;
	}
	public void setTime1(String time1) {
		this.time1 = time1;
	}
	public float getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}
	public Boolean getApproved() {
		return approved;
	}
	public void setApproved(Boolean approved) {
		this.approved = approved;
	}
	
//	public DiagnosticCentre getDiagnosticCentre() {
//		return diagnosticCentre;
//	}
//	public void setDiagnosticCentre(DiagnosticCentre diagnosticCentre) {
//		this.diagnosticCentre = diagnosticCentre;
//	}
	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", userId=" + userId + ", testId=" + testId + ", date1="
				+ date1 + ", time1=" + time1 + ", totalCost=" + totalCost + ", approved=" + approved + "]";
	}
	
	
	
}
