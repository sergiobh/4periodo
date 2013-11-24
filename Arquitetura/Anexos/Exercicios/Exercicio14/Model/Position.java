package Model;

import Services.ResponseListener;
import Services.ServiceData;

public class Position {
	private String id;
	private String ceated_at;
	private String title;
	private String location;
	private String type;
	private String description;
	private String how_to_apply;
	private String company;
	private String company_url;
	private String company_logo;
	private String url;
	
	
	public static ServiceData find(ResponseListener listener){
		ServiceData serviceData = new ServiceData();
		return serviceData;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCeated_at() {
		return ceated_at;
	}
	public void setCeated_at(String ceated_at) {
		this.ceated_at = ceated_at;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHow_to_apply() {
		return how_to_apply;
	}
	public void setHow_to_apply(String how_to_apply) {
		this.how_to_apply = how_to_apply;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCompany_url() {
		return company_url;
	}
	public void setCompany_url(String company_url) {
		this.company_url = company_url;
	}
	public String getCompany_logo() {
		return company_logo;
	}
	public void setCompany_logo(String company_logo) {
		this.company_logo = company_logo;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	

}
