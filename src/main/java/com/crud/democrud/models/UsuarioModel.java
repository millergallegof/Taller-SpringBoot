package com.crud.democrud.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;


@Data
@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombre;
    private String email;
    private Integer prioridad;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.EAGER,
            targetEntity = RolesModel.class,
            cascade = CascadeType.REMOVE,
            mappedBy = "rolesUsu")
    private Set<RolesModel> roles = new LinkedHashSet<>();

    public UsuarioModel(String nombre, String email, Integer prioridad) {
        this.nombre = nombre;
        this.email = email;
        this.prioridad = prioridad;
    }

    public UsuarioModel() {

    }


}