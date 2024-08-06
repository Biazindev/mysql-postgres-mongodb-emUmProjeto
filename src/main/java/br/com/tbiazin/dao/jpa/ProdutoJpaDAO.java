package br.com.tbiazin.dao.jpa;

import br.com.tbiazin.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.tbiazin.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
