package com.se.alaf.security.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//public class UserA {

@Entity
@Table(name = "_user")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UserA implements Serializable {

	
	public UserA(String username, String password, List<RoleA> rolelist) {
		this.username = username;
			this.password = password;
			this.roleList = rolelist;
	}
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	//@JoinColumn(name = "pc_fid", referencedColumnName = "id")
	private List<RoleA> roleList;

	
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		return buf.append("username: "+ username +"\npasspword: " + password 
				+ "\nRoles: "+ roleList.stream().map(RoleA::getName).reduce("", String::concat)).toString();
				
	}
}
