package com.enigma.task.traineescore.dao;

import java.util.List;

import com.enigma.task.bootcampmaterial.model.BootcampMaterial;
import com.enigma.task.trainee.model.Trainee;
import com.enigma.task.traineescore.exception.CustomException;
import com.enigma.task.traineescore.model.TraineeScore;

public interface TraineeScoreDao {

	public TraineeScore getById(int id) throws CustomException;
	public TraineeScore save(TraineeScore traineeScore) throws CustomException;
	void delete(TraineeScore traineeScore) throws CustomException;
	
	List<TraineeScore> getList() throws CustomException;
	List<TraineeScore> getListByActiveFlag() throws CustomException;
	List<TraineeScore> getBootcampMaterialList(BootcampMaterial bootcampMaterial) throws CustomException;
	List<TraineeScore> getTraineeList(Trainee trainee) throws CustomException;
}
