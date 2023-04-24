package Inicio;

import javax.swing.*;

import conversor.FuncionMoneda;
import conversor.FuncionTemperatura;

public class Inicio {

	public static void main(String [] args) {
		
		FuncionMoneda monedas = new FuncionMoneda();
		FuncionTemperatura temperatura = new FuncionTemperatura();
		
		
		String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu", 
				JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();
	
	
		switch(opciones) {
			case "Conversor de Moneda":
				String input = JOptionPane.showInputDialog("Ingresa el monto que quiera convertir: ");
				if(ValidarNumero(input)) {
					double MiInput = Double.parseDouble(input);
					monedas.ConvertirMonedas(MiInput);
					
					int respuesta=JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona una opcion");
					}else {
						JOptionPane.showMessageDialog(null, "Programa terminado");	
					}
					}else {
						JOptionPane.showMessageDialog(null, "Valor invalido");
					}
				
					break;
			case "Conversor de Temperatura":
				input = JOptionPane.showInputDialog("Ingrese la temperatura a convertir: ");
				if (ValidarNumero(input)) {
					double MiInput = Double.parseDouble(input);
					temperatura.convertirTemperatura(MiInput);
					
					int respuesta=JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Seleccionar una opcion");
					}else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Valor invalido");
				}
				break;
		}
	}
		
		
	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if (x >= 0 || x < 0);
				return true;	
		}catch (NumberFormatException e) {
			return false;
		}
	
	
	}	
}
