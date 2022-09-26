package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;
    
    public GerenciadorRotas() {
		rotas = new ArrayList<>();
	}

    public void AdicionarAeronave(Rota rotaAtual){
		rotas.add(rotaAtual);
	}

	public void ListarAeronaves(){
		for(int i=0; i<rotas.size(); i++){
			System.out.println(rotas.get(i));
		}
	}

	public Rota BuscarPorOrigem(Aeroporto origem){
		for(int i=0; i<rotas.size(); i++){
			if(rotas.get(i).getOrigem() == origem){
				return rotas.get(i);
			}
		}
		return null;
	}

    public Rota BuscarPorDestino(Aeroporto destino){
		for(int i=0; i<rotas.size(); i++){
			if(rotas.get(i).getOrigem() == destino){
				return rotas.get(i);
			}
		}
		return null;
	}






}
