package pucrs.myflight.modelo;
import java.util.ArrayList;

import org.xml.sax.SAXNotSupportedException;

public class GerenciadorVoos {
    private ArrayList<Voo> voos;

    public GerenciadorVoos() {
		voos = new ArrayList<>();
	}

    public void AdicionarVoo(Voo vooAtual){
        voos.add(vooAtual);
    }

    public void ListarVoos(){
        for(int i=0; i<voos.size(); i++){
			System.out.println(voos.get(i));
		}
    }


}
