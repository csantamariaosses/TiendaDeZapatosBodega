package cl.csantam.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.csantam.model.entity.Bodega;

public interface BodegaDao extends JpaRepository<Bodega, Integer> {

}
