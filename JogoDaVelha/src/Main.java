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
            continua = mostrarResultado();
            jogada(2);
            continua = mostrarResultado();
        }

    }

    public static Boolean mostrarResultado(){
            Integer jogadorVencedor = verificarResultado();

            if (jogadorVencedor != null) {
                if (jogadorVencedor.equals(1)){
                    System.out.println("Jogador 1 é vencedor");

                } else {
                    System.out.println("Jogador 2 é vencedor");
                }
                    return false;
            }
            return true;
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

    public static Integer verificarResultado(){

        if (
                !tabuleiro[2][0].equals("_")
                        && tabuleiro[2][0].equals(tabuleiro[1][1])
                        && tabuleiro[1][1].equals(tabuleiro[0][2])) {
            return tabuleiro[2][0].equals("X")?1:2;
        }

        if (
                !tabuleiro[0][0].equals("_")
                        && tabuleiro[0][0].equals(tabuleiro[1][1])
                        && tabuleiro[1][1].equals(tabuleiro[2][2])) {
            return tabuleiro[0][0].equals("X")?1:2;
        }

        for (int i = 0; i < tabuleiro.length; i++){
            if (
                    !tabuleiro[i][0].equals("_")
                            && tabuleiro[i][0].equals(tabuleiro[i][1])
                            && tabuleiro[i][1].equals(tabuleiro[i][2])) {
                return tabuleiro[i][0].equals("X")?1:2;
            }
            for (int j = 0; j < tabuleiro[i].length; j++){
                if (
                        !tabuleiro[0][j].equals("_")
                                && tabuleiro[0][j].equals(tabuleiro[1][j])
                                && tabuleiro[1][j].equals(tabuleiro[2][j])) {
                    return tabuleiro[0][j].equals("X")?1:2;
                }
            }
        }

        return null;
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