package pucrs.myflight.modelo;

public class Aeroporto implements Comparable<Aeroporto>{
	private String codigo;
	private String nome;
	private Geo loc;
	
	public Aeroporto(String codigo, String nome, Geo loc) {
		this.codigo = codigo;
		this.nome = nome;
		this.loc = loc;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Geo getLocal() {
		return loc;
	}

	public int compareTo(Aeroporto outro){
		return nome.compareTo(outro.getNome());
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("código:" + codigo);
		sb.append("nome"+nome);
		sb.append("local:"+loc.toString());
		return sb.toString();
	}
}
