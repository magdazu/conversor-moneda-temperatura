package conversor;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
	
	public void convertirCelciusAFahrenheit(Double numero) {
		double celciusAfahrenheit = numero * 1.8 + 32;
		celciusAfahrenheit = (double)Math.round(celciusAfahrenheit);
		JOptionPane.showMessageDialog(null, "Los °F son: " + celciusAfahrenheit);
	}
	
	public void convertirFahrenheitACelcius(Double numero) {	
		double fahrenheitAcelcius = (numero -32)/1.8;
		fahrenheitAcelcius = (double)Math.round(fahrenheitAcelcius);
		JOptionPane.showMessageDialog(null, "Los °C son: " + fahrenheitAcelcius);
	}
	
	public void convertirCelciusAKelvin(Double numero) {
		double celciusAkelvin = numero + 273.15;
		celciusAkelvin = (double)Math.round(celciusAkelvin);
		JOptionPane.showMessageDialog(null, "Los K son: " + celciusAkelvin);
	}
	public void convertirKelvinACelcius(Double numero) {
		double kelvinAcelcius = numero - 273.15;
		kelvinAcelcius = (double)Math.round(kelvinAcelcius);
		JOptionPane.showMessageDialog(null, "Los °C son: " + kelvinAcelcius);
	}
	
	public void convertirFahrenheitAKelvin(Double numero) {
		double fahrenheitAkelvin = 5/9 * (numero - 32) + 273.15;
		fahrenheitAkelvin = (double)Math.round(fahrenheitAkelvin);
		JOptionPane.showMessageDialog(null, "Los K son: " + fahrenheitAkelvin);
	}
	
	public void convertirKelvinAFahrenheit(Double numero) {
		double kelvinAfahrenheit = 1.8*(numero - 273.15) + 32;
		kelvinAfahrenheit = (double)Math.round(kelvinAfahrenheit);
		JOptionPane.showMessageDialog(null, "Lso °F son: " + kelvinAfahrenheit);
	}
	
	
	
}
