package src.main.java.br.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class FechamentoDAO {
	
	public List<Pedido> getAllPedidos(){ 
	      
	      List<Pedido> pedidoList = null; 
	      try { 
	         File file = new File("Pedidos.dat"); 
	         if (!file.exists()) {
	        	
//	        	Produto produto1 = new Produto("1", "Café", "5,00");
//	        	Produto produto2 = new Produto("2", "Leite", "3,50");
//	        	Produto produto3 = new Produto("3", "Pao", "2,50");
//	        	
//	        	List<Produto> produtos = new ArrayList<Produto>();
//	        	produtos.add(produto1);
//	        	produtos.add(produto2);
//	        	produtos.add(produto3);
	        	
	        	Pedido pedido = new Pedido("1", "Pago", "11.00", "3");
	        	pedidoList = new ArrayList<Pedido>(); 
	            pedidoList.add(pedido); 
	            savePedidoList(pedidoList); 
	         } 
	         else{ 
	            FileInputStream fis = new FileInputStream(file); 
	            ObjectInputStream ois = new ObjectInputStream(fis); 
	            pedidoList = (List<Pedido>) ois.readObject(); 
	            ois.close(); 
	         } 
	      } catch (IOException e) { 
	         e.printStackTrace(); 
	      } catch (ClassNotFoundException e) { 
	         e.printStackTrace(); 
	      }   
	      return pedidoList; 
	   } 
	   private void savePedidoList(List<Pedido> pedidoList){ 
	      try { 
	         File file = new File("Pedidos.dat"); 
	         FileOutputStream fos;  
	         fos = new FileOutputStream(file); 
	         ObjectOutputStream oos = new ObjectOutputStream(fos); 
	         oos.writeObject(pedidoList); 
	         oos.close(); 
	      } catch (FileNotFoundException e) { 
	         e.printStackTrace(); 
	      } catch (IOException e) { 
	         e.printStackTrace(); 
	      } 
	   }    

}
