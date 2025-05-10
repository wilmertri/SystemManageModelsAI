package repositories;

import entities.Country;
import interfaces.IRepository;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class CountryRepository extends BaseRepository implements IRepository<Country> {
    public CountryRepository() {
        super("src/files/countries.txt", "|");
    }

    public ArrayList<Country> getDataList(){
        ArrayList<Country> countries = null;
        ArrayList<String> lines = this.fileManage.getDataFile();
        if(lines != null){
            countries = new ArrayList<>();
            for(String line : lines){
                StringTokenizer tokens = new StringTokenizer(line, this.delimiter);
                int id = Integer.parseInt(tokens.nextToken());
                String name = tokens.nextToken();
                countries.add(new Country(id, name));
            }
        }

        return countries;
    }
}
