package ar.edu.iua.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.iua.business.exception.BusinessException;
import ar.edu.iua.model.Registro;
import ar.edu.iua.model.persistence.RegistroRepository;

@Service
public class RegistroBusiness implements IRegistroBusiness{
	@Autowired
	private RegistroRepository registroDAO; 
	
	@Override
	public Registro add(Registro registro) throws BusinessException {
		try {
			return registroDAO.save(registro);
		} catch (Exception e) {
			throw new BusinessException(e);
		}
	}

}
