<<<<<<< HEAD
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Create DAO
        ModelLanguageDAO modelLanguageDAO = new ModelLanguageDAO();

        //Create many languages models
        ModelLanguageAI model1 = new ModelLanguageAI(
                1,
                "GPT-4",
                "Generative",
                "4.0",
=======
public class Main {
    public static void main(String[] args) {
        LanguageModelDAO dao = new LanguageModelDAO();
        LanguageModel languageModel1 = new LanguageModel(
                1,
                "GPT-4",
                "Generative",
                4,
>>>>>>> 80a42ab207049d71e2a90d1aee3a2d4044eb5ab3
                1750000,
                "WebText+Books+Code",
                9.8
        );

<<<<<<< HEAD
        ModelLanguageAI model2 = new ModelLanguageAI(
                2,
                "BERT",
                "Bidirectional",
                "Large",
=======
        LanguageModel languageModel2 = new LanguageModel(
                2,
                "BERT",
                "Bidirectional",
                2,
>>>>>>> 80a42ab207049d71e2a90d1aee3a2d4044eb5ab3
                340000,
                "Wikipedia+BooksCorpus",
                8.5
        );
<<<<<<< HEAD

        ModelLanguageAI model3 = new ModelLanguageAI(
                3,
                "LLaMA",
                "Generative",
                "2.0",
                70000,
                "CommonCrawl+C4",
                9.2
        );

        modelLanguageDAO.create(model1);
        modelLanguageDAO.create(model2);
        modelLanguageDAO.create(model3);

        //READ - Show all models
        System.out.println("List of all models created");
        for (ModelLanguageAI model : modelLanguageDAO.findAll()){
            System.out.println(model);
        }

        //READ - Show one model find by ID = 2
        System.out.println("Find model by ID 2");
        ModelLanguageAI model = modelLanguageDAO.findById(2);
        if(model != null){
            System.out.println(model);
        }else{
            System.out.println("Model not found");
        }

        //UPDATE - Update a model with ID = 3
        System.out.println("Updating model with ID 3");
        ModelLanguageAI modelUpdated = new ModelLanguageAI(
                3,
                "LLaMA",
                "Generative",
                "3.0",
                120000,
                "CommonCrawl+C4",
                9.8
        );

        if(modelLanguageDAO.update(modelUpdated)){
            System.out.println("Model successfully updated!");
            ModelLanguageAI modelUpdatedSuccess = modelLanguageDAO.findById(3);
            System.out.println(modelUpdatedSuccess);
        }else{
            System.out.println("Model not found!");
        }
=======
        if(dao.create(languageModel1)){
            System.out.println("Language " + languageModel1.getName() + " created successful");
        }else{
            System.out.println("Language model already exists!");
        }

        if(dao.create(languageModel2)){
            System.out.println("Language " + languageModel2.getName() + " created successful");
        }else{
            System.out.println("Language model already exists!");
        }

        LanguageModel languageUpdatedModel1 = new LanguageModel(
                1,
                "GPT-5",
                "Generative",
                5,
                1750000,
                "WebText+Books+Code",
                9.5
        );

        System.out.println("List of All Languages Models");
        for (LanguageModel model : dao.readAll()){
            System.out.println("ID: " + model.getId()
                    + " - Name Model: " + model.getName());
        }

        System.out.println("=====================================");
        System.out.println("Model Updated");
        System.out.println("=====================================");

        dao.update(languageUpdatedModel1);

        System.out.println("List of All Languages Models");
        for (LanguageModel model : dao.readAll()){
            System.out.println("ID: " + model.getId()
                    + " - Name Model: " + model.getName());
        }

>>>>>>> 80a42ab207049d71e2a90d1aee3a2d4044eb5ab3
    }
}