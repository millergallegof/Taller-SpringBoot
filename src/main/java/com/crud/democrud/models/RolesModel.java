package com.crud.democrud.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "roles")
public class RolesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(name = "rol_name", nullable = false, length = 45)
    private String rolNombre;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "roles_usu_id", nullable = false)
    private UsuarioModel rolesUsu;


}
