package ar.edu.iua.business;

import ar.edu.iua.business.exception.BusinessException;
import ar.edu.iua.model.Registro;


public interface IRegistroBusiness {

	public Registro add(Registro registro) throws BusinessException;
}
