package ChainOfResponsiblity;

public class ApprovalChain {
    private Approver chain;
    public ApprovalChain() {
        buildChain();
    }

    private void buildChain(){
        chain = new Manager();
        Approver groupManager = new GroupManager();
        Approver director = new Director();

        chain.setNextApprover(groupManager);
        groupManager.setNextApprover(director);
    }

    public void processRequest(AdvanceRequest request){
        chain.processRequest(request);
    }
}
