package br.com.tbiazin.dao.jpa;

import br.com.tbiazin.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.tbiazin.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
