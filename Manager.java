package ChainOfResponsiblity;

public class Manager implements Approver {
    private Approver nextApprover;

    @Override
    public void processRequest(AdvanceRequest request) {
        if (request.getAomunt() <= 2000) {
            System.out.println("İşleminiz Veznedar tarafından onayladı.");
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        }
    }

    @Override
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }
}





