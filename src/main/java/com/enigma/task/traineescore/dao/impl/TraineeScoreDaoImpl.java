package com.enigma.task.traineescore.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;

import com.enigma.task.bootcampmaterial.model.BootcampMaterial;
import com.enigma.task.trainee.model.Trainee;
import com.enigma.task.traineescore.dao.TraineeScoreDao;
import com.enigma.task.traineescore.exception.CustomException;
import com.enigma.task.traineescore.model.TraineeScore;
import com.enigma.task.traineescore.repository.TraineeScoreRepository;

public class TraineeScoreDaoImpl extends BaseImpl implements TraineeScoreDao {
	
	@Autowired
	public TraineeScoreRepository repository;

	public TraineeScore getById(int id) throws CustomException {
		return repository.findById(id).orElse(null);
	}

	public TraineeScore save(TraineeScore traineeScore) throws CustomException {
		return repository.save(traineeScore);
	}

	public void delete(TraineeScore traineeScore) throws CustomException {
		repository.delete(traineeScore);
	}

	public List<TraineeScore> getList() throws CustomException {
		CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<TraineeScore> query = critB.createQuery(TraineeScore.class);
		Root<TraineeScore> root = query.from(TraineeScore.class);
		query.select(root);
		
		TypedQuery<TraineeScore> i = em.createQuery(query);
		
		return i.getResultList();
	}

	public List<TraineeScore> getListByActiveFlag() throws CustomException {
		CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<TraineeScore> query = critB.createQuery(TraineeScore.class);
		Root<TraineeScore> root = query.from(TraineeScore.class);
		query = query.select(root)
				.where(critB.equal(root.get("activeFlag"), 1));
		
		TypedQuery<TraineeScore> i = em.createQuery(query);
		
		return i.getResultList();
	}

	public List<TraineeScore> getBootcampMaterialList(BootcampMaterial bootcampMaterial) throws CustomException {
		return repository.findByBootcampMaterial(bootcampMaterial);
	}

	public List<TraineeScore> getTraineeList(Trainee trainee) throws CustomException {
		return repository.findByTrainee(trainee);
	}
	
}
