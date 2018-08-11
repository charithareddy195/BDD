package com.cg.eqipmgmtsys.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.eqipmgmtsys.beans.Equipment;

public interface EquipmentRepo extends JpaRepository<Equipment,Integer>{
	@Query("SELECT equip FROM Equipment equip WHERE equip.sequence_no=:seqNo")
	List<Equipment> findBySeqNo(@Param("seqNo")Integer seqNo);
	@Query("SELECT equip FROM Equipment equip WHERE equip.equipment_tag=:eTag")
	List<Equipment> findByEquipTag(@Param("eTag")Integer eTag);
	@Query("SELECT equip FROM Equipment equip WHERE equip.location_id=:locId")
	List<Equipment> findByLocation(@Param("locId")Integer locId);
	@Query("SELECT equip FROM Equipment equip WHERE equip.user_id=:userId")
	List<Equipment> findByUserId(@Param("userId")Integer userId);
	@Query("SELECT equip FROM Equipment equip WHERE equip.machine_id=:machineId")
	List<Equipment> findByMachineId(@Param("machineId")Integer machineId);
	@Modifying(clearAutomatically = true)
    @Query("UPDATE Equipment equip SET equip.user_id = :userId, equip.status = :status WHERE equip.equipment_tag = :eTag")
    Equipment installEquipment(@Param("userId") int userId, @Param("status") String status, @Param("eTag") int eTag);
	
	@Modifying(clearAutomatically = true)
    @Query("UPDATE Equipment equip SET equip.user_id = :userId, equip.status = :status WHERE equip.equipment_tag = :eTag")
    Equipment moveEquipment(@Param("userId") int userId, @Param("status") String status, @Param("eTag") int eTag);
}
