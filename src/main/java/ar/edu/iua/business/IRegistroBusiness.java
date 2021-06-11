package ar.edu.iua.business;

import java.util.List;

import ar.edu.iua.business.exception.BusinessException;
import ar.edu.iua.business.exception.NotFoundException;
import ar.edu.iua.model.Registro;


public interface IRegistroBusiness {

	public Registro add(Registro registro) throws BusinessException;

	public Registro load(Integer id) throws NotFoundException, BusinessException;
	
	public Registro update(Registro registro) throws NotFoundException, BusinessException;

	public Registro cargar(Registro registro) throws BusinessException;
	
	public List<Registro> list() throws BusinessException;
}
