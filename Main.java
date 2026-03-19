import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        pessoa pessoa = new pessoa();
        passos contagem = new passos();

        boolean rodando = true;

        System.out.println("Digite seu nome: ");
        pessoa.definir_nome(input.nextLine());
        System.out.println(pessoa.nome);

        while (rodando){

            System.out.println(pessoa.nome + ", você vai andar ou resetar?");
            String opcao = input.nextLine();

            if(opcao.equalsIgnoreCase("andar")){
                contagem.dar_passo();
                contagem.get_passos();
            } else if(opcao.equalsIgnoreCase("resetar")){
                contagem.resetar_passos();
            } else {System.out.println("Você digitou um valor inválido");}

        }


    /*
        lucas.definir_CPF("956.371.088-62");
        lucas.definir_idade(15);
        lucas.definir_vivo(false);
        System.out.println(lucas.CPF);
        System.out.println(lucas.idade);
        System.out.println(lucas.vivo);
    */
    }
}
