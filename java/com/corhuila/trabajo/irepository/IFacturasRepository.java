package com.corhuila.trabajo.irepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corhuila.trabajo.entity.Facturas;

public interface IFacturasRepository extends JpaRepository<Facturas, Long>{

}
