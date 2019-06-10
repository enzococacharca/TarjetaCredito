package com.tarjetacredito.model;

public class TarjetaCredito {
	
	private String marca;
	private String numeroTarjeta;
	private String cardHolder;
	private String fechaVencimiento;
	
	public TarjetaCredito(){
		
	}
	
	public TarjetaCredito(String marca, String numeroTarjeta, String cardHolder, String fechaVencimiento) {
		this.marca = marca;
		this.numeroTarjeta = numeroTarjeta;
		this.cardHolder = cardHolder;
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	@Override
	public String toString() {
		return "TarjetaCredito [marca=" + marca + ", numeroTarjeta=" + numeroTarjeta + ", cardHolder=" + cardHolder
				+ ", fechaVencimiento=" + fechaVencimiento + "]";
	}
	
}
