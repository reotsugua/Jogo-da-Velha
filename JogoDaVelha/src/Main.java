import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] tabuleiro = {
                {"_", "_", "_"},
                {"_", "_", "_"},
                {"_", "_", "_"}
        };

        /*System.out.println("Jogador 1");
        System.out.println("Escreva a posição da Coluna de 1 a 3: ");
        Integer escolhaColunaJ1 = sc.nextInt();
        System.out.println("Escreva a posição da Linha de 1 a 3: ");
        Integer escolhaLinhaJ1 = sc.nextInt();*/

        tabuleiro[escolhaLinhaJ1-1][escolhaColunaJ1-1] = "x";
        imprimeTabuleiro(tabuleiro);

        System.out.println("Jogador 2");
        System.out.println("Escreva a posição da Coluna de 1 a 3: ");
        Integer escolhaColunaJ2 = sc.nextInt();
        System.out.println("Escreva a posição da Linha de 1 a 3: ");
        Integer escolhaLinhaJ2 = sc.nextInt();
        if (tabuleiro[escolhaLinhaJ2-1][escolhaColunaJ2-1] != null) {
            System.out.println("ta ocupado");
        } else {
            tabuleiro[escolhaLinhaJ2-1][escolhaColunaJ2-1] = "o";
        };
        imprimeTabuleiro(tabuleiro);
    }
    public static Integer escolhaJogador1 (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Jogador 1");
        System.out.println("Escreva a posição da Coluna de 1 a 3: ");
        Integer coluna = sc.nextInt();
        System.out.println("Escreva a posição da Linha de 1 a 3: ");
        Integer linha = sc.nextInt();

        return coluna;
    }

    public static void imprimeTabuleiro(String[][] tabuleiro){
        for (String [] linha : tabuleiro
             ) {
            for (String coluna: linha
                 ) {
                System.out.print(coluna+"\t");
            }
            System.out.println(" ");
        }

    }
}