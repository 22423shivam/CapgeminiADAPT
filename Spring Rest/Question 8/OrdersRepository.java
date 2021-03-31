package com.capgemini.springrest;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends MongoRepository<Product, String> {
	
	Product findBy_id(ObjectId _id);

	// all abstract functions will be implemented in the SERVICE LAYER
	
}
