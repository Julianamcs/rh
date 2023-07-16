package br.com.alura.rh.promocao;

import br.com.alura.rh.ValidacaoException.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {
	
	private void promover(Funcionario funcionario, boolean metaBatida) {
		// TODO Auto-generated method stub
       Cargo cargoAtual = funcionario.getCargo();
       if (Cargo.GERENTE == cargoAtual) {
    	   throw new ValidacaoException("Gerente n�o pode ser promovido!");
	}
       if(metaBatida) {
    	   Cargo novoCargo = cargoAtual.getProximoCargo();
    	   funcionario.promover(novoCargo);
       }else {
       
    	   throw new ValidacaoException("Funcionarios n�o Bateu a Meta!");
	}

 }
}