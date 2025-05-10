import entities.Country;
import entities.Dataset;
import entities.LanguageModel;
import entities.Provider;
import repositories.ProviderRepository;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProviderRepository providerRepository = new ProviderRepository();

        List<Provider> providers = providerRepository.getDataList();
        for (Provider provider : providers){
            System.out.println(provider);
        }

        Country country = new Country(1, "United States");
        Provider provider1 = new Provider(
                6,
                "miProveedor",
                "www.proveedor.com",
                country
        );
        providerRepository.insertDataLine(provider1);

        /*
        //Create country
        Country unitedStates = new Country("United States");
        //Create providers and datasets

        //Provider
        Provider openAI = new Provider(1, "OpenAI", "www.openai.com", unitedStates);

        //Datasets
        Dataset webText = new Dataset("WebText", 570, "JSON", "Proprietary");
        Dataset commonCrawl = new Dataset("CommonCrawl", 1200, "JSON/TXT", "CC-BY-4.0");
        Dataset imagenetDataset = new Dataset("ImageNet", 150, "JPG", "Academic");

        List<Dataset> trainingDatasets = new ArrayList<>();
        trainingDatasets.add(webText);
        trainingDatasets.add(commonCrawl);

        LanguageModel gpt4 = new LanguageModel(
                1, "GPT-4", "Generative", 4.0f,
                1750000, "MMLU+HumanEval", 8.5, openAI
        );

        //Configure the model
        gpt4.addParameter("temperature", "float", 0.7);
        gpt4.addParameter("top_p", "float", 0.95);
        gpt4.setTrainingEpochs(3);

        //Demonstrate use of Trainable Interface
        System.out.println("=== TRAINABLE INTERFACE DEMONSTRATION ===");
        System.out.println("Configuring " + gpt4.getTrainingEpochs() + " training epochs");
        gpt4.train(trainingDatasets);

        //Using DAO - (DATA ACCESS OBJECT) Pattern to save Languages Models
        System.out.println("=== SERVICE DATA ACCESS OBJECT (DAO) TO SAVE DATA ===");
        LanguageModelDAO dao = new LanguageModelDAO();

        if(dao.create(gpt4)){
            System.out.println("Language " + gpt4.getName() + " created successful");
        }else{
            System.out.println("Language model already exists!");
        }

        if(dao.create(gpt4)){
            System.out.println("Language " + gpt4.getName() + " created successful");
        }else{
            System.out.println("Language model already exists!");
        }

        LanguageModel gpt5 = new LanguageModel(
                1,
                "GPT-5",
                "Generative",
                5f,
                1750000,
                "WebText+Books+Code",
                9.5,
                openAI
        );

        System.out.println("List of All Languages Models");
        for (LanguageModel model : dao.readAll()){
            System.out.println("ID: " + model.getId()
                    + " - Name Model: " + model.getName());
        }

        System.out.println("=====================================");
        System.out.println("Model Updated");
        System.out.println("=====================================");

        dao.update(gpt5);

        System.out.println("List of All Languages Models");
        for (LanguageModel model : dao.readAll()){
            System.out.println("ID: " + model.getId()
                    + " - Name Model: " + model.getName());
        }
        */


    }

}