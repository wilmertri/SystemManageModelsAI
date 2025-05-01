package interfaces;

public interface Evaluable {
    double evaluate();
    String getEvaluationMethodology();
    void setApprovalThreshold(double threshold);
    boolean meetStandards();
}
