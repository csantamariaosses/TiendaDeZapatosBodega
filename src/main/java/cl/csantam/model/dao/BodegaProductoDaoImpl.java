package cl.csantam.model.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import cl.csantam.model.entity.BodegaProducto;

public class BodegaProductoDaoImpl {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public List<BodegaProducto> getData(HashMap<String, Object> conditions)
	{
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<BodegaProducto> query = cb.createQuery(BodegaProducto.class);
		Root<BodegaProducto> root = query.from(BodegaProducto.class);
		
		List<Predicate> predicates = new ArrayList<>();
		conditions.forEach((field,value) ->
		{
			switch (field)
			{
				case "producto":
					predicates.add(cb.equal(root.get(field), (Integer)value));
					break;
				case "region":
					predicates.add(cb.equal(root.get(field), (Integer)value));
					break;
				case "comuna":
//					predicates.add(cb.like(root.get(field),"%"+(String)value+"%"));
					predicates.add(cb.equal(root.get(field), (Integer)value));
					break;
				case "bodega":
//					predicates.add(cb.like(root.get(field),"%"+(String)value+"%"));
					predicates.add(cb.equal(root.get(field), (Integer)value));
					break;
			}
			
		});
		
		System.out.println("PREDICADO:::SIZE:" +  predicates.size());
		query.select(root).where(predicates.toArray(new Predicate[predicates.size()]));
		
		List<BodegaProducto> listado = entityManager.createQuery(query).getResultList(); 
		System.out.println("LISTADO:::SIZE:" +  listado.size());
		return entityManager.createQuery(query).getResultList(); 
	}

}
