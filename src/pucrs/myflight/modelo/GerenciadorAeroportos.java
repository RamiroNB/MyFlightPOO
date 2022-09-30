package pucrs.myflight.modelo;
import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;

    public GerenciadorAeroportos() {
		aeroportos = new ArrayList<>();
	}

    public void AdicionarAeroporto(Aeroporto aeroportoAtual){
		aeroportos.add(aeroportoAtual);
	}

	public void ListarAeroportos(){
		for(int i=0; i<aeroportos.size(); i++){
			System.out.println(aeroportos.get(i));
		}
	}

	public Aeroporto BuscarPorCodigo(String codigo){
		for(int i=0; i<aeroportos.size(); i++){
			if(aeroportos.get(i).getCodigo() == codigo){
				return aeroportos.get(i);
			}
		}
		return null;
	}

	public void ordenaNome(){
		Collections.sort(aeroportos);
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for (Aeroporto aeroporto : aeroportos) {
			sb.append(aeroporto.toString());
		}
		return sb.toString();
	}
}
