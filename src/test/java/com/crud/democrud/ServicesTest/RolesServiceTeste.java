package com.crud.democrud.ServicesTest;

import com.crud.democrud.models.RolesModel;
import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.repositories.RolesRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class RolesServiceTeste {

    @Autowired
    RolesRepository rolesRepository;

//    @Test
//    public void testGuardarRoles() {
//        UsuarioModel usuarioModel = new UsuarioModel("Miller", "drc@gmail.com", 5);
//        RolesModel rolesModel = new RolesModel("vendedor", usuarioModel);
//        RolesModel usuarioModelRegistrado = rolesRepository.save(rolesModel);
//        assertNotNull(usuarioModelRegistrado);
//    }

    @Test
    public void testListarRol() {
        List<RolesModel> usuarioRolList = (List<RolesModel>) rolesRepository.findAll();
        assertThat(usuarioRolList).size().isGreaterThan(0);
    }

}
