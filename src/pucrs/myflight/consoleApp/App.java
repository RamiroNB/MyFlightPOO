package pucrs.myflight.consoleApp;
import java.time.LocalDateTime;

import pucrs.myflight.modelo.Aeronave;
import pucrs.myflight.modelo.Aeroporto;
import pucrs.myflight.modelo.CiaAerea;
import pucrs.myflight.modelo.Geo;
import pucrs.myflight.modelo.Rota;
import pucrs.myflight.modelo.Voo;

import java.time.Duration;
public class App {

	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");

		//Cias Aereas
		CiaAerea c1 = new CiaAerea("1202", "GOL");
		CiaAerea c2 = new CiaAerea("9090", "TAM");

		//Aeroportos e suas localizaçoes
		Geo g1 = new Geo(-299942 , -511714 );
		Aeroporto a1 = new Aeroporto("001", "Salgado Filho", g1);

		Geo g2 = new Geo(-229103 , -431631 );
		Aeroporto a2 = new Aeroporto("002", "Santos Drumond", g2);

		Geo g3 = new Geo(387742, -91342);
		Aeroporto a3 = new Aeroporto("003", "Lisbon", g3);

		System.out.println(" A distancia entre Aeroporto Salgado Filho e Santos Drumond é:" + g1.distancia(g1, g2));//teste do 

		//Aeronaves
		Aeronave aa1= new Aeronave("733", "Boeing 737-300");
		Aeronave aa2= new Aeronave("332", "A332");

		//Rotas
		Rota r1 = new Rota(c1, a1, a2, aa1);
		Rota r2 = new Rota(c2, a2, a3, aa2);

		Duration duracao1 = Duration.ofMinutes(60); 
		Duration duracao2 = Duration.ofMinutes(120); 
		Duration duracao3 = Duration.ofMinutes(180); 
		Duration duracao4 = Duration.ofMinutes(240); 


		//Voos e suas datas(Se existe data)
		LocalDateTime datahora1 = LocalDateTime.of(2022, 9, 27, 17, 06);
		Voo v1 = new Voo(r1, datahora1, duracao1);

		Voo v2 = new Voo(r2, duracao4);


		System.out.println("\nMyFlight project...END");

	}
}
