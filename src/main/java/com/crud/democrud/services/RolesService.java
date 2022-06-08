package com.crud.democrud.services;

import com.crud.democrud.models.RolesModel;
import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.repositories.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class RolesService {

    @Autowired
    RolesRepository rolesRepository;

    public ArrayList<RolesModel> obtenerRoles(){
        return (ArrayList<RolesModel>) rolesRepository.findAll();
    }

    public RolesModel guardarRol(RolesModel roles){
        return rolesRepository.save(roles);
    }

}
