package com.example.demo.model;

	import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Data;
	import lombok.NoArgsConstructor;
	import org.hibernate.validator.constraints.Length;

	import javax.persistence.*;
	import javax.validation.constraints.Email;
	import javax.validation.constraints.NotEmpty;

import java.util.HashSet;
import java.util.Set;
	@Data
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	@Entity
	@Table(name = "users")
	public class User {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "user_id")
	    private int id;
	    @Column(name = "user_name")
	    @Length(min = 5, message = "*Your user name must have at least 5 characters")
	    @NotEmpty(message = "*Please provide a user name")
	    private String userName;
	    @Column(name = "email")
	    @Email(message = "*Please provide a valid Email")
	    @NotEmpty(message = "*Please provide an email")
	    private String email;
	    @Column(name = "password")
	    @Length(min = 5, message = "*Your password must have at least 5 characters")
	    @NotEmpty(message = "*Please provide your password")
	    private String password;
	    @Column(name = "name")
	    @NotEmpty(message = "*Please provide your name")
	    private String name;
	    @Column(name = "last_name")
	    @NotEmpty(message = "*Please provide your last name")
	    private String lastName;
	    @Column(name = "active")
	    private Boolean active;
	    @ManyToMany(cascade = CascadeType.MERGE)
	    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	    private Set<Role> roles;
	    
	    
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public void setActive(Boolean active) {
			this.active = active;
		}
		public void setRoles(Set<Role> roles) {
			this.roles = roles;
		}
		public Set<Role> getRoles() {
			// TODO Auto-generated method stub
			return null;
		}
		public String getUserName() {
			// TODO Auto-generated method stub
			return null;
		}
		public String getPassword() {
			// TODO Auto-generated method stub
			return null;
		}
		public void setPassword(String encode) {
			// TODO Auto-generated method stub
			
		}
		public void setActive(boolean b) {
			// TODO Auto-generated method stub
			
		}
		public void setRoles(HashSet<Role> hashSet) {
			// TODO Auto-generated method stub
			
		}
		public String getName() {
			// TODO Auto-generated method stub
			return null;
		}
		public boolean getActive() {
			// TODO Auto-generated method stub
			return false;
		}
		public String getLastName() {
			// TODO Auto-generated method stub
			return null;
		}
		public String getEmail() {
			// TODO Auto-generated method stub
			return null;
		}
		public static Object builder() {
			// TODO Auto-generated method stub
			return null;
		}

	}
	

