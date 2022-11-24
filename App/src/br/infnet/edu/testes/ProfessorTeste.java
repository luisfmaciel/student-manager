package br.infnet.edu.testes;

import br.infnet.edu.dominio.Professor;

public class ProfessorTeste {

	public static void main(String[] args) {
		
		try {
			Professor prof1 = new Professor();
			prof1.setNome("Alisson Blois");
			prof1.setEmail("alisson.blois@prof.infnet.edu.br");
			prof1.setDisciplina("Java");
			
			Professor prof2 = new Professor("bruno@prof.com");
			prof2.setDisciplina("Front-End");
			
			Professor prof3 = new Professor("gabriel@prof.com", "Android");
			
			prof1.consultarSituacao(1);
			prof2.consultarSituacao(2);
			prof3.consultarSituacao(3);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
