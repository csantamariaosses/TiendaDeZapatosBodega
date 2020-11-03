package cl.csantam.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.csantam.model.dao.ComunaDao;
import cl.csantam.model.dao.ProductoDao;
import cl.csantam.model.entity.Comuna;
import cl.csantam.model.entity.Producto;

@Service
public class ProductoService {
	@Autowired
	ProductoDao  productoDao;
	
	
	public List<Producto> getProductos() {
		return productoDao.findAll();
	}
	
	public Optional<Producto> getProductoById(Integer id) {
		return productoDao.findById(id);
	}
	     

}



