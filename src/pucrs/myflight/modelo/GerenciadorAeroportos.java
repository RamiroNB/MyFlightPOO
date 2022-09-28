package pucrs.myflight.modelo;
import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;
    private ArrayList<Aeroporto> aeroportosCodigos;
    public GerenciadorAeroportos() {
		aeroportos = new ArrayList<>();
		aeroportosCodigos = new ArrayList<>();
	}

    public void AdicionarAeroporto(Aeroporto aeroportoAtual){
		aeroportos.add(aeroportoAtual);
	}

	public void ListarAeroportos(){
		for(int i=0; i<aeroportos.size(); i++){
			System.out.println(aeroportos.get(i));
		}
	}

	public ArrayList<Aeroporto> BuscarPorCodigo(String codigo){
		for(int i=0; i<aeroportos.size(); i++){
			if(aeroportos.get(i).getCodigo() == codigo){
				aeroportosCodigos.add(aeroportos.get(i));
			}
		}
		return aeroportosCodigos;
	}

	public void ordenaNome(){
		Collections.sort(aeroportos);
	}
}
