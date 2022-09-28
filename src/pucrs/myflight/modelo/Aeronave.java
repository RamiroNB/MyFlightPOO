package pucrs.myflight.modelo;

public class Aeronave implements Imprivel, Contaveis, Comparable<Aeronave>{
	private String codigo;
	private String descricao;
	private static int totalAeronaves = 0;
	
	public Aeronave(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
		totalAeronaves++;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void imprimir(){//implementção da interface 
		System.out.println(codigo+" - "+descricao);
	}
	public int quantidade(){//implementção da interface 
		return totalAeronaves;
	}
	//incompleto, fazendo:
	public int compareTo(Aeronave outra){
		return 0;
	}
}

