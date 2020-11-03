package cl.csantam.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.csantam.model.entity.Comuna;

public interface ComunaDao extends JpaRepository<Comuna, Integer> {
}
