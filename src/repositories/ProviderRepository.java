package repositories;

import entities.Provider;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class ProviderRepository extends BaseRepository{

    public ProviderRepository(String pathFile, String delimiter) {
        super("src/files/providers.txt", "|");
    }

    public ArrayList<Provider> getDataList(){
        ArrayList<Provider> providers = null;
        ArrayList<String> lines = this.fileManage.getDataFile();
        if(lines != null){
            providers = new ArrayList<>();
            for(String line : lines){
                StringTokenizer tokens = new StringTokenizer(line, this.delimiter);
                int id = Integer.parseInt(tokens.nextToken());
                String name = tokens.nextToken();
                String webSite = tokens.nextToken();
                String country = tokens.nextToken();
                providers.add(new Provider(id, name, webSite));
            }
        }

        return providers;
    }
}
