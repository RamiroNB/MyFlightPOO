package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	private ArrayList<CiaAerea> empresasNome;
	private ArrayList<CiaAerea> empresasCodigo;
	public GerenciadorCias() {
		empresas = new ArrayList<>();
		empresasNome = new ArrayList<>();
		empresasCodigo = new ArrayList<>();
	}

	public void AdicionarEmpresa(CiaAerea ciaAtual){
		empresas.add(ciaAtual);
	}

	public ArrayList<CiaAerea> ListarEmpresas(){
		return empresas;
	}

	public ArrayList<CiaAerea> BuscarPorCodigo(String codigo){

		for(int i=0; i<empresas.size(); i++){
			if(empresas.get(i).getCodigo() == codigo){
				empresasCodigo.add(empresas.get(i));
			}
		}
		return empresasCodigo;
	}

	public ArrayList<CiaAerea> BuscarPorNome(String nome){
		
		for(int i=0; i<empresas.size(); i++){
			if(empresas.get(i).getNome() == nome){
				empresasNome.add(empresas.get(i));
			}
		}
		return empresasNome;
	}


}
