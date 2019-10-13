package co.com.sofka.certificacion.mystore.utils.data;

import java.io.IOException;

public class Credentials {
	
	private String password;
	private String email;
	private String sumemrDress;
	
	CaptureRute ruta = new CaptureRute();
	
	public Credentials() throws IOException {
		ruta.leerArchivo();
		this.password = ruta.getPassword();
		this.email = ruta.getEmail();
		this.sumemrDress = ruta.getOptionDress();
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getOptionDress() {
		return this.sumemrDress;
	}
}
