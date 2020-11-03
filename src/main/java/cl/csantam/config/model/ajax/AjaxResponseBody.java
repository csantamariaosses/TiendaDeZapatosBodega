package cl.csantam.config.model.ajax;

import java.util.List;
import cl.csantam.model.entity.Comuna;
import lombok.Data;


@Data
public class AjaxResponseBody {
	 String msg;
	 List<Comuna> result;

}
