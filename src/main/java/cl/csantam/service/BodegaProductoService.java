package cl.csantam.service;

import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.csantam.model.dao.BodegaDao;
import cl.csantam.model.dao.BodegaProductoDao;
import cl.csantam.model.dao.BodegaProductoDaoImpl;
import cl.csantam.model.dao.ComunaDao;
import cl.csantam.model.dao.ProductoDao;
import cl.csantam.model.dao.RegionDao;
import cl.csantam.model.dto.FormDto;
import cl.csantam.model.entity.Bodega;
import cl.csantam.model.entity.BodegaProducto;
import cl.csantam.model.entity.Comuna;
import cl.csantam.model.entity.Producto;
import cl.csantam.model.entity.Region;

@Service
public class BodegaProductoService {
	@Autowired
	BodegaProductoDao  bodegaProductoDao;
	
	@Autowired
	BodegaProductoDaoImpl  bodegaProductoDaoImpl;
	
	@Autowired
	RegionDao  regionDao;
	
	@Autowired
	ComunaDao  comunaDao;
	
	@Autowired
	BodegaDao  bodegaDao;
	
	@Autowired
	ProductoDao  productoDao;
	
	public List<BodegaProducto> getProductos() {
		return bodegaProductoDao.findAll();
	}	

	public List<BodegaProducto> getProductosByProducto(Producto producto) {
		return bodegaProductoDao.findByProducto(producto);
	}
	
	public List<BodegaProducto> getData(HashMap<String, Object> conditions)
	{
		return bodegaProductoDaoImpl.getData(conditions);
	}
	
	
}
