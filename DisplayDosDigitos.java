public class DisplayDosDigitos
{
    private int limite;
    private int valor;

    public DisplayDosDigitos(int limiteDisplay)
    {
        limite = limiteDisplay;
        valor = 1;
    }

    public int getValor()
    {
        return valor;
    }

    public String getValorDelDisplay()
    {
        if(valor < 10)
        {
            return "0" + valor;
        }
        else 
        {
            return "" + valor;
        }
    }

    public void setValor(int nuevoValor)
    {
        if((nuevoValor >= 1) && (nuevoValor < limite)) 
        {
            valor = nuevoValor;
        }
    }

    public void incrementa()
    {
        valor = valor + 1;
        if (valor == limite) 
        {
            valor = 1;  
        }
    }
}