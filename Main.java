package ChainOfResponsiblity;

public class Main {

    public static void main(String[] args) {
        ApprovalChain approvalChain = new ApprovalChain();

        AdvanceRequest req1 = new AdvanceRequest(1500);
        AdvanceRequest req2 = new AdvanceRequest(4000);
        AdvanceRequest req3 = new AdvanceRequest(10000);

        approvalChain.processRequest(req1);
        approvalChain.processRequest(req2);
        approvalChain.processRequest(req3);
    }
}
