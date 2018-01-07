package mediator;

import java.util.HashMap;
import java.util.Map;

public class Mediator {

    private String excelpath;
    private String xmlpath;

    public Mediator(String excelpath, String xmlpath) {
        this.excelpath = excelpath;
        this.xmlpath = xmlpath;
    }

    public void executeMediator(){
        /* Excel */
        Extractor_Excel e_excel = new Extractor_Excel(excelpath);
        Boolean connexion_excel = null;
        String[] r_excel_r1 = null;
        int r_excel_r2 = 0;
        String[] r_excel_r3 = null;

        /* SQL */
        Extractor_SQL e_sql = new Extractor_SQL();
        Boolean connexion_sql = null;
        int[] r_sql_r1 = null;
        int r_sql_r2 = 0;
        int [] r_sql_r3 = null;

        /* XML */
        Extractor_XML e_xml = new Extractor_XML(xmlpath);
        Boolean connexion_xml = null;
        int[] r_xml_r1 = null;
        int r_xml_r2 = 0;
        Map<String, Integer> r_xml_r3 = new HashMap<>();
        /* RES */
        int [] r_requete1 = null;
        int r_requete2 = 0;
        int[] r_requete3 = {0,0,0};

        /* EXCEL */

        /* faire la connexion au fichier EXCEL
        Si la connexion à réussi récupérer le resultats des requetes
         */
        r_excel_r1 = e_excel.requete_1();
        r_excel_r2 = e_excel.requete_2();
        r_excel_r3 = e_excel.requete_3();
        /* Déconecter du fichier*/

        /* SQL */

        connexion_sql=e_sql.connexion_BDD();
        if(connexion_sql){
            System.out.println("La connexion à la base de données : REUSSI ! ");
            r_sql_r1 = e_sql.requete_1();
            r_sql_r2 = e_sql.requete_2();
            r_sql_r3 = e_sql.requete_3();
            connexion_sql = e_sql.deconnexion_BDD();
            if(!connexion_sql)
                System.out.println("Déconnexion de la base données : REUSSI !");
        }


        /* XML */

        /* faire la connexion au fichier XML
        Si la connexion à réussi récupérer le resultats des requetes
         */
        r_xml_r1 = e_xml.requete_1();
        r_xml_r2 = e_xml.requete_2();
        r_xml_r3 = e_xml.requete_3();
        /* Déconecter du fichier*/


        /* MEDIATEUR */
        /* Calcul des résultats */
        System.out.println("Calcul du résultats des requêtes en cours.");

        /* Requete 1 */
        /* A
        COMPLETER
        ICI
        * */

        /* Requete 2 */
        r_requete2 = r_excel_r2 + r_sql_r2 + r_xml_r2;
        System.out.println("Le nombre d'étudiants provenants de France : "+r_requete2);

        /* Requete 3 */
        if( r_excel_r3 != null){
            r_requete3[0] += Integer.parseInt(r_excel_r3[1]);
            r_requete3[1] += Integer.parseInt(r_excel_r3[3]);
            r_requete3[2] += Integer.parseInt(r_excel_r3[5]);
        }
        if (r_sql_r3 != null){
            r_requete3[0] += r_sql_r3[0];
            r_requete3[1] += r_sql_r3[1];
            r_requete3[2] += r_sql_r3[2];
        }
        if( r_xml_r3 != null){
            r_requete3[0] += r_xml_r3.get("CM");
            r_requete3[1] += r_xml_r3.get("TD");
            r_requete3[2] += r_xml_r3.get("TP");
        }
        System.out.println("Le nombre de cours de type CM : "+r_requete3[0]);
        System.out.println("Le nombre de cours de type TD : "+r_requete3[1]);
        System.out.println("Le nombre de cours de type TP : "+r_requete3[2]);


        System.out.println("Fin du calcul des résultats.");

    }

    public String getExcelpath() {
        return excelpath;
    }

    public void setExcelpath(String excelpath) {
        this.excelpath = excelpath;
    }

    public String getXmlpath() {
        return xmlpath;
    }

    public void setXmlpath(String xmlpath) {
        this.xmlpath = xmlpath;
    }
}
