package com.tarjetacredito.demo;

import com.tarjetacredito.controller.TarjetaCreditoController;
import com.tarjetacredito.model.TarjetaCredito;

public class TarjetaCreditoDemo {

	public static void main(String[] args) {
		
		TarjetaCredito tarjeta = new TarjetaCredito("SQUA", "5218530045239876", "Juan Perez Perez", "31/01/2021");
		
		double montoIngresado = 900;
		
		TarjetaCredito tarjeta1 = new TarjetaCredito("SQUA", "5218530074569432", "Renzo Osorio Osorio", "10/01/2019");
		TarjetaCredito tarjeta2 = new TarjetaCredito("SCO", "5218540085435839", "Javier Romero Romero", "31/01/2021");
		
		TarjetaCreditoController controller = new TarjetaCreditoController();
		
		controller.infoTarjeta(tarjeta);
		
		controller.validaOperacion(montoIngresado);
		
		//Fecha con formato dd/MM/yyyy
		controller.validaTarjeta(tarjeta1);
		
		controller.validaTarjetas(tarjeta1, tarjeta2);
		
		controller.cobrar();

	}

}
