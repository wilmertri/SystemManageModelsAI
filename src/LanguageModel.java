public class LanguageModel extends ModelAI{
    private int id;
    private long parameters;
    private String setData;
    private double scoreEvaluation;

    public LanguageModel(
                        int id,
                        String name,
                        String type,
                        float version,
                        long parameters,
                        String setData,
                        double scoreEvaluation){
        super(name, type, version);
        this.id = id;
        this.parameters = parameters;
        this.setData = setData;
        this.scoreEvaluation = scoreEvaluation;
    }

    public LanguageModel(){
        super();
        this.id = 0;
        this.parameters = 0;
        this.setData = "";
        this.scoreEvaluation = 0;
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

    public String getSetData() {
        return setData;
    }

    public void setSetData(String setData) {
        this.setData = setData;
    }

    public double getScoreEvaluation() {
        return scoreEvaluation;
    }

    public void setScoreEvaluation(double scoreEvaluation) {
        this.scoreEvaluation = scoreEvaluation;
    }
}
