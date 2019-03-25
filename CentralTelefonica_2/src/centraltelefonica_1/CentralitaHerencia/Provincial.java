package centraltelefonica_1.CentralitaHerencia;

public class Provincial extends Llamada{
    //atributos
    protected Franja _franjaHoraria;
    protected float _costo;

       
    //Getters
    @Override
    public float getCostoLlamada ()
    {
        return this.CalcularCosto();
    }
    

    //metodos
    //metodo constructor
    public Provincial(Franja miFranja, Llamada unaLlamada)
    {
        this(unaLlamada._nroOrigen, miFranja, unaLlamada._duracion, unaLlamada._nroDestino);
    }
    
    //metodo constructor
     public Provincial(String origen, Franja miFranja, float duracion, String destino)
    {
        super(origen, duracion, destino);
        this._franjaHoraria = miFranja;
        
    }
    
    private float CalcularCosto()
    {
        switch(this._franjaHoraria)
        {
            case FRANJA_1:
                this._costo = 0.99F;
                break;
            case FRANJA_2:
                this._costo = 1.25F;
                break;
            case FRANJA_3:
                this._costo = 0.66F;
                break;
            default:
                this._costo = 0.0F;
        } 
        return this._duracion * this._costo;
    }
    
    @Override
     protected String Mostrar()
    {
        //super.Mostrar();
        StringBuilder p;
        p = new StringBuilder();
        p.append(super.toString());
        p.append(" - Costo llamada: $").append(CalcularCosto());
        p.append(" - Franja Horaria: ").append(this._franjaHoraria);
        return p.toString();
    }

    @Override
    public String toString()
    {
        return this.Mostrar();
    }
     
     @Override
     public boolean equals(Object ob)
     {
         boolean respuesta=false;
         if(ob instanceof Provincial)
         {
            respuesta=true;
         }
         return respuesta;
     }
    
    
}
