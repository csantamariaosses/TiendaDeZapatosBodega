package cl.csantam.model.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.csantam.model.entity.Producto;

public interface ProductoDao extends JpaRepository<Producto, Integer>{
	
	Optional<Producto> findById(Integer id );

}
