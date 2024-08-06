package br.com.tbiazin.dao.jpa;

import br.com.tbiazin.dao.generic.jpa.IGenericJapDAO;
import br.com.tbiazin.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
