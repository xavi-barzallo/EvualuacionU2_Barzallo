package ec.edu.ups.pweb.Evaluacion.business;

import java.util.List;

import javax.ejb.Remote;

import ec.edu.ups.pweb.demoapp.model.Departamento;


@Remote
public interface DepartamentoONRemoto {

		
	public void insertar (Departamento p) throws Exception ;
	
	public void actualizar(Departamento op);
	
}
