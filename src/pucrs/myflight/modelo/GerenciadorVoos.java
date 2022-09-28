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

    //arrumar
    public ArrayList<Voo> BuscarData(LocalDate data){
        ArrayList<Voo> voosData = new ArrayList<>();
        for(int i=0; i<voos.size(); i++){
			if(voos.get(i).getDatahora().toLocalDate() == data){ //ta dando erro pq Voo é data e hora, 
                voosData.add(voos.get(i));               //e o gerenciador manda so buscar por hora, n sei resolver
            }
		}
        return voosData;
    }
}
