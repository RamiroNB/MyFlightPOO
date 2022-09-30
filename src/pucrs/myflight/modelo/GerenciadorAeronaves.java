package pucrs.myflight.modelo;
import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;
	
    public GerenciadorAeronaves() {
		aeronaves = new ArrayList<>();
	}

    public void AdicionarAeronave(Aeronave aviao){
		aeronaves.add(aviao);
	}

	public ArrayList<Aeronave> ListarAeronaves(){
		return aeronaves;
	}

	public Aeronave BuscarPorCodigo(String cod){
		for(int i=0; i<aeronaves.size(); i++){
			if(aeronaves.get(i).getCodigo() == cod){
				return aeronaves.get(i);
			}
		}
		return null;
	}

	public void ordenaDescricao(){
		Collections.sort(aeronaves);
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(Aeronave aeronave: aeronaves){
			sb.append(aeronave.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
}
