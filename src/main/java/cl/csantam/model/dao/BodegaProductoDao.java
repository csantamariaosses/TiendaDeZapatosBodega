package cl.csantam.model.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.csantam.model.entity.BodegaProducto;
import cl.csantam.model.entity.Producto;

public interface BodegaProductoDao extends JpaRepository<BodegaProducto, Integer>{
	
//	public List<BodegaProducto> = findAllByIdProducto(Integer idProducto);
	List<BodegaProducto> findByProducto(Producto producto);
	public List<BodegaProducto> getData(HashMap<String, Object> conditions);

}
