/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package JOGOJAVA;

import java.util.Scanner;

public class App{
    private static Scanner scanner = new Scanner(System.in);
    private static Personagem jogador;
    private static Personagem inimigo = new ReiBarbaro("Heroi do Coliseu");

    public static void main(String[] args) {
        System.out.println("Qual o nome do seu personagem?");
        String nome = scanner.nextLine();
        System.out.println("No coracao de Roma, sob o calor abrasante do sol," + nome +", um gladiador veterano, estava em silencio em sua cela. O som da multidao ao longe ecoava, crescendo a cada momento que se aproximava da grande batalha. A arena do Coliseu estava prestes a se encher com milhares de espectadores famintos por sangue e emocao.\n" +
"");

        System.out.println("Escolha sua classe: ");
        System.out.println("1. Rei Barbaro");
        System.out.println("2. Principe Servo");
        System.out.println("3. Rainha Arqueira");
        int escolhaClasse = scanner.nextInt();
        scanner.nextLine(); 

        switch (escolhaClasse) {
            case 1:
                jogador = new ReiBarbaro(nome);
                break;
            case 2:
                jogador = new PrincipeServo(nome);
                break;
            case 3:
                jogador = new RainhaArqueira(nome);
                break;
            default:
                System.out.println("Escolha invalida!");
                return;
        }

        System.out.println(nome + ",voce tem duas opcoes:");
        System.out.println("1: enfrentar heroi");
        System.out.println("2. Ir embora");

        int escolha = scanner.nextInt();
        if (escolha == 2) {
            System.out.println(nome + " decidiu ir embora. O jogo acabou.");
            return;
        }

        // Iniciar combate
        combate();
    }

    private static void combate() {
        while (jogador.getVida() > 0 && inimigo.getVida() > 0) {
            System.out.println("\nStatus do personagem:");
            System.out.println("Vida: " + jogador.getVida() + " Forca: " + jogador.getForca() + " Mana: " + jogador.getMana());
            System.out.println("\nO inimigo esta pronto para o combate!");
            System.out.println("Voce esta frente a frente com seu inimigo!");

            System.out.println("Escolha uma acao:");
            System.out.println("1. Atacar");
            System.out.println("2. Usar magia");
            System.out.println("3. Usar item");
            System.out.println("4. Fugir");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    jogador.atacar(inimigo);
                    break;
                case 2:
                    jogador.usarMagia(inimigo);
                    break;
                case 3:
                    jogador.usarItem();
                    break;
                case 4:
                    jogador.fugir();
                    return;
                default:
                    System.out.println("Opção invalida!");
            }

            // Inimigo ataca
            if (inimigo.getVida() > 0) {
                System.out.println("\nO inimigo contra-ataca!");
                inimigo.atacar(jogador);
            }
        }

        if (jogador.getVida() <= 0) {
            System.out.println(jogador.getNome() + " foi derrotado. O jogo acabou.");
        } else {
            System.out.println(jogador.getNome() + " derrotou o heroi! Voce venceu.");
        }
    }
}
