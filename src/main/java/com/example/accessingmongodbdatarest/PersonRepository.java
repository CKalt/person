
package com.example.accessingmongodbdatarest;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository 
    extends MongoRepository<Person, String>, QuerydslPredicateExecutor<Person> {
	List<Person> findByLastName(@Param("name") String name);
}
