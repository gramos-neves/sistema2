package br.com.sistema2.controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.sistema2.dao.BusinessDao;
import br.com.sistema2.models.Business;
import br.com.sistema2.threads.Tarefa;

@Controller
public class BusinessControllers {

	@Autowired
	private BusinessDao businessDao;
	
	private Business business;
	
	@RequestMapping("teste2")
	public String teste(){
		business = new Business();
		business.setData(new Date()); 
		business.setHoraInicial("17:10:00");
		    business.setHoraFinal(SomaHora("17:10:00", "00:10:00"));
		    business.setTronco("127");
		    business.setRamal("221");
		    business.setDuracaoLigacao("00:10:00");
		    business.setOrigem("21720200");
		    business.setTipoLigacao("1");
		    business.setDuracaoToque("00:05");
		    businessDao.salvar(business);
		return "home2";
	}
	
	@RequestMapping("/teste")
	public String Iniciar(){
		Runnable tarefa = new Tarefa(businessDao);
		Thread thread = new Thread(tarefa,"Business");
		thread.start();
		return "home2";
	}
	
	@RequestMapping("/lista")
	@ResponseBody
	public List<Business> lista(){
		List<Business> businesses = businessDao.lista();
		return businesses ;
	}
	
	
	
	
	public  String SomaHora(String tempo,String segundos){
		if (tempo.equals("")) {
		     
		    }
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
	
	
		  public int CalcularSegundos(String tempo)
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
