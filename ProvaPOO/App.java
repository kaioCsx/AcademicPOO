package prova.ifs;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Menu menu = new Menu();
		Scanner ler = new Scanner(System.in);
		
		// Declarar Variaveis.
		String nome;
		int forca, vidas;
		
		// Declarando o vetor.
		Espadachim[]listaEspadachim = new Espadachim[5];
		Arqueiro[]listaArqueiro = new Arqueiro[5];
		Ninja[]listaNinja = new Ninja[5];
		Gladiador[]listaGladiador = new Gladiador[5];
		Lutador[]listaLutador = new Lutador[5];
		
		// Criando o contador.
		int contEspadachim = 0;
		int contArqueiro = 0;
		int contNinja = 0;
		int contGladiador = 0;
		int contLutador = 0;
		
		int opcao;
		System.out.println(menu.getMenu());
		System.out.println("Escolha um numero: ");
		opcao = ler.nextInt();
		
		while(opcao != 0) {
			switch(opcao) {
			case 1:
				System.out.println("Digite Nome do Espadachim: ");
				nome = ler.next();
				
				System.out.println("Digite quantidade de vidas do Espadachim: ");
				vidas = ler.nextInt();
				Espadachim espadachim = new Espadachim(nome, vidas);
				
				System.out.println("Digite a Forca fisica do Espadachim: ");
				forca = ler.nextInt();
				espadachim.setForca(forca);
				
				System.out.println("Digite a Habilidade com Espadas: ");
				int habilidadeEspada = ler.nextInt();
				espadachim.setHabilidadeEspada(habilidadeEspada);
				
				System.out.println("Digite a Velocidade de ataque: ");
				int velocidade = ler.nextInt();
				espadachim.setVelocidade(velocidade);
				
				listaEspadachim[contEspadachim] = espadachim;
				contEspadachim ++;
				
				break;
			case 2:
				System.out.println("Digite Nome do Arqueiro: ");
				nome = ler.next();
				
				System.out.println("Digite quantidade de vidas do Arqueiro: ");
				vidas = ler.nextInt();
				Arqueiro arqueiro = new Arqueiro(nome, vidas);
				
				System.out.println("Digite a Forca fisica do Arqueiro: ");
				forca = ler.nextInt();
				arqueiro.setForca(forca);
          
				System.out.println("Digite Habilidade com arcos: ");
				int habilidadeArco = ler.nextInt();
				arqueiro.setHabilidadeArco(habilidadeArco);
				
				System.out.println("Digite Alcance do ataque: ");
				int alcance = ler.nextInt();
				arqueiro.setAlcance(alcance);
				
				listaArqueiro[contArqueiro] = arqueiro;
				contArqueiro ++;
				
				break;
			case 3:
				System.out.println("Digite Nome do Ninja: ");
				nome = ler.next();
				
				System.out.println("Digite quantidade de vidas do Ninja: ");
				vidas = ler.nextInt();
				Ninja ninja = new Ninja(nome, vidas);
				
				System.out.println("Digite a Forca fisica do Ninja: ");
				forca = ler.nextInt();
				ninja.setForca(forca);
				
				System.out.println("Digite rapidez do Ninja: ");
				int rapidez = ler.nextInt();
				ninja.setRapidez(rapidez);
				
				System.out.println("Digite aceleracao do Ninja: ");
				int aceleracao = ler.nextInt();
				ninja.setAceleracao(aceleracao);
				
				listaNinja[contNinja] = ninja;
				contNinja ++;
				
				break;
			case 4:
				System.out.println("Digite Nome do Gladiador: ");
				nome = ler.next();
				
				System.out.println("Digite quantidade de vidas do Gladiador: ");
				vidas = ler.nextInt();
				Gladiador gladiador = new Gladiador(nome, vidas);
				
				System.out.println("Digite a Forca fisica do Gladiador: ");
				forca = ler.nextInt();
				gladiador.setForca(forca);
				
				System.out.println("Digite Defesa do gladiador: ");
				int defesa = ler.nextInt();
				gladiador.setDefesa(defesa);
				
				System.out.println("Digite nivel de Escudo do gladiador: ");
				int escudo = ler.nextInt();
				gladiador.setEscudo(escudo);
				
				listaGladiador[contGladiador] = gladiador;
				contGladiador ++;
				
				break;
			case 5:
				System.out.println("Digite Nome do Lutador: ");
				nome = ler.next();
				
				System.out.println("Digite quantidade de vidas do Lutador: ");
				vidas = ler.nextInt();
				Lutador lutador = new Lutador(nome, vidas);
				
				System.out.println("Digite a Forca fisica Lutador: ");
				forca = ler.nextInt();
				lutador.setForca(forca);
				
				System.out.println("Digite forca do chute: ");
				int forcaChute = ler.nextInt();
				lutador.setForcaChute(forcaChute);
				
				System.out.println("Digite forca do soco: ");
				int forcaSoco = ler.nextInt();
				lutador.setForcaSoco(forcaSoco);
				
				listaLutador[contLutador] = lutador;
				contLutador ++;
				
				break;
			}
			
			System.out.println(menu.getMenu());
			System.out.println("Escolha um numero: ");
			opcao = ler.nextInt();
		}	

	}

}
