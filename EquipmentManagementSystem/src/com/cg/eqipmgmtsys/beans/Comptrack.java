package com.cg.eqipmgmtsys.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comptrack {
String compt_name;
String disc_capacity;
String total_installed_memory;
int network_card_number;
String network_manufacture_name;
String free_space;
String os;
String os_version;
@Id
String machine_ID;
public String getCompt_name() {
return compt_name;
}
public void setCompt_name(String compt_name) {
this.compt_name = compt_name;
}
public String getDisc_capacity() {
return disc_capacity;
}
public void setDisc_capacity(String disc_capacity) {
this.disc_capacity = disc_capacity;
}
public String getTotal_installed_memory() {
return total_installed_memory;
}
public void setTotal_installed_memory(String total_installed_memory) {
this.total_installed_memory = total_installed_memory;
}
public int getNetwork_card_number() {
return network_card_number;
}
public void setNetwork_card_number(int network_card_number) {
this.network_card_number = network_card_number;
}
public String getNetwork_manufacture_name() {
return network_manufacture_name;
}
public void setNetwork_manufacture_name(String network_manufacture_name) {
this.network_manufacture_name = network_manufacture_name;
}
public String getFree_space() {
return free_space;
}
public void setFree_space(String free_space) {
this.free_space = free_space;
}
public String getOs() {
return os;
}
public void setOs(String os) {
this.os = os;
}
public String getOs_version() {
return os_version;
}
public void setOs_version(String os_version) {
this.os_version = os_version;
}
public String getMachine_ID() {
return machine_ID;
}
public void setMachine_ID(String machine_ID) {
this.machine_ID = machine_ID;
}
public Comptrack(String compt_name, String disc_capacity, String total_installed_memory, int network_card_number,
String network_manufacture_name, String free_space, String os, String os_version, String machine_ID) {
super();
this.compt_name = compt_name;
this.disc_capacity = disc_capacity;
this.total_installed_memory = total_installed_memory;
this.network_card_number = network_card_number;
this.network_manufacture_name = network_manufacture_name;
this.free_space = free_space;
this.os = os;
this.os_version = os_version;
this.machine_ID = machine_ID;
}
@Override
public String toString() {
return "Comptrack [compt_name=" + compt_name + ", disc_capacity=" + disc_capacity + ", total_installed_memory="
+ total_installed_memory + ", network_card_number=" + network_card_number
+ ", network_manufacture_name=" + network_manufacture_name + ", free_space=" + free_space + ", os=" + os
+ ", os_version=" + os_version + ", machine_ID=" + machine_ID + "]";
}
public Comptrack() {
super();
}
}