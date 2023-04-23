package conversor;

import javax.swing.JOptionPane;


public class ConversorMoneda {
	
	public void ConvertirClpADolar(Double valor){
		 double clpAdolar = 796.870*valor;
		 clpAdolar = (double)Math.round(clpAdolar * 100d)/100;
		 JOptionPane.showMessageDialog(null,"Tienes $" + clpAdolar + "Dolares");	 
	}
	
	public void ConvertirDolarAClp(Double valor){
		 double dolarAclp = valor/796.870;
		 dolarAclp = (double)Math.round(dolarAclp * 100d)/100;
		 JOptionPane.showMessageDialog(null,"Tienes $" + dolarAclp + "Pesos chilenos");
	}
	
	public void ConvertirClpAEuro(Double valor){
		 double clpAeuro = valor*876.260;
		 clpAeuro = (double)Math.round(clpAeuro * 100d)/100;
		 JOptionPane.showMessageDialog(null,"Tienes $" + clpAeuro + "Euros");
	}
	
	public void ConvertirEuroAClp(Double valor){
		 double euroAclp = valor/876.260;
		 euroAclp = (double)Math.round(euroAclp * 100d)/100;
		 JOptionPane.showMessageDialog(null,"Tienes $" + euroAclp + "Pesos chilenos");
	}
	
	public void ConvertirClpALibrasEsterlinas(Double valor){
		 double clpAlibraesterlina = valor*989.060;
		 clpAlibraesterlina = (double)Math.round(clpAlibraesterlina * 100d)/100;
		 JOptionPane.showMessageDialog(null,"Tienes $" + clpAlibraesterlina + "Libras Esterlinas");
	}
	
	public void ConvertirLibrasEsterlinasAClp(Double valor){
		 double libraesterlinaAclp = valor/989.060;
		 libraesterlinaAclp = (double)Math.round(libraesterlinaAclp * 100d)/100;
		 JOptionPane.showMessageDialog(null,"Tienes $" + libraesterlinaAclp + "Pesos chilenos");
	}
	
	public void ConvertirClpAYen(Double valor){
		 double clpAyen = valor*5.956;
		 clpAyen = (double)Math.round(clpAyen * 100d)/100;
		 JOptionPane.showMessageDialog(null,"Tienes $" + clpAyen + "Yen Japones");
	}
	
	public void ConvertirYenAClp(Double valor){
		 double yenAclp = valor/5.956;
		 yenAclp = (double)Math.round(yenAclp * 100d)/100;
		 JOptionPane.showMessageDialog(null,"Tienes $" + yenAclp + "Pesos chilenos");
	}
	
	public void ConvertirClpAWon(Double valor){
		 double clpAwon = valor*0.611;	 
		 clpAwon = (double)Math.round(clpAwon * 100d)/100;
		 JOptionPane.showMessageDialog(null,"Tienes $" + clpAwon + "Won sul-coreano");
	}
	
	public void ConvertirWonAClp(Double valor){
		 double wonAclp = valor/0.611;
		 wonAclp = (double)Math.round(wonAclp * 100d)/100;
		 JOptionPane.showMessageDialog(null,"Tienes $" + wonAclp + "Pesos chilenos");
	}
	
}
