
package centraltelefonica_1.CentralitaHerencia;

public class Local extends Llamada{
    
    //atributos
    protected float _costo;

    
    //getters
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
        return this._duracion * this._costo;
    }
   
    @Override
    public void Mostrar()
    {
        super.Mostrar();
        StringBuilder Local;
        Local = new StringBuilder();
        Local.append(" - Costo: $").append(this._costo);
        System.out.println(Local.toString());
    }
    
}
