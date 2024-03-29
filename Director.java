package ChainOfResponsiblity;

public class Director implements Approver{

    @Override
    public void processRequest(AdvanceRequest request) {
        System.out.println("İşleminiz Müdür tarafından onaylandı.");
    }

    @Override
    public void setNextApprover(Approver nextApprover) {
    //müdürün yetki full, o yüzden birşey tanımlamıyoruz
    }
}
