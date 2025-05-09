package persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManage {

    private String pathFile;

    public FileManage(String pathFile){
        this.pathFile = pathFile;
    }

    public File getFile(){
        return new File(this.pathFile);
    }

    public ArrayList<String> getDataFile(){
        ArrayList<String> lines = null;
        try {
            File file = this.getFile();
            if (file.exists()){
                lines = new ArrayList<>();
                BufferedReader bufferedReader = new BufferedReader(new FileReader(this.getFile()));
                String line = "";
                while ((line = bufferedReader.readLine()) != null){
                    lines.add(line);
                }
            }
        }catch (IOException e){
            e.printStackTrace(System.out);
        }
        return lines;
    }
}
