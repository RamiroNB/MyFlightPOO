package pucrs.myflight.modelo;
import java.time.LocalDateTime;
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
    public ArrayList<Voo> BuscarData(LocalDateTime dataHora){
        for(int i=0; i<voos.size(); i++){
			if(voos.get(i).getDatahora() == dataHora){ //ta dando erro pq Voo é data e hora, 
                //return voos.get(i);               //e o gerenciador manda so buscar por hora, n sei resolver

                // !ta retornando um só tem que retornar um array de voos!
            }
		}
        return null;
    }
}
