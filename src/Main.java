
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conexao conexao = new Conexao();
        Scanner scanner = new Scanner(System.in);
        String API_KEY = System.getenv("API_KEY");
        String url = "";
        double valor;
        double taxa;
        double valorConveritido;

        int opc = 0;

        while (opc != 7) {
            System.out.println("*******************************************************");
            System.out.println("Seja bem vindo ao Conversor de Moedas!\n");
            System.out.println("1) Dólar -> Peso Argentino");
            System.out.println("2) Peso Argentino -> Dólar");
            System.out.println("3) Dólar -> Real Brasileiro");
            System.out.println("4) Real Brasileiro -> Dólar");
            System.out.println("5) Dólar -> Peso Colombiano");
            System.out.println("6) Peso Colombiano -> Dólar");
            System.out.println("7) Sair");
            System.out.println("Escolha uma opção válida: ");
            opc = scanner.nextInt();

            if (opc == 7) break;

            switch (opc){
                case 1:
                    System.out.println("\nDigite o valor que deseja converter:");
                    valor = scanner.nextDouble();

                    // dolar -> peso argentino
                    url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/USD/ARS";
                    taxa = conexao.getTaxaDeConversao(url);
                    valorConveritido = valor * taxa;

                    System.out.println(String.format("Valor " + valor + " [USD] corresponde ao valor de %.2f [ARS]", valorConveritido));
                    break;
                case 2:
                    System.out.println("\nDigite o valor que deseja converter:");
                    valor = scanner.nextDouble();

                    // peso argentino -> dolar
                    url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/ARS/USD";
                    taxa = conexao.getTaxaDeConversao(url);
                    valorConveritido = valor * taxa;

                    System.out.println(String.format("Valor " + valor + " [ARS] corresponde ao valor de %.2f [USD]", valorConveritido));
                    break;
                case 3:
                    System.out.println("\nDigite o valor que deseja converter:");
                    valor = scanner.nextDouble();

                    // dolar -> real brasileiro
                    url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/USD/BRL";
                    taxa = conexao.getTaxaDeConversao(url);
                    valorConveritido = valor * taxa;

                    System.out.println(String.format("Valor " + valor + " [USD] corresponde ao valor de %.2f [BRL]", valorConveritido));
                    break;
                case 4:
                    System.out.println("\nDigite o valor que deseja converter:");
                    valor = scanner.nextDouble();

                    // real brasileiro -> dolar
                    url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/BRL/USD";
                    taxa = conexao.getTaxaDeConversao(url);
                    valorConveritido = valor * taxa;

                    System.out.println(String.format("Valor " + valor + " [BRL] corresponde ao valor de %.2f [USD]", valorConveritido));
                    break;
                case 5:
                    System.out.println("\nDigite o valor que deseja converter:");
                    valor = scanner.nextDouble();

                    // dolar -> peso colombiano
                    url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/USD/COP";
                    taxa = conexao.getTaxaDeConversao(url);
                    valorConveritido = valor * taxa;

                    System.out.println(String.format("Valor " + valor + " [USD] corresponde ao valor de %.2f [COP]", valorConveritido));
                    break;
                case 6:
                    System.out.println("\nDigite o valor que deseja converter:");
                    valor = scanner.nextDouble();

                    // peso colombiano -> dolar
                    url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/COP/USD";
                    taxa = conexao.getTaxaDeConversao(url);
                    valorConveritido = valor * taxa;

                    System.out.println(String.format("Valor " + valor + " [COP] corresponde ao valor de %.2f [USD]", valorConveritido));
                    break;
            }
        }
        scanner.close();
    }
}

