package cl.csantam.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.csantam.model.dto.FormDto;
import cl.csantam.model.entity.Bodega;
import cl.csantam.model.entity.BodegaProducto;
import cl.csantam.model.entity.Comuna;
import cl.csantam.model.entity.Producto;
import cl.csantam.model.entity.Region;
import cl.csantam.service.BodegaProductoService;
import cl.csantam.service.BodegaService;
import cl.csantam.service.ComunaService;
import cl.csantam.service.ProductoService;
import cl.csantam.service.RegionService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	EntityManager em;
	
	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private RegionService regionService;
	
	@Autowired
	private ComunaService comunaService;
	
	@Autowired
	private BodegaService bodegaService;
	
	@Autowired
	private BodegaProductoService bodegaProductoService;
	
	
	@GetMapping
	private String home(ModelMap mapa) {
		System.out.println("AAAAAAA");
		
		logger.info("GGGGGGGGGGGGGGGGGGGGGGGGGGG");
		List<Region> regiones = regionService.getRegiones();
		List<Comuna> comunas  = comunaService.getComunas();
		List<Bodega> bodegas  = bodegaService.getBodegas();
		List<BodegaProducto> listado = bodegaProductoService.getProductos();
		
		System.out.println("******* Listado *****");
		logger.info("Home:**** Listado***");
		for( BodegaProducto bp: listado ) {
			System.out.println(bp.getProducto()+ " " + bp.getComuna() + " " + bp.getBodega());
		}
		
		mapa.put("regiones", regiones);
		mapa.put("comunas", comunas);
		mapa.put("bodegas", bodegas);
		mapa.put("listado", listado);
		return "home";
	}
	
	@PostMapping
	private String Busqueda(ModelMap mapa, 
			@ModelAttribute FormDto frmDto) {
		
		Integer producto = frmDto.getProducto();
		Integer region   = frmDto.getRegion();
		Integer comuna   = frmDto.getComuna();
		Integer bodega   = frmDto.getBodega();
				
		logger.info("producto:" + producto);
		logger.info("region:" + region);
		logger.info("comuna:" + comuna);
		logger.info("bodega:" + bodega);
		
		List<Region> regiones = regionService.getRegiones();
		List<Comuna> comunas  = comunaService.getComunas();
		List<Bodega> bodegas  = bodegaService.getBodegas();
		
		
		HashMap<String, Object> data=new HashMap<>();
		if ( producto != null && producto != 0) {
			logger.info("Agrega producto");
			data.put("producto", producto );
		}
			
		if ( region != 0) {
			logger.info("Agrega Region");
			data.put("region",  region );
		}
			    
		if ( comuna != 0) {
			logger.info("Agrega Comuna");
			data.put("comuna",  comuna );
		}
			
		if ( bodega != 0) {
			logger.info("Agrega Bodega");
			data.put("bodega",  bodega );
		}
		
		
			
		List<BodegaProducto> listado = bodegaProductoService.getData(data);
				
		mapa.put("regiones", regiones);
		mapa.put("comunas", comunas);
		mapa.put("bodegas", bodegas);
		
		mapa.put("listado", listado );
		return "home";
	}

}
