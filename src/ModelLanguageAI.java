public class ModelLanguageAI extends ModelAI {
    private int id;
    private long parameters;
    private String dataset;
    private double evaluationScore;

    public ModelLanguageAI(int id, String name, String type, String version,
                           long parameters, String dataset,
                           double evaluationScore) {
        super(name, type, version);
        this.id = id;
        this.parameters = parameters;
        this.dataset = dataset;
        this.evaluationScore = evaluationScore;
    }

    public ModelLanguageAI(){
        super();
        this.id = 0;
        this.parameters = 0;
        this.dataset = "";
        this.evaluationScore = 0.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getParameters() {
        return parameters;
    }

    public void setParameters(long parameters) {
        this.parameters = parameters;
    }

    public String getDataset() {
        return dataset;
    }

    public void setDataset(String dataset) {
        this.dataset = dataset;
    }

    public double getEvaluationScore() {
        return evaluationScore;
    }

    public void setEvaluationScore(double evaluationScore) {
        this.evaluationScore = evaluationScore;
    }

    public double estimateTimeOfInference(int inputLength){
        return (this.parameters * inputLength) / 1e12;
    }

    @Override
    public String toString(){
        return "ID: " + this.id + ", " + super.toString() +
                ", Parameters: " + this.parameters + " millions" +
                ", Dataset: " + this.dataset +
                ", Evaluation Score: " + this.evaluationScore;
    }
}
