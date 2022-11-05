package com.corhuila.trabajo.irepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corhuila.trabajo.entity.Usuarios;

public interface IUsuariosRepository extends JpaRepository<Usuarios, Long>{

}
