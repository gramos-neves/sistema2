package br.com.sistema2.threads;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import br.com.sistema2.dao.BusinessDao;
import br.com.sistema2.models.Business;


public class teste {
     @Autowired
	 static BusinessDao  dao;
	public static void main(String[] args) {
	
		Business	business = new Business();
	
	
	 business.setData(new Date()); 
		business.setHoraInicial("17:10:00");
		    business.setHoraFinal(SomaHora("17:10:00", "00:10:00"));
		    business.setTronco("127");
		    business.setRamal("221");
		    business.setDuracaoLigacao("00:10:00");
		    business.setOrigem("21720200");
		    business.setTipoLigacao("1");
		    business.setDuracaoToque("00:05");
		    dao.salvar(business);
	}
	
	public static  String SomaHora(String tempo,String segundos){
		if (tempo.equals("")) {}
			    String[] tempo2 = tempo.split(":");
			    int hora = Integer.parseInt(tempo2[0]);
			    int minuto = Integer.parseInt(tempo2[1]);
			    int segundo = Integer.parseInt(tempo2[2]);
			    
			    GregorianCalendar gc = new GregorianCalendar();  
			    SimpleDateFormat sdff = new SimpleDateFormat( "HH:mm:ss" );
			    Calendar cal = Calendar.getInstance();
	
			    cal.set(Calendar.HOUR_OF_DAY, hora);
			    cal.set(Calendar.MINUTE, minuto);
			    cal.set(Calendar.SECOND, segundo);
			    gc.setTime(cal.getTime());
			    gc.add(Calendar.SECOND, CalcularSegundos(segundos));
			    
			    return sdff.format(gc.getTime());
		    }
	
	
		  public static int CalcularSegundos(String tempo)
		  {
			if (tempo.equals("")) {
		      return 0;
		    }
		    String[] tempo2 = tempo.split(":");
		    int hora = Integer.parseInt(tempo2[0]);
		    int minuto = Integer.parseInt(tempo2[1]);
		    int segundo = Integer.parseInt(tempo2[2]);
		    
		    int hora1 = hora * 60 * 60;
		    int minuto1 = minuto * 60;
		    int totalSegundo = hora1 + minuto1 + segundo;
		    return totalSegundo;
		  }
	
	

}
