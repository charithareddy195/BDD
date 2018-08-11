package com.cg.eqipmgmtsys.beans;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Equipment")
public class Equipment {
@Id
int equipmentCode;
int equipment_tag;
int sequence_no;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name = "machine_ID")
Comptrack machine_id;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name = "user_id")
User user_id;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name = "location_id")
Location location_id;
String status;
Date end_date;
String comments;
public int getEquipmentCode() {
	return equipmentCode;
}
public void setEquipmentCode(int equipmentCode) {
	this.equipmentCode = equipmentCode;
}
public int getEquipment_tag() {
return equipment_tag;
}
public void setEquipment_tag(int equipment_tag) {
this.equipment_tag = equipment_tag;
}
public int getSequence_no() {
return sequence_no;
}
public void setSequence_no(int sequence_no) {
this.sequence_no = sequence_no;
}
public Location getLocation_id() {
return location_id;
}
public void setLocation_id(Location location_id) {
this.location_id = location_id;
}
public String getStatus() {
return status;
}
public void setStatus(String status) {
this.status = status;
}
public Date getEnd_date() {
return end_date;
}
public void setEnd_date(Date end_date) {
this.end_date = end_date;
}
public String getComments() {
return comments;
}
public void setComments(String comments) {
this.comments = comments;
}
public Comptrack getMachine_id() {
	return machine_id;
}
public void setMachine_id(Comptrack machine_id) {
	this.machine_id = machine_id;
}
public User getUser_id() {
	return user_id;
}
public void setUser_id(User user_id) {
	this.user_id = user_id;
}
public Equipment() {
super();
}


public Equipment(int equipment_tag, int sequence_no, Comptrack machine_id, User user_id, Location location_id,
		String status, Date end_date, String comments) {
	super();
	this.equipment_tag = equipment_tag;
	this.sequence_no = sequence_no;
	this.machine_id = machine_id;
	this.user_id = user_id;
	this.location_id = location_id;
	this.status = status;
	this.end_date = end_date;
	this.comments = comments;
}
@Override
public String toString() {
return "Equipment [equipment_tag=" + equipment_tag + ", sequence_no=" + sequence_no + ", machine_id="
+ machine_id + ", user_id=" + user_id + ", location_id=" + location_id + ", status=" + status
+ ", end_date=" + end_date + ", comments=" + comments + "]";
}
}