package pucrs.myflight.modelo;
import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;

    public GerenciadorRotas() {
		rotas = new ArrayList<>();;
	}

    public void AdicionarRota(Rota rotaAtual){
		rotas.add(rotaAtual);
	}

	public ArrayList<Rota> ListarRotas(){
		return rotas;
	}

	public ArrayList<Rota> BuscarPorOrigem(Aeroporto orig){
		ArrayList<Rota> rotasOrigem = new ArrayList<>();
		for(int i=0; i<rotas.size(); i++){
			if(rotas.get(i).getOrigem() == orig){
				rotasOrigem.add(rotas.get(i));
			}
		}
		return rotasOrigem;
	}

    public ArrayList<Rota> BuscarPorDestino(Aeroporto destino){
		ArrayList<Rota> rotasDestino = new ArrayList<>();
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
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for (Rota rota : rotas) {
			sb.append("Rota: \n");
			sb.append(rota.toString());
			sb.append("\n");
		}
		return sb.toString();
	}


}
