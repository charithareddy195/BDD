package com.cg.eqipmgmtsys.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
@Id
int user_id;
String designation;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name = "location_id")
Location location_id;
int department_id;
String password;
boolean authorization;
public int getUser_id() {
return user_id;
}
public void setUser_id(int user_id) {
this.user_id = user_id;
}
public String getDesignation() {
return designation;
}
public void setDesignation(String designation) {
this.designation = designation;
}
public Location getLocation_id() {
return location_id;
}
public void setLocation_id(Location location_id) {
this.location_id = location_id;
}
public int getDepartment_id() {
return department_id;
}
public void setDepartment_id(int department_id) {
this.department_id = department_id;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}
public boolean isAuthorization() {
return authorization;
}
public void setAuthorization(boolean authorization) {
this.authorization = authorization;
}
public User(int user_id, String designation, Location location_id, int department_id, String password,
boolean authorization) {
super();
this.user_id = user_id;
this.designation = designation;
this.location_id = location_id;
this.department_id = department_id;
this.password = password;
this.authorization = authorization;
}
public User() {
super();
}
@Override
public String toString() {
return "User [user_id=" + user_id + ", designation=" + designation + ", location_id=" + location_id
+ ", department_id=" + department_id + ", password=" + password + ", authorization=" + authorization
+ "]";
}
}
