package semana3;

public class Game {
    public static void main(String[] args) {
        Screen s = new Screen();
        Ashe ashe =  new Ashe(
                id:01,
                name: "Ashe",
                role: "Marksman",
                difficulty: "Moderate",
                description: "Ashe, comandante hija del hielo de la tribu de Avarosa, lidera las hordas más numerosas del norte. Impasible, inteligente e idealista, aunque incómoda en su papel de líder."
        );
        ashe.frostShot(screen);
        ashe.crystalArrow(screen);
    }
}
