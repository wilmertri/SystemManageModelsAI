package entities;

import interfaces.Evaluable;

public abstract class EvaluableAIModel extends ModelAI implements Evaluable {

    protected double currentScore;
    protected double approvalThreshold;
    protected String evaluationMethodology;

    public EvaluableAIModel(String name, String type, float version, double approvalThreshold,
                            String evaluationMethodology) {
        super(name, type, version);
        this.approvalThreshold = approvalThreshold;
        this.evaluationMethodology = evaluationMethodology;
        this.currentScore = 0.0;
    }

    @Override
    public String getEvaluationMethodology() {
        return this.evaluationMethodology;
    }

    @Override
    public void setApprovalThreshold(double threshold) {
        this.approvalThreshold = threshold;
    }

    @Override
    public boolean meetStandards() {
        return this.currentScore >= this.approvalThreshold;
    }

    public abstract void generateEvaluationReport(String filePath);

    public String getEvaluationSummary (){
        return String.format("Model: %s, Score: %.2f/10.0, Methodology: %s, Meets standards: %s",
                name, currentScore, evaluationMethodology, this.meetStandards() ? "Yes" : "No");
    }
}
