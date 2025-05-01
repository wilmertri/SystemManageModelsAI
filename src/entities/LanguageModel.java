package entities;

import interfaces.Trainable;

import java.util.ArrayList;
import java.util.List;

public class LanguageModel extends EvaluableAIModel implements Trainable {
    private int id;
    private long totalParameters;
    private Provider provider;
    private List<Dataset> datasets;
    private List<Parameter> configurationParameters;

    // Training Attributes
    private int trainingEpochs;
    private double trainingProgress;

    public LanguageModel(int id, String name, String type, float version,
                        long totalParameters, String evaluationMethodology,
                        double approvalThreshold, Provider provider){
        super(name, type, version, approvalThreshold, evaluationMethodology);
        this.id = id;
        this.totalParameters = totalParameters;
        this.provider = provider;
        this.datasets = new ArrayList<>();
        this.configurationParameters = new ArrayList<>();
        this.trainingEpochs = 0;
        this.trainingProgress = 0.0;
    }

    public LanguageModel(){
        super("", "", 1.0f, 7.0, "Basic");
        this.id = 0;
        this.totalParameters = 0;
        this.datasets = new ArrayList<>();
        this.configurationParameters = new ArrayList<>();
        this.trainingEpochs = 0;
        this.trainingProgress = 0.0;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public long getTotalParameters(){
        return totalParameters;
    }

    public void setTotalParameters(long totalParameters){
        this.totalParameters = totalParameters;
    }


    @Override
    public void generateEvaluationReport(String filePath) {
        // This would write to a file
        System.out.println("Generating evaluation report at: " + filePath);
        System.out.println("=== EVALUATION REPORT ===");
        System.out.println("Model: " + name);
        System.out.println("Type: " + type);
        System.out.println("Version: " + version);
        System.out.println("Methodology: " + evaluationMethodology);
        System.out.println("Score: " + currentScore + "/10.0");
        System.out.println("Required threshold: " + approvalThreshold);
        System.out.println("Status: " + (meetStandards() ? "APPROVED" : "FAILED"));
        System.out.println("=========================");
    }


    @Override
    public double evaluate() {
        // Simulation of evaluation based on parameters and datasets
        if(datasets.isEmpty()){
            return 0.0;
        }

        // Simple formula for simulation: base + data factor + config factor
        double base = 5.0;
        double dataFactor = datasets.size() * 0.5;
        double configFactor = configurationParameters.size() * 0.3;

        return Math.min(10.0, base + dataFactor + configFactor);

    }


    @Override
    public int getTrainingEpochs() {
        return trainingEpochs;
    }

    @Override
    public void setTrainingEpochs(int trainingEpochs) {
        this.trainingEpochs = trainingEpochs;
    }

    @Override
    public void train(List<Dataset> datasets) {
        if(datasets == null || datasets.isEmpty()){
            System.out.println("Error: No datasets available for training");
            return;
        }

        System.out.println("Starting training of " + name + "...");

        // Adding datasets that the model doesn't already have
        for (Dataset dataset : datasets){
            if (!this.datasets.contains(dataset)){
                this.datasets.add(dataset);
                System.out.println("Added dataset: " +dataset.getName());
            }
        }

        // Training simulation
        for (int i = 0; i < trainingEpochs; i++) {
            trainingProgress = (double) i / trainingEpochs;
            System.out.println("Epoch " + i + "/" + trainingEpochs + " - Progress: "
                    + Math.round(trainingProgress * 100) + "%");

            //In a real implementation, the training code would go here

            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("Training completed!");
            //After training, we evaluate the model
            double score = evaluate();
            System.out.println("Post-training evaluation: " + score + "/10.0");
        }

    }

    @Override
    public double getCompletionPercentage() {
        return trainingProgress * 100;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public List<Dataset> getDatasets() {
        return new ArrayList<>(datasets);
    }

    public void setDatasets(List<Dataset> datasets) {
        this.datasets = datasets;
    }

    public void addDataset(Dataset dataset){
        this.datasets.add(dataset);
    }

    public void removeDataset(Dataset dataset){
        this.datasets.remove(dataset);
    }

    // Methods for Composition (Parameter)
    public List<Parameter> getConfigurationParameters(){
        return new ArrayList<>(configurationParameters);
    }

    public void addParameter(String name, String type, double value){
        this.configurationParameters.add(new Parameter(name, type, value));
    }

    public void removeParameter(String name){
        this.configurationParameters.removeIf(p -> p.getName().equals(name));
    }

    // Specific Method to estimate inference time
    public double estimateInferenceTime(int inputLength){
        return (totalParameters * inputLength) / 1e12;
    }
}
