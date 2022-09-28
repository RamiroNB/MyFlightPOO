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

	public static double distancia(Geo aeropSaida, Geo aeropChegada){
		double latChegada = Math.toRadians(aeropChegada.getLatitude());
		double longitChegada = Math.toRadians(aeropChegada.getLongitude());

		double latSaida = Math.toRadians(aeropSaida.getLatitude());
		double longitSaida = Math.toRadians(aeropSaida.getLongitude());

		double raioTerra = Math.toRadians(6371);// raio da terra precisa estar em raidanos?

		double d = (2*raioTerra) * Math.asin(Math.sqrt((Math.sin((latSaida-latChegada)/2)*Math.sin((latSaida-latChegada)/2)) 	+    (Math.sin((longitSaida-longitChegada)/2 )*Math.sin((longitSaida-longitChegada)/2 )) * Math.cos(latSaida) * Math.cos(latChegada)));
																//ALGUEM VERIFICA ESSA FORMULA, nao sei oque to fazendo errado. Se acertar ja organiza a de baixo 
		return d;
	}

	public double distancia(Geo meuGeo){
		double d=0;
		double raioTerra = Math.toRadians(6371);// raio da terra precisa estar em raidanos?

		double latSaida = Math.toRadians(meuGeo.getLatitude());
		double longitSaida = Math.toRadians(meuGeo.getLongitude());

		double latChegada = Math.toRadians(latitude);
		double longitChegada = Math.toRadians(longitude);

		d = (2*raioTerra) * Math.asin(Math.sqrt(		(Math.sin((latSaida-latChegada)/2)*Math.sin((latSaida-latChegada)/2)) 	+    (Math.sin((longitSaida-longitChegada)/2 )*Math.sin((longitSaida-longitChegada)/2 )) * Math.cos(latSaida) * Math.cos(latChegada)));
															//Alguem verifica a formula. É ctrl c , v do metodo de cima

		return d;
	}








}
