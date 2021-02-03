public class Main {

    public static void main(String[] args) {
        Player one = new Player("Krzyś");
        Player two = new Player("Paweł");
        System.out.println(Game.newGameWinner(one, two).getName());
    }
}
