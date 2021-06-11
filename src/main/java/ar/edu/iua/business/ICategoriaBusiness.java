package ar.edu.iua.business;

import ar.edu.iua.business.exception.BusinessException;
import ar.edu.iua.business.exception.NotFoundException;
import ar.edu.iua.model.Categoria;
import ar.edu.iua.model.Registro;

public interface ICategoriaBusiness {
	public Categoria add(Categoria registro) throws BusinessException;

	public Categoria load(Integer id) throws NotFoundException, BusinessException;

	public Categoria asegurarCategoria(Categoria categoria) throws BusinessException;

}
