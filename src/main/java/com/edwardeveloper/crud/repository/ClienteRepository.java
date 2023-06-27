package com.edwardeveloper.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClienteRepository extends PagingAndSortingRepository<ClienteEntity, Long>, CrudRepository<ClienteEntity,Long> {
    List<ClienteEntity> findAll();
}
