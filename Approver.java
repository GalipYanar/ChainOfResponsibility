package ChainOfResponsiblity;

public interface Approver {
    void processRequest(AdvanceRequest request);
    void setNextApprover(Approver nextApprover);
}
