
package centraltelefonica_1.CentralitaHerencia;

public class Local extends Llamada{
    
    //atributos
    protected float _costo;

    
    //getters
    @Override
    public float getCostoLlamada ()
    {
        return this.CalcularCosto();
    }
    
    public float CostoLLamada() {
        return _costo=CalcularCosto();
    }
    
    //metodos
    public Local(Llamada unaLlamada, float costo) 
    {
        super(unaLlamada._nroOrigen, unaLlamada._duracion, unaLlamada._nroDestino);
        this._costo=costo;   
    }
    
    public Local(String origen, float duracion, String destino, float costo)
    {
        super(origen, duracion, destino);
        this._costo = costo;
    }
    
    private float CalcularCosto()
    {
        return this._costo * this._duracion;
    }
   
    @Override
    protected String Mostrar()
    {
        StringBuilder l;
        l = new StringBuilder();
        l.append( super.toString());
        l.append(" - Costo: $").append(this._costo);
        
        return l.toString();
    }
    
    @Override
    public String toString()
    {
        return this.Mostrar();
    }

    @Override
     public boolean equals(Object unaLlamada)
     {
         boolean respuesta=false;
         if(unaLlamada instanceof Local)
         {
            respuesta=true;
         }
         return respuesta;
     }
    
}
