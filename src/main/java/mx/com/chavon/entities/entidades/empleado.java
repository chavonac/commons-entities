package mx.com.chavon.entities.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class empleado implements Serializable {

	private static final long serialVersionUID = 8290024616644218864L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empelado")
	private BigDecimal idEmpleado;

	@Column(name = "cve_empleado", unique = true, length = 10, nullable = false)
	private String cveEmpleado;

	@Column(length = 100, nullable = false)
	private String nombre;

	@Column(name = "apellido_paterno", length = 100, nullable = false)
	private String apellidoPaterno;

	@Column(name = "apellido_materno", length = 100)
	private String apelidoMaterno;

	private Integer edad;

	@Column(length = 10, nullable = false)
	private String usuario;

	@Column(name = "fecha_actualizacion", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "dd MMM YYYYY HH:mm:ss")
	private Date fechaActualizacion;

	public BigDecimal getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(BigDecimal idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCveEmpleado() {
		return cveEmpleado;
	}

	public void setCveEmpleado(String cveEmpleado) {
		this.cveEmpleado = cveEmpleado;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApelidoMaterno() {
		return apelidoMaterno;
	}

	public void setApelidoMaterno(String apelidoMaterno) {
		this.apelidoMaterno = apelidoMaterno;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

}
