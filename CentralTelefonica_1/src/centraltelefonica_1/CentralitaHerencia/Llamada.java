package centraltelefonica_1.CentralitaHerencia;

public class Llamada {
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
    
    //metodos
    //metodo constructor
    public Llamada(String origen, float duracion, String destino) {
        this._nroOrigen = origen;
        this._duracion = duracion;
        this._nroDestino = destino;
        
    }
    
    //metodo mostrar
    public void Mostrar()    
    {
        StringBuilder Llamada;
        Llamada = new StringBuilder();
        Llamada.append("Numero Origen: ").append(_nroOrigen);
        Llamada.append(" - Numero Destino: ").append(_nroDestino);
        Llamada.append(" - Duracion: ").append(_duracion);
        System.out.print(Llamada.toString()); 
    }
    
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
}
