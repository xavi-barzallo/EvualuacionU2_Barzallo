package ec.edu.ups.pweb.demoapp.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "TBL_Departamento")
public class Departamento implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dep_codigo")
	private int codigo;
	
	@Column(name = "dep_numeroPiso")
	private int numeroPiso;
	
	@Column(name = "dep_direccion")
	private String direccion;
	
	@Column(name = "dep_numeroCuartos")
	private int numeroCuartos;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNumeroPiso() {
		return numeroPiso;
	}

	public void setNumeroPiso(int numeroPiso) {
		this.numeroPiso = numeroPiso;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumeroCuartos() {
		return numeroCuartos;
	}

	public void setNumeroCuartos(int numeroCuartos) {
		this.numeroCuartos = numeroCuartos;
	}
	
	
	
	
}




