package main;

public class Mediateur {
    static void main(String[] args){
        /* SQL */
        Extractor_SQL e_sql = new Extractor_SQL();
        Boolean connexion_sql = null;
        int res_sql[][] = new int[3][3];

        connexion_sql=e_sql.connexion_BDD();
        if(connexion_sql){
            System.out.println("La connexion à la base de données : REUSSI ! ");
            res_sql[0][0] = e_sql.requete_1();
            res_sql[1][0] = e_sql.requete_2();
            res_sql[2] = e_sql.requete_3();
            connexion_sql = e_sql.deconnexion_BDD();
            if(!connexion_sql)
                System.out.println("Déconnexion de la base données : REUSSI !");
        }

    }
}
