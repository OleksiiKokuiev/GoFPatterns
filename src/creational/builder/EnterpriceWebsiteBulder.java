package creational.builder;

public class EnterpriceWebsiteBulder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Enterprise site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(5000);
    }
}
