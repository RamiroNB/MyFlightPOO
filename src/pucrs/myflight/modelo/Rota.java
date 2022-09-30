package pucrs.myflight.modelo;

public class Rota implements Comparable<Rota>{
	private CiaAerea cia;
	private Aeroporto origem;
	private Aeroporto destino;
	private Aeronave aeronave;
	
	public Rota(CiaAerea cia, Aeroporto origem, Aeroporto destino, Aeronave aeronave) {
		this.cia = cia;
		this.origem = origem;
		this.destino = destino;
		this.aeronave = aeronave;		
	}	
	
	public CiaAerea getCia() {
		return cia;
	}
	
	public Aeroporto getDestino() {
		return destino;
	}
	
	public Aeroporto getOrigem() {
		return origem;
	}
	
	public Aeronave getAeronave() {
		return aeronave;
	}
	//implementação comparable
	public int compareTo(Rota outra){
		return cia.getNome().compareTo(outra.getCia().getNome());// Tava outra.cia...  ,   alterei pra outra.getCia...
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Cia: "+ cia + "\n");
		sb.append("Origem" + origem+"\n");
		sb.append("Destino:"+destino+"\n");
		sb.append("Aeronave:"+aeronave.toString()+"\n");
		return sb.toString();

	}

	
}
