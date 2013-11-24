package Services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RequestThread extends Thread {
	private ResponseListener listener;
	
	public RequestThread(ResponseListener listener){
		this.listener = listener;
	}
	
	private String loadFromHttp(){
		 try {
			 
				URL url = new URL("http://localhost:8080/RESTfulExample/json/product/get");
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				conn.setRequestProperty("Accept", "application/json");
		 
				if (conn.getResponseCode() != 200) {
					throw new RuntimeException("Failed : HTTP error code : "
							+ conn.getResponseCode());
				}
		 
				BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));
		 
				String output;
				StringBuffer sb = new StringBuffer();
				
				while ((output = br.readLine()) != null) {
					sb.append(output);
				}
		 
				conn.disconnect();
				return sb.toString();
			  } catch (MalformedURLException e) {
		 
				e.printStackTrace();
		 
			  } catch (Exception e) {
				  System.out.printf("Erro: %s ", e.getMessage());
			
				  return "";
			  }
		return null;	
			
	}
	
	
	 @Override
	public void run(){
		super.run();
		String json = loadFromHttp();
		
	//	Gson gson = new Gson();	
				
				
	 }			
				
		

}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
