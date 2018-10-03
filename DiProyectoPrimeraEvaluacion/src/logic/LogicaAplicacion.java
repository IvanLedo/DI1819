
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

    public Date parsearFecha(String fecha) throws ParseException {
        Date fecha2;
        fecha2 = sdf.parse(fecha);
        return fecha2;
    }
}
