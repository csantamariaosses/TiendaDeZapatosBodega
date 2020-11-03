package cl.csantam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.csantam.model.dao.ComunaDao;
import cl.csantam.model.dao.RegionDao;
import cl.csantam.model.entity.Comuna;
import cl.csantam.model.entity.Region;

@Service
public class ComunaService {
	
	@Autowired
	ComunaDao  comunaDao;
	
	
	public List<Comuna> getComunas() {
		return comunaDao.findAll();
	}

}
