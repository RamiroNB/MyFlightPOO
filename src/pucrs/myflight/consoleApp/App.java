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
		Geo g1 = new Geo(-29.9942 , -51.1714 );
		Aeroporto a1 = new Aeroporto("001", "Salgado Filho", g1);

		Geo g2 = new Geo(-22.9103 , -43.1631 );
		Aeroporto a2 = new Aeroporto("002", "Santos Drumond", g2);


		//Aeronaves
		Aeronave aa1= new Aeronave("733", "Boeing 737-300");

		//Rotas
		Rota r1 = new Rota(c1, a1, a2, aa1);

		Duration duracao1 = Duration.ofMinutes(120); 


		//Voos e suas datas
		LocalDateTime datahora1 = LocalDateTime.of(2022, 9, 27, 17, 06);
		Voo v1 = new Voo(r1, datahora1, duracao1);















		System.out.println("\nMyFlight project...END");

	}
}
