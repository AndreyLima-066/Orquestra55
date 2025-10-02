import java.util.Scanner;
public class Orquestra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Bem-Vindo a Orquestra do Paipai ---");
        System.out.println("Escolha um Instrumento para ouvir:\n1 - Violão \n2 - Piano \n3 - Bateria \n4 - Ukulele \n5 - Sair");
        int escolha = scanner.nextInt();
        Instrumento InstrumentoSelecionado = null;


        if (escolha == 1) {
            InstrumentoSelecionado = new Ukulele();
        } else if (escolha == 2) {
            InstrumentoSelecionado = new Violao();
        } else if (escolha == 3) {
            InstrumentoSelecionado = new Piano();
        } else if (escolha == 4) {
            InstrumentoSelecionado = new Bateria();
        } else if (escolha == 5) {
            System.out.println("saindo");
            scanner.close();
            return;
        }

        InstrumentoSelecionado.visitar();
    }

}
