public class GamerManager implements GamerService{

    private GamerCheckService gamerCheckService;

    public GamerManager (GamerCheckService gamerCheckService){
        this.gamerCheckService = gamerCheckService;
    }
    @Override
    public void registerGamer(Gamer gamer) {
        if (gamerCheckService.checkIfRealPerson(gamer)) {
            System.out.println("Oyuncu Eklendi: " + gamer.getFirstName());
        } else {
            System.out.println("Lütfen bilgilerinizi doğru giriniz.");
        }

    }

    @Override
    public void deleteGamer(Gamer gamer) {
        System.out.println("Oyuncu Silindi: " + gamer.getFirstName() + gamer.getLastName());

    }

    @Override
    public void updateGamer(Gamer gamer) {
        System.out.println("Oyuncu Güncellendi: " + gamer.getFirstName() + gamer.getLastName());

    }
}
