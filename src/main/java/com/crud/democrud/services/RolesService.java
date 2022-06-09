package com.crud.democrud.services;

import com.crud.democrud.models.RolesModel;
import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.repositories.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RolesService {

    @Autowired
    RolesRepository rolesRepository;

    public ArrayList<RolesModel> obtenerRoles(){
        return (ArrayList<RolesModel>) rolesRepository.findAll();
    }

    public RolesModel guardarRol(RolesModel roles, UsuarioModel usuario){
        return rolesRepository.save(roles);
    }
}
