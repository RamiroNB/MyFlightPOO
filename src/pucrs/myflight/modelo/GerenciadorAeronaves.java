package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;
    
    public GerenciadorAeronaves() {
		aeronaves = new ArrayList<>();
	}

    public void AdicionarAeronave(Aeronave aeronaveAtual){
		aeronaves.add(aeronaveAtual);
	}

	public void ListarAeronaves(){
		for(int i=0; i<aeronaves.size(); i++){
			System.out.println(aeronaves.get(i));
		}
	}

	public Aeronave BuscarPorCodigo(String codigo){
		for(int i=0; i<aeronaves.size(); i++){
			if(aeronaves.get(i).getCodigo() == codigo){
				return aeronaves.get(i);
			}
		}
		return null;
	}


}
