package com.capgemini.springrest;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends MongoRepository<Users, String> {
  
	// to be implemented later in REST CONTROLLER
	// as SERVICE LAYER is skipped
	Users findBy_id(ObjectId _id);

	/*
	 * not used
	 * MONGO implementation
	 */
	//void deleteById(ObjectId id);
}