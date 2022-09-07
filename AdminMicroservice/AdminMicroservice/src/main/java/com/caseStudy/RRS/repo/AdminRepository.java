package com.caseStudy.RRS.repo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.caseStudy.RRS.model.Admin;

@Repository
public interface AdminRepository extends MongoRepository<Admin, String>{

	//List<Train> findByName(String string);

 

 

	 

	 

}