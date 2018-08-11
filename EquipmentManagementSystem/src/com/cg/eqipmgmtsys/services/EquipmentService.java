package com.cg.eqipmgmtsys.services;

import java.util.List;

import com.cg.eqipmgmtsys.beans.Equipment;

public interface EquipmentService {

	Equipment installEquipment(int userId, String status, int equipTag);
	Equipment moveEquipment(int userId, String status, int equipTag);
	List<Equipment> queryByEquipTag(int equipTag);
	List<Equipment> queryBySeqNo(int seqNo);
	List<Equipment> queryByLocation(int locationId);
	List<Equipment> queryByMachineId(int machineId);
	List<Equipment> queryByUserId(int userId);
	List<Equipment> getAllEquipments();
	Equipment getEquipment(int equipTag);
	
}
