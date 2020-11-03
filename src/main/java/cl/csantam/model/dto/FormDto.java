package cl.csantam.model.dto;

import cl.csantam.model.entity.Bodega;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class FormDto {
	Integer producto;
	Integer region;
	Integer comuna;
	Integer bodega;
}
