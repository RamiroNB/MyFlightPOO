package pucrs.myflight.modelo;
import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;
	private ArrayList<Rota> rotasOrigem;
	private ArrayList<Rota> rotasDestino;


    public GerenciadorRotas() {
		rotas = new ArrayList<>();
		rotasOrigem = new ArrayList<>();
		rotasDestino = new ArrayList<>();

	}

    public void AdicionarRota(Rota rotaAtual){
		rotas.add(rotaAtual);
	}

	public ArrayList<Rota> ListarRotas(){
		return rotas;
	}

	public ArrayList<Rota> BuscarPorOrigem(Aeroporto orig){
		for(int i=0; i<rotas.size(); i++){
			if(rotas.get(i).getOrigem() == orig){
				rotasOrigem.add(rotas.get(i));
			}
		}
		return rotasOrigem;
	}

	
    public ArrayList<Rota> BuscarPorDestino(Aeroporto destino){
		for(int i=0; i<rotas.size(); i++){
			if(rotas.get(i).getOrigem() == destino){
				rotasDestino.add(rotas.get(i));
			}
		}
		return rotasDestino;
	}

	public void ordenaNomeCia(){
		Collections.sort(rotas);
	}


}
