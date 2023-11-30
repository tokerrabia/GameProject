public class Main {
    public static void main(String[] args) {

        Game game1 = new Game("Sims4", 850);

        Gamer gamer1 = new Gamer(647785695, "Rabia", "Toker", 1998);

        Campaign campaign = new Campaign(1, "Efsane Cuma", 10);

        GamerService gamerService = new GamerManager(new GamerCheckManager());
        GameManager gameManager = new GameManager();
        gameManager.newGame(game1);
        gamerService.registerGamer(gamer1);
        SalesManager salesManager = new SalesManager();
        salesManager.sell(game1,gamer1,campaign);


    }
}