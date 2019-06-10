package com.tarjetacredito.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.tarjetacredito.model.TarjetaCredito;
import com.tarjetacredito.view.TarjetaCreditoVista;

public class TarjetaCreditoController {
	
	static final double montoPermitido = 1000.0;
	
	private TarjetaCreditoVista vista = new TarjetaCreditoVista();
	
	public void infoTarjeta(TarjetaCredito tarjetaInput){
		TarjetaCredito tarjetaBD = new TarjetaCredito("SQUA", "5218530045239876", "Juan Perez Perez", "31/01/2021");
		if (tarjetaInput.getMarca().equals(tarjetaBD.getMarca()) && tarjetaInput.getNumeroTarjeta().equals(tarjetaBD.getNumeroTarjeta())
				&& tarjetaInput.getCardHolder().equals(tarjetaBD.getCardHolder()) && tarjetaInput.getFechaVencimiento().equals(tarjetaBD.getFechaVencimiento())) {
			vista.infoTarjeta(tarjetaBD);
		} else {
			TarjetaCredito tarjeta = new TarjetaCredito();
			vista.infoTarjeta(tarjeta);
		}
	}
	
	public void validaOperacion(double montoIngresado){
		boolean flagValidaOperacion = false;
		if (montoPermitido > montoIngresado) {
			flagValidaOperacion = true;
		}
		vista.validaOperacion(flagValidaOperacion, montoIngresado, montoPermitido);
	}
	
	public void validaTarjeta(TarjetaCredito tarjeta){
		boolean flagFechaVencimiento = false;
		DateTimeFormatter formatFecha = DateTimeFormatter.ofPattern("d/MM/yyyy");
		
		LocalDate fechaVencimiento = LocalDate.parse(tarjeta.getFechaVencimiento(), formatFecha);
		
		LocalDate fecha = LocalDate.now();
		if (fechaVencimiento.isAfter(fecha)) {
			flagFechaVencimiento = true;
		}
		vista.validaTarjeta(flagFechaVencimiento, tarjeta);
	}
	
	public void validaTarjetas(TarjetaCredito tarjeta1, TarjetaCredito tarjeta2){
		boolean flagValidaTarjetas = false;
		String bin1 = tarjeta1.getNumeroTarjeta().substring(0, 6);
		String bin2 = tarjeta2.getNumeroTarjeta().substring(0, 6);
		if (tarjeta1.getMarca().equals(tarjeta2.getMarca()) && bin1.equals(bin2)) {
			flagValidaTarjetas = true;
		}
		vista.validaTarjetas(flagValidaTarjetas, tarjeta1, tarjeta2, bin1, bin2);
	}
	
	public void cobrar(){
		
		enviarInfoTC();
		
		actualizarSaldo();
		
	}
	
	public void enviarInfoTC(){
		String host = "HOST";
		try {
			InetAddress address = InetAddress.getByName(host);
		} catch (  UnknownHostException e) {
			System.out.println("No se pudo encontrar el HOST, todo registro fallará.");
		} finally {
			System.out.println("No se pudo enviar información HOST caido.");
		}
		System.out.println("");
	}
	
	public void actualizarSaldo(){
		try {
		    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" + "user=admin&password=admin");
		    // Codigo...
		} catch (SQLException ex) {
		    // //Manejo de error de contexto de Base de Datos
		    System.out.println("SQLException: " + ex.getMessage());
		} finally {
			System.out.println("No se pudo actualizar los datos del saldo.");
		}
		System.out.println("");
	}

}
