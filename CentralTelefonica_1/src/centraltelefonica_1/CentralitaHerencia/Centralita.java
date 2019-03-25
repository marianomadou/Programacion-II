package centraltelefonica_1.CentralitaHerencia;

import java.util.ArrayList;
import java.util.Comparator;

public class Centralita
{
    private ArrayList<Llamada> _listaDeLlamadas;
    protected String _razonSocial;

    public Centralita()
    {
        this._listaDeLlamadas = new ArrayList<>();
    }

    public Centralita(String nombreEmpresa)
    {
        this();
        this._razonSocial = nombreEmpresa;
    }

    public ArrayList<Llamada> Llamadas()
    {
        return _listaDeLlamadas;
    }
    
    public float GananciaPorLocal()
    {
        return this.CalcularGanancia(TipoLlamada.LOCAL);
    }
    
    public float GananciaPorProvincial()
    {
        return this.CalcularGanancia(TipoLlamada.PROVINCIAL);
    }
    
    public float GananciaTotal()
    {
        return this.CalcularGanancia(TipoLlamada.TODAS);
    }
    
    private float CalcularGanancia(TipoLlamada tipo)
    {
        float ganancia = 0.0F;
        
        for (Llamada unaLlamada : _listaDeLlamadas)
        {
            if(unaLlamada instanceof Local && tipo != TipoLlamada.PROVINCIAL)
            {
                ganancia += ((Local) unaLlamada).CostoLLamada();
            }
            else if(unaLlamada instanceof Provincial && tipo != TipoLlamada.LOCAL)
            {
                ganancia += ((Provincial) unaLlamada).CostoLlamada();
            }
        }
        
        return ganancia;
    }
    
    public void Mostrar()
    {
        StringBuilder cadena = new StringBuilder();
        
        cadena.append("---------------------").append("\n");
        cadena.append("Centralita").append("\n");
        cadena.append("---------------------").append("\n");
        
        cadena.append("         Razón Social: ").append(this._razonSocial).append("\n");
        cadena.append("     Ganancia Locales: ").append(this.GananciaPorLocal()).append("\n");
        cadena.append("Ganancia Provinciales: ").append(this.GananciaPorProvincial()).append("\n");
        cadena.append("    Ganancias Totales: ").append(this.GananciaTotal()).append("\n");
        
        cadena.append("---------------------").append("\n");
        cadena.append("Detalle de Llamadas").append("\n");
        cadena.append("---------------------").append("\n");
        
        System.out.println(cadena.toString());
        
        for (Llamada unaLlamada : _listaDeLlamadas)
        {
            if(unaLlamada instanceof Local)
            {
                ((Local) unaLlamada).Mostrar();
            }
            else if(unaLlamada instanceof Provincial)
            {
                ((Provincial) unaLlamada).Mostrar();
            }
        }
    }
    
    private static Comparator<Llamada> CompararDuracionAsc = (Llamada s1, Llamada s2) ->
    {
        int aux = 0;
        return (int) Math.signum(s1.getDuracion() - s2.getDuracion());
    };

    private static Comparator<Llamada> CompararDuracionDesc = (Llamada s1, Llamada s2) ->
    {
        return (int) Math.signum(s2.getDuracion() - s1.getDuracion());
    };

    public void ordenarLlamadas(int opcion)
    {

        switch (opcion)
        {
            case 1:
                this._listaDeLlamadas.sort(CompararDuracionAsc);
                break;
            case 0:
                this._listaDeLlamadas.sort(CompararDuracionDesc);
                break;
            default:
                break;
        }

}
}