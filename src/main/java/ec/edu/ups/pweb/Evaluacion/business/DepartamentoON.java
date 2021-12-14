package ec.edu.ups.pweb.Evaluacion.business;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pweb.Evaluacion.dao.DepartamentoDAO;
import ec.edu.ups.pweb.demoapp.model.Departamento;

@Stateless
public class DepartamentoON implements DepartamentoONRemoto {
	
	@Inject
	private DepartamentoDAO daoProducto;
	
	
	public void insertar (Departamento p) throws Exception {
		daoProducto.insert(p);
	}
	
	public void actualizar(Departamento op) {
		daoProducto.update(op);
	}
	
}

