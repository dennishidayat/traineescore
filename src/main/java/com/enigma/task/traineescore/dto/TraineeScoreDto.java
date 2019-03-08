package com.enigma.task.traineescore.dto;

import com.enigma.task.bootcampmaterial.model.BootcampMaterial;
import com.enigma.task.trainee.model.Trainee;

public class TraineeScoreDto {
	private Integer scoreId;
	private Trainee trainee;
	private BootcampMaterial bootcampMaterial;
	private Double scoreKnowledge;
	private Double scoreProactiveness;
	private Double scoreTask;
	private String notes;
	private Boolean activeFlag;
	
	public TraineeScoreDto(Integer scoreId, Trainee trainee, BootcampMaterial bootcampMaterial, Double scoreKnowledge, Double scoreProactiveness, Double scoreTask, String notes, Boolean activeFlag) {
		this.scoreId = scoreId;
		this.trainee = trainee;
		this.bootcampMaterial = bootcampMaterial;
		this.scoreKnowledge = scoreKnowledge;
		this.scoreProactiveness = scoreProactiveness;
		this.scoreTask = scoreTask;
		this.notes = notes;
		this.activeFlag = activeFlag;
	}

	public BootcampMaterial getBootcampMaterial() {
		return bootcampMaterial;
	}

	public void setBootcampMaterial(BootcampMaterial bootcampMaterial) {
		this.bootcampMaterial = bootcampMaterial;
	}

	public Integer getScoreId() {
		return scoreId;
	}

	public void setScoreId(Integer scoreId) {
		this.scoreId = scoreId;
	}

	public Trainee getTrainee() {
		return trainee;
	}

	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}

	public Double getScoreKnowledge() {
		return scoreKnowledge;
	}

	public void setScoreKnowledge(Double scoreKnowledge) {
		this.scoreKnowledge = scoreKnowledge;
	}

	public Double getScoreProactiveness() {
		return scoreProactiveness;
	}

	public void setScoreProactiveness(Double scoreProactiveness) {
		this.scoreProactiveness = scoreProactiveness;
	}

	public Double getScoreTask() {
		return scoreTask;
	}

	public void setScoreTask(Double scoreTask) {
		this.scoreTask = scoreTask;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Boolean getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

	public TraineeScoreDto() {}

	
}
