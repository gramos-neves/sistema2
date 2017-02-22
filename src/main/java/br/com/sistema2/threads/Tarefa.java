package br.com.sistema2.threads;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import br.com.sistema2.models.Business;



public class Tarefa implements Runnable {

	private Business business;
	
	
	@Override
	public void run() {
		 String linhas[];
		    String linha[];
			try {
				ServerSocket servidor  = new ServerSocket(69);
				System.out.println("Porta aberta");
				Socket cliente = servidor.accept();
				//s.split("\\r?\\n")
				System.out.println("Nova Conexao com o cliente " + cliente.getInetAddress().getHostAddress());
				
				Scanner s = new Scanner(cliente.getInputStream());
				while(s.hasNextLine()){
					
					linha = s.nextLine().split("\\|");
					if(linha.length == 1){
						
					}else if(linha.length == 9)
					{
						salvar(linha[0], linha[1], linha[2], linha[3] , linha[5], linha[6], linha[8]);
						//System.out.println(linha[0] + " " + linha[1] + " " + linha[2] + " " + linha[3] + " " + linha[4] + " " + linha[5] + " " + linha[6] + " " + linha[7] + " " + linha[8]  );
					    lista();
					}
					else if(linha.length == 14)
					{
						salvar(linha[0], linha[1], linha[2], linha[3] , linha[5], linha[6], linha[8]);
						//System.out.println(linha[0] + " " + linha[1] + " " + linha[2] + " " + linha[3] + " " + linha[4] + " " + linha[5] + " " + linha[6] + " " + linha[7] + " " + linha[8] + " " + linha[9] + " " + linha[10] + " " + linha[11] + " " + linha[12] + " " + linha[13]  );
						 lista();
					}
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	
	public  void salvar(String data, String horaInicial, String tronco, String ramal, String duracao, String origem, String TipoLicacao){
		 business = new Business();
		try {
			business.setData(converteData(data + " " + horaInicial));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    business.setHoraInicial(horaInicial);
	    business.setHoraFinal(SomaHora(horaInicial, duracao));
	    business.setTronco(tronco);
	    business.setRamal(ramal);
	    business.setDuracaoLigacao(duracao);
	    business.setOrigem(origem);
	    business.setTipoLigacao(TipoLicacao);
	    
	}
	
	public  void lista(){
		SimpleDateFormat stf = new SimpleDateFormat("dd/MM/yy");
		System.out.println(stf.format(business.getData()) + " " + business.getHoraInicial() + " " + business.getHoraFinal() + " " + business.getRamal() + " " + business.getOrigem() + " " + business.getTipoLigacao() + " " + business.getTronco() + " " + business.getDuracaoLigacao()  );
	}
	
	public  Date converteData(String d)
		    throws ParseException
		  {
		    SimpleDateFormat stf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		    Date data = stf.parse(d.replace(".", "/"));
		    return data;
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
