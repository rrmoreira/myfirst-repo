package src.main.java.br.com;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "pedido")
public class Pedido implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private String id;
	//private List<Produto> items;
	private String status;
	private String valor;
	private String quantidade;
	
	public Pedido() {}
	
	
	public Pedido(String id, String status, String valor, String quantidade) {
		super();
		this.id = id;
		//this.items = items;
		this.status = status;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	
	
	public String getId() {
		return id;
	}
	@XmlElement
	public void setId(String id) {
		this.id = id;
	}
//	public List<Produto> getItems() {
//		return items;
//	}
//	@XmlElement
//	public void setItems(List<Produto> items) {
//		this.items = items;
//	}
	public String getStatus() {
		return status;
	}
	@XmlElement
	public void setStatus(String status) {
		this.status = status;
	}
	public String getValor() {
		return valor;
	}
	@XmlElement
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getQuantidade() {
		return quantidade;
	}
	@XmlElement
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
	
	

}
