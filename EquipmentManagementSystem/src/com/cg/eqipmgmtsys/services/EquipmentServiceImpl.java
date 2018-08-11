package com.cg.eqipmgmtsys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.eqipmgmtsys.beans.Equipment;
import com.cg.eqipmgmtsys.repo.EquipmentRepo;
@Component(value="equipmentService")
public class EquipmentServiceImpl implements EquipmentService{
	@Autowired(required=true)
	private EquipmentRepo repo;
	@Override
	public Equipment installEquipment(int userId, String status, int equipTag) {
		// TODO Auto-generated method stub
		return repo.installEquipment(userId, status, equipTag);
	}

	@Override
	public Equipment moveEquipment(int userId, String status, int equipTag) {
		// TODO Auto-generated method stub
		return repo.moveEquipment(userId, status, equipTag);
	}

	@Override
	public List<Equipment> queryByEquipTag(int equipTag) {
		// TODO Auto-generated method stub
		return repo.findByEquipTag(equipTag);
	}

	@Override
	public List<Equipment> queryBySeqNo(int seqNo) {
		// TODO Auto-generated method stub
		return repo.findBySeqNo(seqNo);
	}

	@Override
	public List<Equipment> queryByLocation(int locationId) {
		// TODO Auto-generated method stub
		return repo.findByLocation(locationId);
	}

	@Override
	public List<Equipment> queryByMachineId(int machineId) {
		// TODO Auto-generated method stub
		return repo.findByMachineId(machineId);
	}

	@Override
	public List<Equipment> queryByUserId(int userId) {
		// TODO Auto-generated method stub
		return repo.findByUserId(userId);
	}

	@Override
	public List<Equipment> getAllEquipments() {
		return repo.findAll();
	}

	@Override
	public Equipment getEquipment(int equipCode) {
		// TODO Auto-generated method stub
		return repo.findOne(equipCode);
	}

}
