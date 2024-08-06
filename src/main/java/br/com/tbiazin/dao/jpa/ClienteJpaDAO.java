package br.com.tbiazin.dao.jpa;

import br.com.tbiazin.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.tbiazin.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
