package repositories;

import persistence.FileManage;

public abstract class BaseRepository {
    protected FileManage fileManage;
    protected String delimiter;

    public BaseRepository(String pathFile, String delimiter){
        this.fileManage = new FileManage(pathFile);
        this.delimiter = delimiter;
    }
}
