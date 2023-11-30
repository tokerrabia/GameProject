public class SalesManager implements SalesService{
    @Override
    public void sell(Game game, Gamer gamer, Campaign campaign) {
        System.out.println(game.getGameName() + " oyunu " + gamer.getFirstName() + " " +  gamer.getLastName() +
                " adlı üyeye " + campaign.getCampaignName() + " kampanyası ile satıldı");
    }
}
