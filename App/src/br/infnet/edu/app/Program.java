package br.infnet.edu.app;

import java.util.Scanner;

import br.infnet.edu.dominio.Aluno;
import br.infnet.edu.dominio.Pessoa;
import br.infnet.edu.dominio.Professor;
import br.infnet.edu.auxiliar.Constante;

public class Program {

	private static Pessoa[] pessoas;
	
	private static void divider() {
		System.out.println("------------------------------------------------------------------------");
	}

	private static void exibeMenu() {
		System.out.println("[1] Cadastrar Professor");
		System.out.println("[2] Cadastrar Aluno");
		System.out.println("[3] Consultar situação de um docente/discente");
		System.out.println("[4] Sair.");
		divider();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		pessoas = new Pessoa[Constante.TAMANHO_VETOR_100];

		int pos = 0;
		String option;

		do {
			exibeMenu();
		
			System.out.println("Informe uma opção: ");
			option = in.next();

			switch (option) {
			case "1": {
				if (pos < Constante.TAMANHO_VETOR_100) {
					divider();
					
					Professor prof = new Professor();
					
					System.out.print("Informe o nome do professor: ");
					prof.setNome(in.next());
					
					System.out.print("Informe o sobrenome do professor: ");
					prof.setSobrenome(in.next());
					
					System.out.print("Informe o email do professor: ");
					prof.setEmail(in.next());
					
					System.out.print("Informe a disciplina do professor: ");
					prof.setDisciplina(in.next());
					
					pessoas[pos] = prof;
					
					pessoas[pos].consultarSituacao(pos);
					
					pos++;

				} else {
					System.out.println("Não é possível inserir um novo aluno");
				}
				break;
			}
			case "2": {
				if (pos < Constante.TAMANHO_VETOR_100) {
					divider();
					
					Aluno al = new Aluno();
					
					System.out.print("Informe o nome do aluno: ");
					al.setNome(in.next());
					
					System.out.print("Informe o sobrenome do aluno: ");
					al.setSobrenome(in.next());
					
					System.out.print("Informe o email do aluno: ");
					al.setEmail(in.next());

					System.out.print("Informe a nota AV1: ");
					al.setNotaAv1(in.nextFloat());

					System.out.print("Informe a nota AV2: ");
					al.setNotaAv2(in.nextFloat());

					System.out.println();

					pessoas[pos] = al;
					
					pessoas[pos].consultarSituacao(pos);
					
					pos++;

				} else {
					System.out.println("Não é possível inserir um novo aluno");
				}
				break;
			}
			case "3": {
				divider();
				System.out.println("Informe o código do docente/discente: ");
				int codigo = in.nextInt();
				
				if(codigo >= 0 && codigo < pos) {
					pessoas[codigo].consultarSituacao(codigo);					
				} else {
					divider();
					System.out.println("O código do aluno ("+codigo+") é inválido!");
					divider();
				}
				
				break;
			}
//			case "3": {
//				imprimiAlunosCadastrados();
//				break;
//			}
			default:
				if(!option.equals("4")) {
					divider();
					System.out.println("Opção inválida!");
					divider();
				}
				break;
			}

		} while (!option.equals("4"));

		System.out.println("Gerenciador acadêmico finalizado!");
		
		in.close();
	}
}
