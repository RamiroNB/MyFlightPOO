package pucrs.myflight.modelo;
import java.time.Duration;
import java.time.LocalDateTime;

public  abstract class Voo {
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	
	private LocalDateTime datahora;
	private Status status;
	
	public Voo(LocalDateTime datahora) {
		this.datahora = datahora;
		this.status = Status.CONFIRMADO; // default é confirmado
	}

	public Voo(){
		this.datahora =  LocalDateTime.of(2016, 8, 12, 12, 00);
		this.status = Status.CONFIRMADO; // default é confirmado
	}

	public  abstract Rota getRota();

	public abstract Duration getDuracao();
	
	public LocalDateTime getDatahora() {
		return datahora;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status novo) {
		this.status = novo;
	}
	// fazer toString em todos!
	public String toString(){
		return "";
	}
}
