public class GameManager implements GameService{
    @Override
    public void newGame(Game game) {
        System.out.println(game.getGameName() + " oyunu eklendi");
    }

    @Override
    public void updateGame(Game game) {
        System.out.println(game.getGameName() + " oyunu güncellendi");
    }

    @Override
    public void deleteGame(Game game) {
        System.out.println(game.getGameName() + " oyunu silindi");

    }
}


