package br.infnet.edu.testes;

import br.infnet.edu.dominio.Professor;

public class ProfessorTeste {

	public static void main(String[] args) {
		
		try {
			Professor prof1 = new Professor();
			prof1.setNome("Alisson");
			prof1.setSobrenome("Blois");
			prof1.setEmail("alisson.blois@prof.infnet.edu.br");
			prof1.setDisciplina("Java");
			
			Professor prof2 = new Professor("Bruno", "Silva");
			prof2.setEmail("bruno.silva@prof.infnet.edu.br");
			prof2.setDisciplina("Front-End");
			
			Professor prof3 = new Professor("Gabriel", "Vicente", "gabriel@prof.infnet.edu.br", "Android");
			
			prof1.consultarSituacao(1);
			prof2.consultarSituacao(2);
			prof3.consultarSituacao(3);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
