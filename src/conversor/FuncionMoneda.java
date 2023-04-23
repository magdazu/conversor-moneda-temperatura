package conversor;

import javax.swing.JOptionPane;

public class FuncionMoneda {

	  ConversorMoneda monedas = new ConversorMoneda();
	  
	  public void ConvertirMonedas(double MiInput) {
	  
	  	String menu = (JOptionPane.showInputDialog(null,"Elije el tipo de divisa ", "Monedas",
			  		JOptionPane.PLAIN_MESSAGE, null, new Object[]  
			  		{"De Clp a Dolar","De Dolar a Clp","De Clp a Euro","De Euro a Clp","De Clp a Libras Esterlinas",
			  			"De Libras Esterlinas a Clp", "De Clp a Yen","De Yen a Clp", "De Clp a Won", "De Won a Clp"},
			  		"Seleccion")).toString();
	  
	  	switch(menu){
	  		case "De Clp a Dolar":
	  			monedas.ConvertirClpADolar(MiInput);
	  			break;
	  			
	  		case "De Dolar a Clp":
	  			monedas.ConvertirDolarAClp(MiInput);
	  			break;
	  			
	  		case "De Clp a Euro":
	  			monedas.ConvertirClpAEuro(MiInput);
	  			break;
	  		case "De Euro a Clp":
	  			monedas.ConvertirEuroAClp(MiInput);
	  			break;
	  		case "De Clp a Libras Esterlinas":
	  			monedas.ConvertirClpALibrasEsterlinas(MiInput);
	  			break;
	  		case "De Libras Esterlinas a Clp":
	  			monedas.ConvertirLibrasEsterlinasAClp(MiInput);
	  			break;
	  		case "De Clp a Yen":
	  			monedas.ConvertirClpAWon(MiInput);
	  			break;
	  		case "De Yen a Clp":
	  			monedas.ConvertirYenAClp(MiInput);
	  			break;
	  		case "De Clp a Won":
	  			monedas.ConvertirClpAWon(MiInput);
	  			break;
	  		case "De Won a Clp":
	  			monedas.ConvertirWonAClp(MiInput);
	  			break;
	  		
	  	}
	
	  }
}