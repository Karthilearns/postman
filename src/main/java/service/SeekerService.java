package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dataModel.Seeker;
import repository.SeekerRepository;

@Service 
public class SeekerService implements SeekerServiceInterface{
	
   @Autowired
   SeekerRepository seekerRepo ;
  
   public Seeker registerSeeker(Seeker seeker) {
	  
	   return  seekerRepo.save(seeker);
   }
   
}
