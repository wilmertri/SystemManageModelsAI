public class Main {
    public static void main(String[] args) {
        LanguageModelDAO dao = new LanguageModelDAO();
        LanguageModel languageModel1 = new LanguageModel(
                1,
                "GPT-4",
                "Generative",
                4,
                1750000,
                "WebText+Books+Code",
                9.8
        );

        LanguageModel languageModel2 = new LanguageModel(
                2,
                "BERT",
                "Bidirectional",
                2,
                340000,
                "Wikipedia+BooksCorpus",
                8.5
        );
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

    }

}