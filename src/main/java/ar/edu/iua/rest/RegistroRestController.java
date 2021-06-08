package ar.edu.iua.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ar.edu.iua.business.IRegistroBusiness;
import ar.edu.iua.business.exception.BusinessException;
import ar.edu.iua.model.Registro;

@RestController
@RequestMapping(value = Constantes.URL_REGISTROS)
public class RegistroRestController {
	@Autowired
	private IRegistroBusiness regstroBusiness;
	
	@PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> add(@RequestBody Registro registro) {
		try {
			regstroBusiness.add(registro);
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.set("location", Constantes.URL_REGISTROS + "/" + registro.getId());
			return new ResponseEntity<String>(responseHeaders, HttpStatus.CREATED);
		} catch (BusinessException e) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}



}
