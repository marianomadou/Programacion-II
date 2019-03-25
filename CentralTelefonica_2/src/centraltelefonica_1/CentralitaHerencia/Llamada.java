package centraltelefonica_1.CentralitaHerencia;

public abstract class Llamada {
    //atributos
    protected float _duracion;
    protected String _nroDestino;
    protected String _nroOrigen;

    //getters
    public float getDuracion() {
        return _duracion;
    }
    public String getNroDestino() {
        return _nroDestino;
    }
    public String getNroOrigen() {
        return _nroOrigen;
    }
    
    public abstract float getCostoLlamada ();
    
    
    
    //metodos
    //metodo constructor
    public Llamada(String origen, float duracion, String destino) {
        this._nroOrigen = origen;
        this._duracion = duracion;
        this._nroDestino = destino;
        
    }

    @Override
    public String toString() {
        StringBuilder l;
        l = new StringBuilder();
        l.append("Numero Origen: ").append(_nroOrigen);
        l.append(" - Numero Destino: ").append(_nroDestino);
        l.append(" - Duracion: ").append(_duracion);
        return l.toString();
    }
    
    
    
    //metodo mostrar
    protected abstract String Mostrar();    
   /* {
        StringBuilder l;
        l = new StringBuilder();
        l.append("Numero Origen: ").append(_nroOrigen);
        l.append(" - Numero Destino: ").append(_nroDestino);
        l.append(" - Duracion: ").append(_duracion);
        return l.toString();
    }*/
        
    public static int OrdenarPorDuracion(Llamada uno, Llamada dos)
    {
        int retorno;  
        if(uno._duracion > dos._duracion)
            {
                retorno = 1;
            }
            else if(uno._duracion < dos._duracion)
                {
                    retorno = -1;
                }
                else
                    {
                        retorno = 0;
                    }
        return retorno;
    }
    
    public static boolean compararLlamadas(Llamada uno, Llamada dos)
    {
        boolean respuesta=false;
        if(uno._nroOrigen.equals(dos._nroOrigen))
        {
            if(uno._nroDestino.equals(dos._nroDestino))
            {
                respuesta=true;
            }
        }
        return respuesta;
    }
    
    
    
}
