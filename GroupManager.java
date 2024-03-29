package ChainOfResponsiblity;

public class GroupManager implements Approver {
    private Approver nextApprover;

    @Override
    public void processRequest(AdvanceRequest request) {
        if (request.getAomunt() <= 5000){
            System.out.println("İşleminiz Yönetici tarafından onaylandı.");
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        }
    }

    @Override
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }
}
