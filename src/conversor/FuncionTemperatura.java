package conversor;

import javax.swing.JOptionPane;

public class FuncionTemperatura {
	
	ConversorTemperatura temperatura = new ConversorTemperatura();
	
	public void convertirTemperatura(double MiInput) {
		String menuTemp = (JOptionPane.showInputDialog(null, "Elije la medida de temperatura", "Temperatura",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
				{"De Celcius a Fahrenheit", "De Fahrenheit a Celcius", "De Celcius a Kelvin", 
						"De Kelvin a Celcius", "De Fahrenheit a Kelvin", "De Kelvin a Fahrenheit"},
						"Seleccion")).toString();
		switch(menuTemp) {
			case "De Celcius a Fahrenheit":
				temperatura.convertirCelciusAFahrenheit(MiInput);
				break;
				
			case "De Fahrenheit a Celcius":
				temperatura.convertirFahrenheitACelcius(MiInput);
				break;
			
			case "De Celcius a Kelvin":
				temperatura.convertirCelciusAKelvin(MiInput);
				break;
			
			case "De Kelvin a Celcius":
				temperatura.convertirKelvinACelcius(MiInput);
				break;
			
			case "De Fahrenheit a Kelvin":
				temperatura.convertirFahrenheitAKelvin(MiInput);
				break;
			
			case "De Kelvin a Fahrenheit":
				temperatura.convertirKelvinAFahrenheit(MiInput);
				break;
		}
	}
}
