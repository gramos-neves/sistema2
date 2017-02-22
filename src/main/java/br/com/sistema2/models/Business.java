package br.com.sistema2.models;

import java.util.Date;

public class Business {

	  private Date data;
	  private String horaInicial;
	  private String horaFinal;
	  private String tronco;
	  private String ramal;
	  private String duracaoToque;
	  private String duracaoLigacao;
	  private String origem;
	  private String tipoLigacao;
	  
	  
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getHoraInicial() {
		return horaInicial;
	}
	public void setHoraInicial(String horaInicial) {
		this.horaInicial = horaInicial;
	}
	public String getHoraFinal() {
		return horaFinal;
	}
	public void setHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}
	public String getTronco() {
		return tronco;
	}
	public void setTronco(String tronco) {
		this.tronco = tronco;
	}
	public String getRamal() {
		return ramal;
	}
	public void setRamal(String ramal) {
		this.ramal = ramal;
	}
	public String getDuracaoToque() {
		return duracaoToque;
	}
	public void setDuracaoToque(String duracaoToque) {
		this.duracaoToque = duracaoToque;
	}
	public String getDuracaoLigacao() {
		return duracaoLigacao;
	}
	public void setDuracaoLigacao(String duracaoLigacao) {
		this.duracaoLigacao = duracaoLigacao;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getTipoLigacao() {
		return tipoLigacao;
	}
	public void setTipoLigacao(String tipoLigacao) {
		this.tipoLigacao = tipoLigacao;
	}
	
	  
	
	
	  
}
