package centraltelefonica_1;

import centraltelefonica_1.CentralitaHerencia.Centralita;
import centraltelefonica_1.CentralitaHerencia.Franja;
import centraltelefonica_1.CentralitaHerencia.Llamada;
import centraltelefonica_1.CentralitaHerencia.Local;
import centraltelefonica_1.CentralitaHerencia.Provincial;
import java.util.ArrayList;

public class CentralTelefonica_1 {

    public static void main(String[] args) {
        
        Centralita center1 = new Centralita("Telefónica");
        ArrayList<Llamada> lista = center1.Llamadas();
        
        Llamada ll1 = new Local("Bariloche", 30.0F, "Mendoza", 2.65F);
        Llamada ll2 = new Provincial("La Pampa", Franja.FRANJA_1, 21.0F, "Miami");
        Llamada ll3 = new Local("Rio de Janeiro", 45.0F, "Venezuela", 1.99F);
        Llamada ll4 = new Provincial(Franja.FRANJA_3, ll2);
        
        lista.add(ll1);
        lista.add(ll2);
        lista.add(ll3);
        lista.add(ll4);

        center1.ordenarLlamadas(0);//1 ordena ascendente - 0 ordena descendente
       
        
        center1.Mostrar();
        
        /*
        //Ejemplo German
        Llamada unaLlamada=new Llamada("bariloche", 5, "Miami");
        
        Llamada ll = new Local(unaLlamada, 5);
        
        if(ll instanceof Provincial)
        {
            System.out.println("Si");
        }
        else
        {
            System.out.println("No");
            
        }*/
        
        
    }
    
}
