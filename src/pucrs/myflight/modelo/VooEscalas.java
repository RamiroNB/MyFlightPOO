package pucrs.myflight.modelo;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooEscalas extends Voo{
    ArrayList<Rota> rotas;

    public VooEscalas(LocalDateTime datahora) {
        super(datahora); // chama o construtor de Voo
        rotas = new ArrayList<>();
     }

     public void adicionarRota(Rota rota){
        rotas.add(rota);
     }
    
     public Rota getRota(){
        return rotas.get(0);
     }
     public ArrayList<Rota> getRotas(){
        return rotas;
     }
     //arrumar duracao
     public Duration getDuracao(){
        Duration duracao = Duration.ofMinutes(0);
        for (Rota rota : rotas) {
            double distancia = Geo.distancia(rota.getOrigem().getLocal(), rota.getDestino().getLocal());
            duracao = duracao.plus(Duration.ofMinutes((long) (distancia/805 * 60)+30)) ; 
        }
        return duracao;
     }

     @Override
    public String toString() {
        return super.toString() + " -> "; //+rotaFinal;
    }

}
