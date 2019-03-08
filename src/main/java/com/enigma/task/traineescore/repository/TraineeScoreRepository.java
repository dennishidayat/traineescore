package com.enigma.task.traineescore.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.enigma.task.bootcampmaterial.model.BootcampMaterial;
import com.enigma.task.trainee.model.Trainee;
import com.enigma.task.traineescore.model.TraineeScore;


public interface TraineeScoreRepository extends PagingAndSortingRepository<TraineeScore, Integer> {
	
	List<TraineeScore> findByBootcampMaterial(BootcampMaterial bootcampMaterial);
	List<TraineeScore> findByTrainee(Trainee trainee);
}
