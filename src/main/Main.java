package main;

import mediator.Extractor_Excel;
import mediator.Mediator;

public class Main {

    public static void main(String[] args){
        String excelpath = "src\\datasources\\donneesExcel.xls";
        String xmlpath = "src\\datasources\\donneesXML.xml";


        Mediator mediator = new Mediator(excelpath, xmlpath);


        mediator.executeMediator();
    }
}
