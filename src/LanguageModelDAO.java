import java.util.ArrayList;
import java.util.List;

public class LanguageModelDAO {

    private List<LanguageModel> listModels;

    public LanguageModelDAO(){
        this.listModels = new ArrayList<>();
    }

    //CREATE - Create a new Model Language
    public boolean create(LanguageModel languageModel){
        for (LanguageModel model : this.listModels){
            if (model.getId() == languageModel.getId()){
                return false; // Ya existe un model con este ID
            }
        }
        return this.listModels.add(languageModel);
    }

    //READ - Read all models language
    public List<LanguageModel> readAll(){
        return new ArrayList<>(this.listModels);
    }

    //UPDATE - Update a model language
    public boolean update(LanguageModel languageModel){
        for (int i = 0; i < this.listModels.size(); i++) {
            if(this.listModels.get(i).getId() == languageModel.getId()){
                listModels.set(i, languageModel);
                return true;
            }
        }
        return false;
    }

    //DELETE - Delete a model language
    public boolean delete(int id){
        for (int i = 0; i < this.listModels.size(); i++) {
            if (this.listModels.get(i).getId() == id){
                this.listModels.remove(i);
                return true;
            }
        }
        return false;
    }

}
