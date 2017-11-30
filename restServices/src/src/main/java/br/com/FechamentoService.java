package src.main.java.br.com;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/FechamentoService") 
public class FechamentoService {
	
	 FechamentoDAO fechaDAO = new FechamentoDAO();  
	   @GET 
	   @Path("/pedidos") 
	   @Produces(MediaType.APPLICATION_XML) 
	   public List<Pedido> getPedidos(){ 
	      return fechaDAO.getAllPedidos(); 
	   }  


}
