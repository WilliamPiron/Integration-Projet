package mediator;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;


public class Extractor_Excel{
    private String filepath;


    public Extractor_Excel(String filepath) {
        this.filepath = filepath;
    }

    //Requète : Afficher pour chaque enseignant, son nombre total d’heures assurées
    public String[] requete_1(){
        String[] result = null;
        // Dans le fichier Excel, le nombre d'heures n'existe pas, la query est vide
        String query = "";

        Fillo fillo = new Fillo();
        Connection connect;
        Recordset record;

        try {
            connect = fillo.getConnection(filepath);
        } catch (FilloException e) {
            e.printStackTrace();
            return null;
        }

        try {
            connect.close();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return result;
    }

    //Requète : Nombre d'étudiants dont la provenance est 'France'
    public int requete_2(){
        String result = "";
        String query = "";

        Fillo fillo = new Fillo();
        Connection connect;
        Recordset record;

        try {
            connect = fillo.getConnection(filepath);
            query = "Select Count(*) From 2006, 2007 Where Provenance='France'";
            record = connect.executeQuery(query);
            while(record.next()) {
                result = record.getField("Details");
            }
            record.close();
            connect.close();
        } catch (FilloException e) {
            e.printStackTrace();
            return 0;
        }
        if (result.equals(""))
            result = "0";
        return Integer.parseInt(result);
    }

    //Requète :Afficher le nombre de cours par Type (CM, TD ou TP)
    public String[] requete_3(){
        String[] result = null;
        int index = 0;

        String queryCM = "";
        String queryTD = "";
        String queryTP = "";

        Fillo fillo = new Fillo();
        Connection connect;
        Recordset record;

        try {
            connect = fillo.getConnection(filepath);
            queryCM = "Select Type_Cours, Count(Distinct ID_Cours) From 2006, 2007 Where Type_Cours='CM'";
            record = connect.executeQuery(queryCM);
            while(record.next()) {
                index++;
                result[index] = record.getField("Details");
            }
            record.close();
            queryTD = "Select Type_Cours, Count(Distinct ID_Cours) From 2006, 2007 Where Type_Cours='TD'";
            record = connect.executeQuery(queryTD);
            while(record.next()) {
                index++;
                result[index] = record.getField("Details");
            }
            record.close();
            queryTP = "Select Type_Cours, Count(Distinct ID_Cours) From 2006, 2007 Where Type_Cours='TP'";
            record = connect.executeQuery(queryTP);
            while(record.next()) {
                index++;
                result[index] = record.getField("Details");
            }
            record.close();
            connect.close();
        } catch (FilloException fe) {
            fe.printStackTrace();
            return null;
        }catch (NullPointerException npe){
            npe.printStackTrace();
            return null;
        }

        return result;
    }


}
