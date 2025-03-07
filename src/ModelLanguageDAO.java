import java.util.ArrayList;
import java.util.List;

public class ModelLanguageDAO {

    private List<ModelLanguageAI> models;

    public ModelLanguageDAO(){
        this.models = new ArrayList<>();
    }

    //CREATE - Create a new Model Language AI
    public boolean create(ModelLanguageAI model){
        return this.models.add(model);
    }

    //READ - Read one Model Find by ID
    public ModelLanguageAI findById(int id){
        for(ModelLanguageAI model : this.models){
            if(model.getId() == id){
                return model;
            }
        }
        return null;
    }

    //READ - Read all Models
    public List<ModelLanguageAI> findAll(){
        return new ArrayList<>(this.models);
    }

    //UPDATE - Update a existing model
    public boolean update(ModelLanguageAI model){
        for (int i = 0; i < this.models.size(); i++) {
            if (this.models.get(i).getId() == model.getId()){
                this.models.set(i, model);
                return true;
            }
        }
        return false;
    }

    //DELETE - Delete a existing model
    public boolean delete(ModelLanguageAI model){
        for (int i = 0; i < this.models.size(); i++) {
            if(this.models.get(i).getId() == model.getId()){
                this.models.remove(i);
                return true;
            }
        }

        return false;
    }
}
