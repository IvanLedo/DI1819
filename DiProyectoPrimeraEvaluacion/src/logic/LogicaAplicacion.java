/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import beans.Corredor;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author MSI
 */
public class LogicaAplicacion {
    
    public static SimpleDateFormat sdfFecha = new SimpleDateFormat("dd/MM/yyyy");
    public static SimpleDateFormat sdfHora = new SimpleDateFormat("hh:mm");
    
    private String archivoCsv = "corredores.csv";

    ArrayList<Corredor> listaCorredores = new ArrayList<Corredor>();

    public void altaCorredores(Corredor c1) {
        listaCorredores.add(c1);
    }

    public void bajaCorredores(String dni) {
        Iterator itr = listaCorredores.iterator();

        while (itr.hasNext()) {
            Corredor c1 = (Corredor) itr.next();
            if (dni.equals(c1.getDni())) {
                itr.remove();
            }

        }
    }

    public void importarCorredores() throws FileNotFoundException, IOException {
        String line = "";
        BufferedReader br = new BufferedReader(new FileReader(archivoCsv));
        while ((line = br.readLine()) != null){
            Corredor c1 = new Corredor();
            String[] corredorCompleto = line.split(",");
             c1.setNombre(corredorCompleto[0]);
             c1.setDni(corredorCompleto[1]);
             c1.setDireccion(corredorCompleto[2]);
             c1.setFechaDeNacimiento(stringADate(corredorCompleto[3]));
            
        }
    }
    
    public static Date stringADate(String fecha) throws ParseException{
        Date date = sdfFecha.parse(fecha);
        return date;
    }
    
    public static  String dateAString(Date fecha){
        String fechaString = sdfFecha.format(fecha);
        return fechaString;
    }
   
}
