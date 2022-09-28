package pucrs.myflight.modelo;
import java.util.ArrayList;
import java.util.Collections;
import javafx.print.Collation;

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


}
