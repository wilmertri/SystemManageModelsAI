package repositories;

import entities.Country;
import entities.Provider;
import interfaces.IRepository;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class ProviderRepository extends BaseRepository implements IRepository<Provider> {

    private CountryRepository countryRepository;
    public ProviderRepository() {
        super("src/files/providers.txt", "|");
        this.countryRepository = new CountryRepository();
    }

    public ArrayList<Provider> getDataList(){
        ArrayList<Provider> providers = null;
        ArrayList<String> lines = this.fileManage.getDataFile();
        ArrayList<Country> countries = this.countryRepository.getDataList();
        if(lines != null){
            providers = new ArrayList<>();
            for(String line : lines){
                StringTokenizer tokens = new StringTokenizer(line, this.delimiter);
                int id = Integer.parseInt(tokens.nextToken());
                String name = tokens.nextToken();
                String webSite = tokens.nextToken();
                String country = tokens.nextToken();
                Country countrySelected = countries.stream()
                        .filter(c -> c.getName().equals(country))
                                .findFirst()
                                        .orElse(null);
                /*
                Country countrySelected = null;
                for (Country c : countries){
                    if (c.getName().equals(country)){
                        countrySelected = c;
                    }
                }
                */
                providers.add(new Provider(id, name, webSite, countrySelected));
            }
        }

        return providers;
    }

    public void insertDataLine(Provider provider){
        //1|OpenAI|www.openai.com|United States
        String line = provider.getId() + "|"
                + provider.getName() + "|"
                + provider.getWebsite() + "|"
                + provider.getCountry().getName();
        boolean insert = this.fileManage.writeFile(line);
        if (insert){
            System.out.println("Se agregó el Provider con exito");
        }else {
            System.out.println("Ha ocurrido un error!");
        }
    }


}
