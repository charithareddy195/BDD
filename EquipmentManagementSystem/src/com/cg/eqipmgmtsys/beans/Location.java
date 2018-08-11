package com.cg.eqipmgmtsys.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Location")
public class Location {
@Id
@Column(name ="location_id")
int location_id;
String location_name;
public int getLocation_id() {
return location_id;
}
public void setLocation_id(int location_id) {
this.location_id = location_id;
}
public String getLocation_name() {
return location_name;
}
public void setLocation_name(String location_name) {
this.location_name = location_name;
}
public Location(int location_id, String location_name) {
super();
this.location_id = location_id;
this.location_name = location_name;
}
public Location() {
super();
}
@Override
public String toString() {
return "Location [location_id=" + location_id + ", location_name=" + location_name + "]";
}
}