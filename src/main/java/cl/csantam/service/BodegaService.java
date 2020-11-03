package cl.csantam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.csantam.model.dao.BodegaDao;
import cl.csantam.model.dao.ProductoDao;
import cl.csantam.model.entity.Bodega;
import cl.csantam.model.entity.Producto;

@Service
public class BodegaService {
	@Autowired
	BodegaDao  bodegaDao;
	
	
	public List<Bodega> getBodegas() {
		return bodegaDao.findAll();
	}
}
