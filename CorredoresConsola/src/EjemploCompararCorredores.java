
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MSI
 */
public class EjemploCompararCorredores {

    private static List<Corredor> listaCorredores = new ArrayList<Corredor>();

    public static void main(String[] args) {
        listaCorredores.add(new Corredor("11111111x","Juan"));
        listaCorredores.add(new Corredor("22222222x","Maria"));
        
        System.out.println(Collections.binarySearch(listaCorredores, new Corredor("111111x","Juan")));
        Collections.sort(listaCorredores, new Comparator<Corredor>() {
            @Override
            public int compare(Corredor o1, Corredor o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        
        
        
        
        
        
        
        
        
    }
}
