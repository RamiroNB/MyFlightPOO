package pucrs.myflight.consoleApp;
import java.time.LocalDateTime;
import pucrs.myflight.modelo.Aeronave;
import pucrs.myflight.modelo.Aeroporto;
import pucrs.myflight.modelo.CiaAerea;
import pucrs.myflight.modelo.Geo;
import pucrs.myflight.modelo.GerenciadorAeronaves;
import pucrs.myflight.modelo.GerenciadorAeroportos;
import pucrs.myflight.modelo.GerenciadorCias;
import pucrs.myflight.modelo.GerenciadorRotas;
import pucrs.myflight.modelo.GerenciadorVoos;
import pucrs.myflight.modelo.Rota;
import pucrs.myflight.modelo.VooDireto;
import pucrs.myflight.modelo.VooEscalas;

public class App {

	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");

		//Cias Aereas
		CiaAerea c1 = new CiaAerea("1202", "GOL");
		CiaAerea c2 = new CiaAerea("9090", "TAM");

		//Aeroportos e suas localizaçoes
		Geo g1 = new Geo(-29.992934259322457 ,-51.17606774547561);
		Aeroporto a1 = new Aeroporto("001", "Salgado Filho", g1);

		Geo g2 = new Geo(-22.91049957 , -43.1631012 );
		Aeroporto a2 = new Aeroporto("002", "Santos Drumond", g2);

		Geo g3 = new Geo(38.7755, -9.1353);
		Aeroporto a3 = new Aeroporto("003", "Lisbon", g3);

		System.out.println("A distancia entre Aeroporto Salgado Filho e Santos Drumond é:" + Geo.distancia(g1, g2)+"KM");//teste do 
		System.out.println("A distancia entre Santos Drumond e Lsibon é: " + Geo.distancia(g2, g3)+"KM");
		System.out.println();
		//Aeronaves
		Aeronave aa1= new Aeronave("733", "Boeing 737-300");
		Aeronave aa2= new Aeronave("332", "A332");

		//Rotas
		Rota r1 = new Rota(c1, a1, a2, aa1);
		Rota r2 = new Rota(c2, a2, a3, aa2);

		//Voos e suas datas(Se existe data)
		LocalDateTime data = LocalDateTime.now();
		LocalDateTime datahora1 = LocalDateTime.of(2022, 9, 27, 17, 06);
		
		VooDireto v1 = new VooDireto(r1, data);
		VooEscalas v2 = new VooEscalas(datahora1);
		v2.adicionarRota(r1);
		v2.adicionarRota(r2);
		System.out.println("Duração voo 1: "+v1.getDuracao());
		System.out.println("Duração voo 2: "+v2.getDuracao());
		System.out.println();
		//gerenciadores:
		GerenciadorAeronaves gNaves = new GerenciadorAeronaves();
		gNaves.AdicionarAeronave(aa1);
		gNaves.AdicionarAeronave(aa2);
		gNaves.ordenaDescricao();
		System.out.println("Gerenciador de Aeronaves:");
		System.out.println(gNaves.toString());
		GerenciadorAeroportos gPortos = new GerenciadorAeroportos();
		gPortos.AdicionarAeroporto(a1);
		gPortos.AdicionarAeroporto(a2);
		gPortos.AdicionarAeroporto(a3);
		gPortos.ordenaNome();
		System.out.println("Gerenciador de Aeroportos:");
		System.out.println(gPortos.toString());
		GerenciadorCias gCias = new GerenciadorCias();
		gCias.AdicionarEmpresa(c1);
		gCias.AdicionarEmpresa(c2);
		System.out.println("Gerenciador de Cias:");
		System.out.println(gCias.toString());
		GerenciadorRotas gRotas = new GerenciadorRotas();
		gRotas.AdicionarRota(r1);
		gRotas.AdicionarRota(r2);
		gRotas.ordenaNomeCia();
		System.out.println("Gerenciador de Rotas:");
		System.out.println(gRotas.toString());
		GerenciadorVoos gVoos = new GerenciadorVoos(); 
		gVoos.AdicionarVoo(v1);
		gVoos.AdicionarVoo(v2);
		System.out.println("Gerenciador de Voos:");
		System.out.println(gVoos.toString());


		System.out.println("\nMyFlight project...END");

	}
}
