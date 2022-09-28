package pucrs.myflight.modelo;
import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;
	private ArrayList<Aeronave> aeronavesCodigo;

    
    public GerenciadorAeronaves() {
		aeronaves = new ArrayList<>();
		aeronavesCodigo = new ArrayList<>();
		
	}

    public void AdicionarAeronave(Aeronave aviao){
		aeronaves.add(aviao);
	}

	public ArrayList<Aeronave> ListarAeronaves(){
		return aeronaves;
	}

	public ArrayList<Aeronave> BuscarPorCodigo(String cod){
		for(int i=0; i<aeronaves.size(); i++){
			if(aeronaves.get(i).getCodigo() == cod){
				aeronavesCodigo.add(aeronaves.get(i));
			}
		}
		return aeronavesCodigo;
	}

	public void ordenaDescricao(){
		Collections.sort(aeronaves);
	}


}
