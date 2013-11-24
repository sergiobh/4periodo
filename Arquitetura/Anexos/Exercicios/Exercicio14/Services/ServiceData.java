package Services;

public class ServiceData {
	private final String URL_BASE = "https://jobs.github.com/api"; 
	private String url;
	private QueryParam queryParam;
	
	public ServiceData(){
		queryParam = new QueryParam();
	}
	
	public ServiceData description(String value){
		queryParam.setDescription(value);
		return this;
	}
	
	public ServiceData location(String value){
		queryParam.setLocation(value);
		return this;
	}
	
	public ServiceData lat(Long value){
		queryParam.setLat(value);
		return this;
	}
	
	public ServiceData lon(Long value){
		queryParam.setLon(value);
		return this;
	}
	
	public ServiceData full_time(boolean value){
		queryParam.setFull_time(value);
		return this;
	}
	
	public void execute(){
		url = URL_BASE;
		String E = "&";
		boolean entrou = false;
		
		if (!queryParam.getDescription().isEmpty()){
			url = url + "description: "+queryParam.getDescription();
		}
		
		
	}
	
}
