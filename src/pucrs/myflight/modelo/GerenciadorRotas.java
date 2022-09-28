package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;
    
    public GerenciadorRotas() {
		rotas = new ArrayList<>();
	}

    public void AdicionarRota(Rota rotaAtual){
		rotas.add(rotaAtual);
	}

	public ArrayList<Rota> ListarRotas(){
		return rotas;
	}

	//arrumar
	public ArrayList<Rota> BuscarPorOrigem(Aeroporto orig){
		for(int i=0; i<rotas.size(); i++){
			if(rotas.get(i).getOrigem() == orig){//ta mandando entregar uma Arraylist, mas será q é mesmo?
				//return rotas.get(i);			// deixei assim pq pra mim n faz sentido devolver uma arlst
			}
		}
		return null;
	}

	//arrumar
    public ArrayList<Rota> BuscarPorDestino(Aeroporto destino){
		for(int i=0; i<rotas.size(); i++){
			if(rotas.get(i).getOrigem() == destino){
				//return rotas.get(i);
			}
		}
		return null;
	}






}
