package com.ddd.example.fabriccontext.infrastructure;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ddd.example.fabriccontext.entitys.Request;

@Repository
public interface RequestRepository extends CrudRepository<Request, Long>  {

}
