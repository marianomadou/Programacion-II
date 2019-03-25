package centraltelefonica_1.CentralitaHerencia;

public class Provincial extends Llamada{
    //atributos
    protected Franja _franjaHoraria;
    protected float _costo;

       
    //Getters
    public float CostoLlamada() {
        return this._costo=CalcularCosto();
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
        switch(miFranja)
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
    }
    
    private float CalcularCosto()
    {
        return this._duracion * this._costo;
    }
    
    @Override
     public void Mostrar()
    {
        super.Mostrar();
        StringBuilder Provincial;
        Provincial = new StringBuilder();
        Provincial.append(" - Costo llamada: $").append(CostoLlamada());
        Provincial.append(" - Franja Horaria: ").append(this._franjaHoraria);
        System.out.println(Provincial.toString());
    }

    
    
    
    
    
    
    
    
}
