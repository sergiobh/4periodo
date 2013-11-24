package Services;

public class QueryParam {
	private String description;
	private String location;
	private long lat, lon;
	private boolean full_time;
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getLat() {
		return lat;
	}
	public void setLat(long lat) {
		this.lat = lat;
	}
	public long getLon() {
		return lon;
	}
	public void setLon(long lon) {
		this.lon = lon;
	}
	public boolean isFull_time() {
		return full_time;
	}
	public void setFull_time(boolean full_time) {
		this.full_time = full_time;
	}

	
}
