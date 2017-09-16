
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enriquejosegaleanotalavera
 */
public class Usuarios implements Serializable {

	private String nombre;
	private String nickname;
	private String nacionalidad;
	private Date fecha;
	private String password;
	private Icon fotografia;
	ArrayList solicitudes = new ArrayList();
	ArrayList AmigosPorAceptra = new ArrayList();

	public Usuarios(String nombre, String nickname, String nacionalidad, Date fecha, String password) {
		this.nombre = nombre;
		this.nickname = nickname;
		this.nacionalidad = nacionalidad;
		this.fecha = fecha;
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Icon getFotografia() {
		return fotografia;
	}

	public void setFotografia(Icon fotografia) {
		this.fotografia = fotografia;
	}

	public ArrayList getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(ArrayList solicitudes) {
		this.solicitudes = solicitudes;
	}

	public ArrayList getAmigosPorAceptra() {
		return AmigosPorAceptra;
	}

	public void setAmigosPorAceptra(ArrayList AmigosPorAceptra) {
		this.AmigosPorAceptra = AmigosPorAceptra;
	}

	
}
