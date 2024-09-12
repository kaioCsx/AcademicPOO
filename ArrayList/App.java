package br.edu.ifs.academico;
import java.util.ArrayList;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		Scanner ler = new Scanner(System.in);
		
		String nome, localNascimento, dataNascimento;
		char sexo;
		
		ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
		ArrayList<Professor> listaProfessor = new ArrayList<Professor>();
		ArrayList<Merendeira> listaMerendeira = new ArrayList<Merendeira>();
		ArrayList<Pedagogo> listaPedagogo = new ArrayList<Pedagogo>();
		ArrayList<Psicologo> listaPsicologo = new ArrayList<Psicologo>();
		ArrayList<Tecnico> listaTecnico = new ArrayList<Tecnico>();
		ArrayList<Vigilante> listaVigilante = new ArrayList<Vigilante>();
		
		int opcao;
		System.out.println(menu.getMenu());
		System.out.print("Digite um numero: ");
		opcao = ler.nextInt();
		
		while(opcao != 0 ) {
			System.out.println("");
			System.out.println("==========================");
			switch(opcao) {
				case 1:
					System.out.println("Cadastrando Aluno: ");
					
					System.out.println("Nome: ");
					nome = ler.next();
					Aluno aluno = new Aluno(nome);
		
					System.out.println("localNascimento: ");
					localNascimento = ler.next();
					aluno.setLocalNascimento(localNascimento);
					
					System.out.println("dataNascimento: ");
					dataNascimento = ler.next();
					aluno.setDataNascimento(dataNascimento);
					
					System.out.println("Sexo: ");
					sexo = ler.next().charAt(0);
					aluno.setSexo(sexo);
					
					System.out.println("Nota1: ");
					String nota1 = ler.next();
					aluno.setNota1(nota1);
					
					System.out.println("Nota2: ");
					String nota2 = ler.next();
					aluno.setNota2(nota2);
					
					listaAluno.add(aluno);
					
					break;
				case 2:
					System.out.println("Imprimindo Aluno: ");
					break;
				case 3:
					System.out.println("Cadastrando Professor: ");
					
					System.out.println("Nome: ");
					nome = ler.next();
					Professor professor = new Professor(nome);
					
					System.out.println("localNascimento: ");
					localNascimento = ler.next();
					professor.setLocalNascimento(localNascimento);
					
					System.out.println("dataNascimento: ");
					dataNascimento = ler.next();
					professor.setDataNascimento(dataNascimento);
					
					System.out.println("Sexo: ");
					sexo = ler.next().charAt(0);
					professor.setSexo(sexo);
					
					System.out.println("Formação: ");
					String formacao = ler.next();
					professor.setFormacao(formacao);

					listaProfessor.add(professor);
					
					break;
				case 4:
					System.out.println("Imprimindo Professor: ");
					break;
				case 5:
					System.out.println("Cadastrando Psicologo: ");
					
					System.out.println("Nome: ");
					nome = ler.next();
					Psicologo psicologo = new Psicologo(nome);
					
					
					System.out.println("localNascimento: ");
					localNascimento = ler.next();
					psicologo.setLocalNascimento(localNascimento);
					
					System.out.println("dataNascimento: ");
					dataNascimento = ler.next();
					psicologo.setDataNascimento(dataNascimento);
					
					System.out.println("Sexo: ");
					sexo = ler.next().charAt(0);
					psicologo.setSexo(sexo);
					
					System.out.println("Crn: ");
					String crn = ler.next();
					psicologo.setCrn(crn);
					
					System.out.println("Especialidade: ");
					String especialidade = ler.next();
					psicologo.setEspecialidade(especialidade);
					
					System.out.println("Alocação: ");
					String alocacao = ler.next();
					psicologo.setAlocacao(alocacao);
							
					listaPsicologo.add(psicologo);
						
					break;
				case 6:
					System.out.println("Imprimindo Psicologo: ");
					break;
				case 7:
					System.out.println("Cadastrando Pedagogo: ");
					
					System.out.println("Nome: ");
					nome = ler.next();
					Pedagogo pedagogo = new Pedagogo(nome);					
					
					
					System.out.println("localNascimento: ");
					localNascimento = ler.next();
					pedagogo.setLocalNascimento(localNascimento);
					
					System.out.println("dataNascimento: ");
					dataNascimento = ler.next();
					pedagogo.setDataNascimento(dataNascimento);
					
					System.out.println("Sexo : ");
					sexo = ler.next().charAt(0);
					pedagogo.setSexo(sexo);
					
					System.out.println("Experiencia: ");
					String experiencia = ler.next();
					pedagogo.setExperiencia(experiencia);
					
					System.out.println("faixaClasse: ");
					String faixaClasse = ler.next();
					pedagogo.setFaixaClasse(faixaClasse);
					
					listaPedagogo.add(pedagogo);
							
					break;
				case 8:
					System.out.println("Imprimindo Pedagogo: ");
					break;
				case 9:
					System.out.println("Cadastrando Tecnico: ");
					
					System.out.println("Nome: ");
					nome = ler.next();
					Tecnico tecnico = new Tecnico(nome);					
					
					System.out.println("localNascimento: ");
					localNascimento = ler.next();
					tecnico.setLocalNascimento(localNascimento);
					
					System.out.println("dataNascimento: ");
					dataNascimento = ler.next();
					tecnico.setDataNascimento(dataNascimento);
					
					System.out.println("Sexo: ");
					sexo = ler.next().charAt(0);
					tecnico.setSexo(sexo);
					
					System.out.println("Profissao: ");
					String profissao = ler.next();
					tecnico.setProfissao(profissao);
					
					System.out.println("Laboratirio: ");
					String laboratorio = ler.next();
					tecnico.setLaboratorio(laboratorio);
					
					System.out.println("Sala: ");
					String sala = ler.next();
					tecnico.setSala(sala);
					
					listaTecnico.add(tecnico);	
					
					break;	
				case 10:
					System.out.println("Imprimindo Tecnico: ");
					break;
				case 11:
					System.out.println("Cadastrando Merendeira: ");
					
					System.out.println("Nome: ");
					nome = ler.next();
					Merendeira merendeira = new Merendeira(nome);					
					
					System.out.println("localNascimento: ");
					localNascimento = ler.next();
					merendeira.setLocalNascimento(localNascimento);
					
					System.out.println("dataNascimento");
					dataNascimento = ler.next();
					merendeira.setDataNascimento(dataNascimento);
					
					System.out.println("Sexo: ");
					sexo = ler.next().charAt(0);
					merendeira.setSexo(sexo);
					
					System.out.println("Especialidade: ");
					String especialidade1 = ler.next();
					merendeira.setEspecialidade(especialidade1);
					
					System.out.println("Vulgo: ");
					String vulgo = ler.next();
					merendeira.setVulgo(vulgo);
					
					listaMerendeira.add(merendeira);
					
					break;
				case 12:
					System.out.println("Imprimindo Merendeira: ");
					break;
				case 13:
					System.out.println("Cadastrando Vigilante: ");
					
					System.out.println("Nome: ");
					nome = ler.next();
					Vigilante vigilante = new Vigilante(nome);
					
					System.out.println("localNascimento: ");
					localNascimento = ler.next();
					vigilante.setLocalNascimento(localNascimento);
					
					System.out.println("dataNascimento: ");
					dataNascimento = ler.next();
					vigilante.setDataNascimento(dataNascimento);
					
					System.out.println("Sexo: ");
					sexo = ler.next().charAt(0);
					vigilante.setSexo(sexo);
					
					System.out.println("Armado: ");
					boolean armado = ler.nextBoolean();
					vigilante.setArmado(armado);
					
					System.out.println("Horario: ");
					String horario = ler.next();
					vigilante.setHorario(horario);
						
					listaVigilante.add(vigilante);
					
					break;
				case 14:
					System.out.println("Imprimindo Vigilante");
					break;
			}
			System.out.println("========================== \n");
			
			System.out.println(menu.getMenu());
			System.out.print("Digite um numero: ");
			opcao = ler.nextInt();
			
		}
		
	}
	
}

