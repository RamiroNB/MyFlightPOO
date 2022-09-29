package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooDireto extends Voo {
    private Rota rota;
    

    public VooDireto(Rota rota, LocalDateTime datahora) {
        super(datahora);
        this.rota = rota;
    }
    public Rota getRota(){
        return rota;
    }

    //ajeitar para horas corretamente
    public Duration getDuracao(){
        Duration duracao;
        double distancia = Geo.distancia(rota.getOrigem().getLocal(), rota.getDestino().getLocal());
        duracao = Duration.ofMinutes((long) (distancia/805 * 60)+30);

        return duracao;
    }
    
}
