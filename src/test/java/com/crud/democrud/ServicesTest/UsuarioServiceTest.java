package com.crud.democrud.ServicesTest;

import com.crud.democrud.models.RolesModel;
import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.repositories.RolesRepository;
import com.crud.democrud.repositories.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static  org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class UsuarioServiceTest {
    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    RolesRepository rolesRepository;

    @Test
    public void testGuardarUsuario(){
        UsuarioModel usuarioModel=new UsuarioModel("aquaman","aqua@gmail.com",99);
        UsuarioModel usuarioModelRegistrado = usuarioRepository.save(usuarioModel);
        assertNotNull(usuarioModelRegistrado);
    }

    @Test
    public void testGuardarRoles(){
        UsuarioModel usuarioModel=new UsuarioModel("aquaman","aqua@gmail.com",99);
        RolesModel rolesModel = new RolesModel("Vendedor", usuarioModel);
        RolesModel usuarioModelRegistrado = rolesRepository.save(rolesModel);
        assertNotNull(usuarioModelRegistrado);
    }

    @Test
    public void testListarRol(){
        List<RolesModel> usuarioRolList=(List<RolesModel>) rolesRepository.findAll();
        assertThat(usuarioRolList).size().isGreaterThan(0);
    }

    @Test
    public void testBuscarUsuarioPorId(){
        Long idBuscado=1L;
        Optional<UsuarioModel> usuarioModelBuscado=usuarioRepository.findById(idBuscado);
        assertThat(usuarioModelBuscado.get().getId()).isEqualTo(idBuscado);
    }

    @Test
    public void testListarUsuarios(){
        List<UsuarioModel> usuarioModelList=(List<UsuarioModel>) usuarioRepository.findAll();
        assertThat(usuarioModelList).size().isGreaterThan(0);
    }
}
