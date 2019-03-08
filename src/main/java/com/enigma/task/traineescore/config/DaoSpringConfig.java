package com.enigma.task.traineescore.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.enigma.task.bootcampmaterial.dao.BootcampMaterialDao;
import com.enigma.task.bootcampmaterial.dao.impl.BootcampMaterialDaoImpl;
import com.enigma.task.trainee.dao.TraineeDao;
import com.enigma.task.trainee.dao.impl.TraineeDaoImpl;
import com.enigma.task.traineescore.dao.TraineeScoreDao;
import com.enigma.task.traineescore.dao.impl.TraineeScoreDaoImpl;

@Configuration
public class DaoSpringConfig {
	
	@Bean
	public TraineeScoreDao traineeScoreDao() {
		return new TraineeScoreDaoImpl();
	}
	
	@Bean
	public TraineeDao traineeDao() {
		return new TraineeDaoImpl();
	}
	
	@Bean
	public BootcampMaterialDao BootcampMaterialDao() {
		return new BootcampMaterialDaoImpl();
	}
	
	@Bean
    public ModelMapper modelMapper() {
    	return new ModelMapper();
    }

}
