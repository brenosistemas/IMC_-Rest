import javax.ws.rs.GET;
 import javax.ws.rs.Path;
 import javax.ws.rs.Produces;
 import javax.ws.rs.QueryParam;
 
 @Path("/calculo-imcjaxrs")
 public class calculo-imcjaxrs {
 
 	@GET
 	@Path("/Resultado")
 	@Produces("application/json")
 	public Condicao condicao(@QueryParam("altura", "peso") float altura , float peso) {
 	  Resultado R = new Resultado(altura, peso);
 	  R.Resultado();
 	  return R;
 	}

