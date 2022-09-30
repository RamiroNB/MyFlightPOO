package pucrs.myflight.modelo;
import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.util.ArrayList;


public class GerenciadorVoos {
    private ArrayList<Voo> voos;

    public GerenciadorVoos() {
		voos = new ArrayList<>();

	}

    public void AdicionarVoo(Voo vooAtual){
        voos.add(vooAtual);
    }

    public ArrayList<Voo> ListarVoos(){
        return voos;
    }

    public ArrayList<Voo> BuscarData(LocalDate data){
        ArrayList<Voo> voosData = new ArrayList<>();
        for(int i=0; i<voos.size(); i++){
			if(voos.get(i).getDatahora().toLocalDate() == data){ 
                voosData.add(voos.get(i));              
            }
		}
        return voosData;
    }
	public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Voo voo : voos) {
            sb.append(voo.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
