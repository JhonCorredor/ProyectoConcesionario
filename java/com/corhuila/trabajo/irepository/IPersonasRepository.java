package com.corhuila.trabajo.irepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corhuila.trabajo.entity.Personas;

public interface IPersonasRepository extends JpaRepository<Personas, Long>{

}
