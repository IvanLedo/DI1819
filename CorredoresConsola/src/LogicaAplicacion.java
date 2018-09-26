
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MSI
 */
public class LogicaAplicacion {
    SimpleDateFormat sdf = new SimpleDateFormat();

    Scanner sc = new Scanner(System.in);

    public void menu() {
        int puntero = 9;
        System.out.println("BIENVENIDO A LA GESTION DE CORREDORES");
        System.out.println("1- IMPORTAR DE CSV");
        System.out.println("2- DAR ALTA CORREDOR");
        System.out.println("3- MODIFICAR CORREDOR");
        System.out.println("4- BORRAR CORREDOR");
        System.out.println("INTRODUZCA INSTRUCCION 1-4");
        

        while (puntero != 0) {

            if (puntero == 1) {
                importarCSV();
            }
            if (puntero == 2) {
                altaCorredor();
            }
            if (puntero == 3) {
                modificarCorredor();
            }
            if (puntero == 4) {
                borrarCorredor();
            }

        }
    }

    public void importarCSV() {

    }

    public void altaCorredor() {

    }

    public void modificarCorredor() {

    }

    public void borrarCorredor() {

    }
    public Date parsearFecha(String fecha) throws ParseException{
        Date fecha2;
        fecha2 = sdf.parse(fecha);
        return fecha2;
    }
}
