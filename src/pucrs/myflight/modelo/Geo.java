package pucrs.myflight.modelo;

public class Geo {
	private double latitude;
	private double longitude;
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}

	public static double distancia(Geo geo1, Geo geo2){
			double lat1 = Math.toRadians(geo1.getLatitude());
			double lat2 = Math.toRadians(geo2.getLatitude());
			double lon1 = Math.toRadians(geo1.getLongitude());
			double lon2 = Math.toRadians(geo2.getLongitude());
			
			double diflat = (lat1-lat2)/2;
			double diflon = (lon1-lon2)/2;
			
			double x = Math.pow(Math.sin(diflat),2)+
					   Math.pow(Math.sin(diflon),2)*
					   Math.cos(lat1) * Math.cos(lat2);
			
			double d =  (2*6371) * Math.asin(Math.sqrt(x));
					
			return d;  
	}

	public double distancia(Geo meuGeo){
		double d=0;

		double lat1    = Math.toRadians(meuGeo.getLatitude());
		double lon1 = Math.toRadians(meuGeo.getLongitude());

		double lat2    = Math.toRadians(latitude);
		double lon2 = Math.toRadians(longitude);

		double diflat = (lat1-lat2)/2;
		double diflon = (lon1-lon2)/2;
			
		d = Math.pow(Math.sin(diflat),2)+
			Math.pow(Math.sin(diflon),2)*
			Math.cos(lat1) * Math.cos(lat2);
		
		d = 2 * 6371 * Math.asin(Math.sqrt(d));
				
			return d;  
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Latitude: %.10f \n");
		sb.append("Longitude: %.10f \n ");
		return sb.toString();
	}
}
