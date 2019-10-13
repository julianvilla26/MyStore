package co.com.sofka.certificacion.mystore.utils.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CaptureRute {
	
	private String password;
	private String email;
	private String summerDres;
	
	public void leerArchivo() throws IOException{
		
		FileReader fileReader = new FileReader("D:\\Usuarios\\Julian\\Escritorio\\PruebaAutomatizacionSofka\\MyStoreSofka\\datos.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String cadena="";
		
		while((cadena=bufferedReader.readLine())!=null) {
			this.password = cadena.split(",")[0];
			this.email = cadena.split(",")[1];
			this.summerDres = cadena.split(",")[2];
		}
		
		bufferedReader.close();
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getOptionDress() {
		return this.summerDres;
	}
}
