package src.main.java.br.com;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "produto") 
public class Produto implements Serializable {  

	private static final long serialVersionUID = 1L;

	private String id;
	private String nome;
	private String valor;
	
	public Produto(String id, String nome, String valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}
	
	
	public String getId() {
		return id;
	}
	@XmlElement 
	public void setId(String id) {
		this.id = id;
	}
	
	public String getValor() {
		return valor;
	}
	@XmlElement
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	@XmlElement 
	public void setNome(String nome) {
		this.nome = nome;
	}
		

}
