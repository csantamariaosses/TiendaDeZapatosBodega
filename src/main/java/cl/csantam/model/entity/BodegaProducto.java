package cl.csantam.model.entity;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class BodegaProducto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "id_producto" )
    private Producto producto;
	
	@ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "id_bodega" )
    private Bodega bodega;
	
	
	@ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "id_region" )
    private Region region;
	
	@ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "id_comuna" )
    private Comuna comuna;

	
}
