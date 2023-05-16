import java.util.Scanner;

public class Main {
        static Scanner sc = new Scanner(System.in);
        static String[][] tabuleiro = {
                {"_", "_", "_"},
                {"_", "_", "_"},
                {"_", "_", "_"}
        };
    public static void main(String[] args) {
        boolean continua = true;

        while (continua){
        jogada(1);
        jogada(2);

        }
    }

    public static void jogada(int jogador){
        boolean escolhaCorreta = false;
        do {
        System.out.println("Vez do Jogador " + jogador);
        System.out.println("Escreva a posição da Coluna de 1 a 3: ");
        Integer escolhaColuna = sc.nextInt();
        System.out.println("Escreva a posição da Linha de 1 a 3: ");
        Integer escolhaLinha = sc.nextInt();
        if (tabuleiro[escolhaLinha-1][escolhaColuna-1].equals("_")) {
            tabuleiro[escolhaLinha-1][escolhaColuna-1] = (jogador==1)?"X": "O";
            escolhaCorreta = true;
        } else {
            System.out.println("ocupado, escolha outra posição");
        }
        imprimeTabuleiro(tabuleiro);
        } while (!escolhaCorreta);
    }

    public static void imprimeTabuleiro(String[][] tabuleiro){
        System.out.println("\n");
        for (String [] linha : tabuleiro
             ) {
            for (String coluna: linha
                 ) {
                System.out.print(coluna+"\t");
            }
            System.out.println("");
        }
        System.out.println("\n");

    }
}