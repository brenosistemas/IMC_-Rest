import java.io.IOException;
 +import java.util.Date;
 
 import javax.servlet.ServletException;
 import javax.servlet.annotation.WebServlet;
 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 
 @WebServlet(value = "/calculo-imcrest")
 public class calculo-imcRestServlet extends HttpServlet {
 
     @Override
     protected void doGet(
             HttpServletRequest req,
             HttpServletResponse resp) throws ServletException, IOException {
 
         String alturaStr = request.getParameter("altura");
		alturaStr = alturaStr == null ? "0" : alturaStr;
		float altura = Integer.parseFloat(alturaStr);
		
        String PesoStr = request.getParameter("Peso");
		PesoStr = PesoStr == null ? "0" : PesoStr;
		float Peso = Integer.parseFloat(PesoStr);
 
         String condicao(){
		
		imc = Peso / (altura * altura);  

		if(imc < 18)  
     {  
         return "Abaixo do peso";  
     }  
		else  
			if(imc > 18 & imc < 25)  
         {  
             return  "Peso normal";  
         }  
			else  
				if(imc > 25 & imc < 30)  
             {  
                 return  "Acima do peso";  
             }  
				else  
					if(imc > 30)  
                 {  
                     return  "obesso";  
                

                 }
				resp.getOutputStream().print(
                 "{"
                 + "\"Resultado\":\"" + resultado + "\","
                 + "\"dataDeProcessamento\":\"" + new Date() + "\""
               + "}");
     }
 
 }