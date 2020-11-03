package cl.csantam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.csantam.model.dao.RegionDao;
import cl.csantam.model.entity.Region;

@Service
public class RegionService {
	
	
	@Autowired
	RegionDao  regionDao;
	
	
	public List<Region> getRegiones() {
		return regionDao.findAll();
	}
	

}
