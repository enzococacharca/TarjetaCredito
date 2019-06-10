package com.tarjetacredito.view;

import com.tarjetacredito.model.TarjetaCredito;

public class TarjetaCreditoVista {
	
	public void infoTarjeta(TarjetaCredito tarjeta){
		System.out.println("INFORMACION DE TARJETA");
		System.out.println("Marca		:" + (tarjeta.getMarca() == null ? "" : tarjeta.getMarca()));
		System.out.println("N° Tarjeta	:" + (tarjeta.getNumeroTarjeta() == null ? "" : tarjeta.getNumeroTarjeta()));
		System.out.println("Titular		:" + (tarjeta.getCardHolder() == null ? "" : tarjeta.getCardHolder()));
		System.out.println("Fech. Venc.	:" + (tarjeta.getFechaVencimiento() == null ? "" : tarjeta.getFechaVencimiento()));
		System.out.println("");
	}
	
	public void validaOperacion(boolean flagValidaOperacion, double montoIngresado, double montoPermitido){
		System.out.println("VALIDA OPERACION");
		if (flagValidaOperacion) {
			System.out.println("Puede realizar la operación, el monto ingresado " + montoIngresado + " Pesos es permitido.");
		} else {
			System.out.println("No puede realizar la operación, el monto ingresado es igual o superior al monto permitido, " + montoPermitido + " Pesos.");
		}
		System.out.println("");
	}
	
	public void validaTarjeta(boolean flagFechaVencimiento, TarjetaCredito tarjeta){
		System.out.println("VALIDA TARJETA - FECHA VENCIMIENTO");
		if (flagFechaVencimiento) {
			System.out.println("Tarjeta valida para operar, N° Tarjeta: " + tarjeta.getNumeroTarjeta() + "F.V.: " + tarjeta.getFechaVencimiento());
		} else {
			System.out.println("Tarjeta EXPIRIDA, N° Tarjeta: " + tarjeta.getNumeroTarjeta() + ", F.V.: " + tarjeta.getFechaVencimiento());
		}
		System.out.println("");
	}
	
	public void validaTarjetas(boolean flagValidaTarjetas, TarjetaCredito tarjeta1, TarjetaCredito tarjeta2, String bin1, String bin2){
		System.out.println("VALIDA TARJETAS");
		if (flagValidaTarjetas) {
			System.out.println("Tarjetas");
			System.out.println("Tarjeta 01 | Marca: " + tarjeta1.getMarca() + ", N° Tarjeta: " + tarjeta1.getNumeroTarjeta() + ", BIN: " + bin1 + ".");
			System.out.println("Tarjeta 02 | Marca: " + tarjeta2.getMarca() + ", N° Tarjeta: " + tarjeta2.getNumeroTarjeta() + ", BIN: " + bin2 + ".");
		} else {
			System.out.println("Tarjetas Distintas");
			System.out.println("Tarjeta 01 | Marca: " + tarjeta1.getMarca() + ", N° Tarjeta: " + tarjeta1.getNumeroTarjeta() + ", BIN: " + bin1 + ".");
			System.out.println("Tarjeta 02 | Marca: " + tarjeta2.getMarca() + ", N° Tarjeta: " + tarjeta2.getNumeroTarjeta() + ", BIN: " + bin2 + ".");
		}
		System.out.println("");
	}

}
