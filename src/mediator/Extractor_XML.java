package mediator;

public class Extractor_XML {

    private String filepath;
    private String datastructure;

    public Extractor_XML(String filepath, String datastructure) {
        this.filepath = filepath;
        this.datastructure = datastructure;
    }

    public int requete_1(){
        return 0;
    }

    public int requete_2(){
        return 0;
    }

    public int[] requete_3(){
        return null;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getDatastructure() {
        return datastructure;
    }

    public void setDatastructure(String datastructure) {
        this.datastructure = datastructure;
    }
}
