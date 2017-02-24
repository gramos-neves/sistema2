package br.com.sistema2.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Business {

	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private Integer id;
	  private Date data;
	  private String horaInicial;
	  private String horaFinal;
	  private String tronco;
	  private String ramal;
	  private String duracaoToque;
	  private String duracaoLigacao;
	  private String origem;
	  private String tipoLigacao;
	  
	  
	  
	public Integer getId() {
		
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Business other = (Business) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	  
	
	
	  
}
