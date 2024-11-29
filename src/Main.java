import java.util.ArrayList;

public class Main {

    static String nomeDoVideo = "Começando do Zero em Java!";

    public String nome;

    protected int salario;

    public static void main(String[] args) {
        Ser meuSerHumano = new Pessoa("Mariana", 22, "Schlickmann");
        Ser meuSerAnimal = new Cachorro("Matilda", 11, "Mariana");
        meuSerAnimal.setNome("Mariana");
        System.out.println(meuSerAnimal.saudacao());
        System.out.println(meuSerHumano.saudacao());
        System.out.println(nomeDoVideo);
    }

    private void atualizaSalario() {
        this.salario = 4000;
    }

    public int getSalario() {
        this.atualizaSalario();
        return this.salario;
    }
}