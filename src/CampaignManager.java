public class CampaignManager implements CampaignService{
    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " kampanyası başarıyla eklendi");
    }

    @Override
    public void updateCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " kampanyası güncellendi");
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName() + " kampanyası silindi");
    }
}
