package mediator;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;


public class Extractor_Excel{
    private String filepath;


    public Extractor_Excel(String filepath) {
        this.filepath = filepath;
    }


    public int[] requete_1(){
        return null;
    }

    public int requete_2(){
        return 0;
    }

    public int[] requete_3(){
        return null;
    }








    /*
    //Requète : Afficher pour chaque enseignant, son nombre total d’heures assurées
    public String[] requete_ensignant_total_heure(){
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
        if (result == "")
            result = "0";
        return result;
    }

    //Requète : Nombre d'étudiants dont la provenance est 'France'
    public String requete_nb_etudiant_France(){
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
            return null;
        }
        if (result == "")
            result = "0";
        return result;
    }

    //Requète :Afficher le nombre de cours par Type (CM, TD ou TP)
    public String requete_nb_cours_type(){
        String result = "";
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
                result = result + " " + record.getField("Details");
            }
            record.close();
            queryTD = "Select Type_Cours, Count(Distinct ID_Cours) From 2006, 2007 Where Type_Cours='TD'";
            record = connect.executeQuery(queryTD);
            while(record.next()) {
                result = result + " " + record.getField("Details");
            }
            record.close();
            queryTP = "Select Type_Cours, Count(Distinct ID_Cours) From 2006, 2007 Where Type_Cours='TP'";
            record = connect.executeQuery(queryTP);
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

    */
}
