package com.crud.democrud.repositories;

import com.crud.democrud.models.RolesModel;
import org.springframework.data.repository.CrudRepository;

public interface RolesRepository extends CrudRepository<RolesModel, Long> {
}