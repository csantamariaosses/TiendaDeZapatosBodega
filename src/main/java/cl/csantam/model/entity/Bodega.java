package cl.csantam.model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class Bodega {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String  nombre;
	
//    @OneToMany(mappedBy="bodega")
//    private List<BodegaProducto> bodegaProducto;
  

}
