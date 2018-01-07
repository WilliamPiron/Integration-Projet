package mediator;

import java.util.HashMap;
import java.util.Map;

public class Mediator {
    static void main(String[] args) {

        /* Excel */
        String filepath_excel = "src\\datasources\\donneesExcel.xls";
        Extractor_Excel e_excel = new Extractor_Excel(filepath_excel);
        Boolean connexion_excel = null;
        int[] r_excel_r1 = null;
        int r_excel_r2 = 0;
        int [] r_excel_r3 = null;

        /* SQL */
        Extractor_SQL e_sql = new Extractor_SQL();
        Boolean connexion_sql = null;
        int[] r_sql_r1 = null;
        int r_sql_r2 = 0;
        int [] r_sql_r3 = null;

        /* XML */
        String filepath_XML = "src\\datasources\\donneesXML.xml";
        Extractor_XML e_xml = new Extractor_XML(filepath_XML);
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
            r_requete3[0] += r_excel_r3[0];
            r_requete3[1] += r_excel_r3[1];
            r_requete3[2] += r_excel_r3[2];
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

}
