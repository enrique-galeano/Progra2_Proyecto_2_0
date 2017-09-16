
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enriquejosegaleanotalavera
 */
public class administrarPersonas implements Serializable{

	private ArrayList<Usuarios> listausuarios = new ArrayList();
	private File archivo = null;

	public administrarPersonas(String path) {
		archivo = new File(path);
	}

	public ArrayList<Usuarios> getListausuarios() {
		return listausuarios;
	}

	public void setListausuarios(ArrayList<Usuarios> listausuarios) {
		this.listausuarios = listausuarios;
	}

	public File getArchivo() {
		return archivo;
	}

	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}

    //MUTADOR EXTRA
	public void setPersona(Usuarios p) {
		this.listausuarios.add(p);

	}

	public void cargarArchivo() {
		try {
			listausuarios = new ArrayList();
			Usuarios temp;
			if (archivo.exists()) {
				FileInputStream entrada = new FileInputStream(archivo);
				ObjectInputStream objeto = new ObjectInputStream(entrada);
				try {
					while ((temp = (Usuarios) objeto.readObject()) != null) {
						listausuarios.add(temp);
					}
				} catch (EOFException e) {
					//Encontro final del archivo
				}
				objeto.close();
				entrada.close();
				//fin if
			}
		} catch (Exception e) {

		}

	}//Fin del metodo

	public void escribirArchivo() {
		FileOutputStream fw = null;
		ObjectOutputStream bw = null;

		try {
			fw = new FileOutputStream(archivo);
			bw = new ObjectOutputStream(fw);
			for (Usuarios t : listausuarios) {
				bw.writeObject(t);
			}
		} catch (Exception ex) {
		} finally {
			try {
				fw.close();
				bw.close();
			} catch (Exception e) {
			}
		}

	}

}
