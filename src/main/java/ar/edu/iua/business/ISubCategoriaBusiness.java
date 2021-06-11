package ar.edu.iua.business;

import ar.edu.iua.business.exception.BusinessException;
import ar.edu.iua.business.exception.NotFoundException;
import ar.edu.iua.model.SubCategoria;

public interface ISubCategoriaBusiness {
	public SubCategoria add(SubCategoria subCategoria) throws BusinessException;

	public SubCategoria load(Integer id) throws NotFoundException, BusinessException;

	public SubCategoria asegurarSubCategoria(SubCategoria subCategoria) throws BusinessException;
}
