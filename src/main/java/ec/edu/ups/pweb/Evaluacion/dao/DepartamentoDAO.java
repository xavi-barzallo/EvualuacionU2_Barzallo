package ec.edu.ups.pweb.Evaluacion.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	
	public Departamento getBuscarDep(int codigoPro){
		Departamento dep = new Departamento();
		String jpql = "SELECT dep FROM Departamento dep"
				+ " WHERE codigo= ?1";
		
		Query query = em.createQuery(jpql, Departamento.class);
		
		query.setParameter(1, codigoPro);
		
		dep = (Departamento) query.getSingleResult();
		
		//JPQL -> SQL
		
		
		return dep;
	}
}
