package com.enigma.task.traineescore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.enigma.task.bootcampmaterial.model.BootcampMaterial;
import com.enigma.task.trainee.model.Trainee;

@Entity
@Table(name="trainee_score", schema="enigma_app")
public class TraineeScore {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="score_id")
	private int scoreId;
	@ManyToOne
	@JoinColumn(name="trainee_id")
	private Trainee trainee;
	@ManyToOne
	@JoinColumn(name="bootcamp_material_id")
	private BootcampMaterial bootcampMaterial;
	@Column(name="score_knowledge")
	private double scoreKnowledge;
	@Column(name="score_proactiveness")
	private double scoreProactiveness;
	@Column(name="score_task")
	private double scoreTask;
	@Column(name="notes")
	private String notes;
	@Column(name="active_flag")
	private Boolean activeFlag;
	
	public TraineeScore(int scoreId, Trainee trainee, BootcampMaterial bootcampMaterial, double scoreKnowledge, double scoreProactiveness, double scoreTask, String notes, Boolean activeFlag) {
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

	public int getScoreId() {
		return scoreId;
	}

	public void setScoreId(int scoreId) {
		this.scoreId = scoreId;
	}

	public Trainee getTrainee() {
		return trainee;
	}

	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}

	public double getScoreKnowledge() {
		return scoreKnowledge;
	}

	public void setScoreKnowledge(double scoreKnowledge) {
		this.scoreKnowledge = scoreKnowledge;
	}

	public double getScoreProactiveness() {
		return scoreProactiveness;
	}

	public void setScoreProactiveness(double scoreProactiveness) {
		this.scoreProactiveness = scoreProactiveness;
	}

	public double getScoreTask() {
		return scoreTask;
	}

	public void setScoreTask(double scoreTask) {
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

	public TraineeScore() {}
	
	
}
