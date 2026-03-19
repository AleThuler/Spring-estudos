public class passos {
    int passos = 0;


    void dar_passo(){
        this.passos++;
        System.out.println("Você deu um passo");
    }
    void resetar_passos(){
        this.passos = 0;
        System.out.println("Resetado :(");
    }
    void get_passos(){
        System.out.println("Você andou: " + this.passos);
    }
}
