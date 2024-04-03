package academy.devdojo.javaoneforall.introduction.exercises.PersonagemArmado;

public class PersonagemArmadoTest {
    public static void main(String[] args) {
        Arma ak47 = new Arma("Ak-47", 12, 20);
        Arma doze = new Arma("Escopeta doze", 30, 8);
        Personagem rambo = new Personagem("Rambo", 1, 30, 5, 20, 12);
        rambo.equiparArma(ak47);
        rambo.equiparArma(doze);
        rambo.printAll();
    }
}
