package ec.edu.ups.pweb.Evaluacion.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.pweb.demoapp.model.Departamento;



@Stateless
public class DepartamentoDAO {

	@PersistenceContext
	private EntityManager em;
	public void insert(Departamento op) {
		em.persist(op);
	}
	
	public void update(Departamento op) {
		em.merge(op);
	}
}
