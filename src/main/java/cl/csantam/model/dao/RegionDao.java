package cl.csantam.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.csantam.model.entity.Region;

public interface RegionDao extends JpaRepository<Region, Integer> {
}
