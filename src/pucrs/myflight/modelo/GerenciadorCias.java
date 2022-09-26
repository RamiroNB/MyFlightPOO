package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	public void AdicionarEmpresa(CiaAerea ciaAtual){
		empresas.add(ciaAtual);
	}

	public void ListarEmpresas(){
		for(int i=0; i<empresas.size(); i++){
			System.out.println(empresas.get(i));
		}
	}

	public CiaAerea BuscarPorCodigo(String codigo){

		for(int i=0; i<empresas.size(); i++){
			if(empresas.get(i).getCodigo() == codigo){
				return empresas.get(i);
			}
		}
		return null;
	}

	public CiaAerea BuscarPorNome(String nome){

		for(int i=0; i<empresas.size(); i++){
			if(empresas.get(i).getNome() == nome){
				return empresas.get(i);
			}
		}
		return null;
	}


}
