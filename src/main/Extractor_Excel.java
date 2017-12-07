package main;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Extractor_Excel {
    private String filepath;

    public Extractor_Excel(String filepath) {
        this.filepath = filepath;
    }

    //Requète : Afficher pour chaque enseignant, son nombre total d’heures assurées
    public String request_1(){
        String result = "";
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
    public String request_2(){
        String result = "";
        String query = "";
        Fillo fillo = new Fillo();
        Connection connect;
        Recordset record;

        try {
            connect = fillo.getConnection(filepath);
            query = "Select Count(*) From 20006, 20007 Where Provenance='France'";
            record = connect.executeQuery(query);
            while(record.next()) {
                result = result + " " + record.getField("Details");
            }
            record.close();
            connect.close();
        } catch (FilloException e) {
            e.printStackTrace();
            return null;
        }

        return result;
    }

    //Requète :Afficher le nombre de cours par Type (CM, TD ou TP)
    public String request_3(){
        String result = "";
        String query = "";
        Fillo fillo = new Fillo();
        Connection connect;
        Recordset record;

        try {
            connect = fillo.getConnection(filepath);
            query = "";
            record = connect.executeQuery(query);
            while(record.next()) {
                result = result + " " + record.getField("Details");
            }
            record.close();
            connect.close();
        } catch (FilloException e) {
            e.printStackTrace();
            return null;
        }

        return result;
    }
}
