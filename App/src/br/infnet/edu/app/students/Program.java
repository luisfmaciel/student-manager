package br.infnet.edu.app.students;

import java.util.Scanner;

public class Program {

	private static String[] nomes;
	private static float[] notasAv1;
	private static float[] notasAv2;
	private static final int TAMANHO_VETOR = 100;

	private static void divider() {
		System.out.println("------------------------------------------------------------------------");
	}

	private static void exibeMenu() {
		System.out.println("[1] Registrar as notas de um novo aluno.");
		System.out.println("[2] Consultar boletim de um aluno.");
		System.out.println("[3] Consultar notas da turma.");
		System.out.println("[4] Sair.");
		divider();
	}

	private static float calculaMediaDoAluno(float notaAv1, float notaAv2) {
		return (notaAv1 + notaAv2) / 2;
	}

	private static String verificaSituacaoDoAluno(float media) {
		if (media >= 7) {
			return "Aprovado";
		} else if (media < 4) {
			return "Reprovado";
		}

		return "Prova final";
	}

	private static void imprimiAlunosCadastrados() {
		for(int i = 0; i < TAMANHO_VETOR; i++) {
			if(nomes[i] != null) {
				imprimiSituacaoDoAluno(i);
			}			
		}
	}

	private static void imprimiSituacaoDoAluno(int codigo) {
		float media = calculaMediaDoAluno(notasAv1[codigo], notasAv2[codigo]);
		String situacao = verificaSituacaoDoAluno(media);
		divider();
		System.out.println(codigo + " - " + nomes[codigo] + " | AV1: " + notasAv1[codigo] + " | AV2: "
				+ notasAv2[codigo] + " | MÉDIA: " + media + " | SITUAÇÃO: " + situacao);
		divider();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		nomes = new String[TAMANHO_VETOR];
		notasAv1 = new float[TAMANHO_VETOR];
		notasAv2 = new float[TAMANHO_VETOR];

		int ultimaPosicao = 0;
		String option;

		do {
			exibeMenu();
		
			System.out.println("Informe uma opção: ");
			option = in.next();

			switch (option) {
			case "1": {
				if (ultimaPosicao < TAMANHO_VETOR) {
					divider();
					System.out.print("Informe o nome do aluno: ");
					nomes[ultimaPosicao] = in.next();

					System.out.print("Informe a nota AV1: ");
					notasAv1[ultimaPosicao] = in.nextFloat();

					System.out.print("Informe a nota AV2: ");
					notasAv2[ultimaPosicao] = in.nextFloat();

					System.out.println();

					imprimiSituacaoDoAluno(ultimaPosicao);
					
					ultimaPosicao++;

				} else {
					System.out.println("Não é possível inserir um novo aluno");
				}
				break;
			}
			case "2": {
				divider();
				System.out.println("Informe o código do aluno: ");
				int codigoDoAluno = in.nextInt();
				
				if(codigoDoAluno >= 0 && codigoDoAluno < ultimaPosicao) {
					imprimiSituacaoDoAluno(codigoDoAluno);					
				} else {
					divider();
					System.out.println("O código do aluno ("+codigoDoAluno+") é inválido!");
					divider();
				}
				
				break;
			}
			case "3": {
				imprimiAlunosCadastrados();
				break;
			}
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
