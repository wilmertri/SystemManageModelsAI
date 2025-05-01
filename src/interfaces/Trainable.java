package interfaces;

import entities.Dataset;

import java.util.List;

public interface Trainable {
    void train(List<Dataset> datasets);
    int getTrainingEpochs();
    void setTrainingEpochs(int epochs);
    double getCompletionPercentage();
}
