public class NumberDisplay
{
    private int limite;
    private int valor;

    public NumberDisplay(int limiteDisplay)
    {
        limite = limiteDisplay;
        valor = 0;
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
        if((nuevoValor >= 0) && (nuevoValor < limite)) 
        {
            valor = nuevoValor;
        }
    }

    public void incrementa()
    {
        valor = (valor + 1) % limite;
    }
}