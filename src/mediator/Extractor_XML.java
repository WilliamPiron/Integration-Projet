package mediator;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Extractor_XML {

    private String filepath;
    private DocumentBuilderFactory builderFactory;
    private org.w3c.dom.Document doc;

    public Extractor_XML(String filepath) {
        this.filepath = filepath;
    }

    public void connect_to_file (String filepath) throws FileNotFoundException, SAXException, IOException, ParserConfigurationException {
        builderFactory = DocumentBuilderFactory.newInstance();
        doc = builderFactory.newDocumentBuilder().parse(new FileInputStream(filepath));

    }


    //Requète : Afficher pour chaque enseignant, son nombre total d’heures assurées
    public int[] requete_1(){
        return null;
    }

    //Requète : Nombre d'étudiants dont la provenance est 'France'
    public int requete_2(){
        int res = 0;
        Element el;
        NodeList etudiants = doc.getElementsByTagName("Etudiant");

        for(int index = 0; index < etudiants.getLength(); index++){
            el = (Element) etudiants.item(index);
            if (el.getAttribute("Provenance").equals("France"))
                res+=1;
        }
        return res;
    }

    //Requète :Afficher le nombre de cours par Type (CM, TD ou TP)
    public Map<String, Integer> requete_3(){
        int nbCM = 0;
        int nbTD = 0;
        int nbTP = 0;

        Map<String, Integer> res = new HashMap<>();
        res.put("CM", 0);
        res.put("TD", 0);
        res.put("TP", 0);

        Element el;
        NodeList cours = doc.getElementsByTagName("Cours");

        for(int index = 0; index < cours.getLength(); index++){
            el = (Element) cours.item(index);
            switch (el.getAttribute("Type")){
                case "Cours Magistral": nbCM++;
                    res.put("CM", nbCM);
                    break;
                case "Travaux diriges": nbTD++;
                    res.put("CM", nbTD);
                    break;
                default: nbTP++;
                    res.put("TP", nbTP);
                    break;
            }
        }
        return res;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

}
