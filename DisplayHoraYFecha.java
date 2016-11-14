public class DisplayHoraYFecha
{
    private NumberDisplay hora;
    private NumberDisplay minutos;
    private DisplayDosDigitos dia;
    private DisplayDosDigitos mes;
    private DisplayDosDigitos anno;
    private String displayString;
    
    public DisplayHoraYFecha()
    {
        minutos = new NumberDisplay(60);
        hora = new NumberDisplay(24);
        dia = new DisplayDosDigitos(31);
        mes = new DisplayDosDigitos(13);
        anno = new DisplayDosDigitos(100);
    }

    public void avanzarMinuto()
    {
        minutos.incrementa();
        if (minutos.getValor() == 0)
        {
            hora.incrementa();
            if (hora.getValor() == 0)
            {
                dia.incrementa();
                if (dia.getValor() == 1)
                {
                    mes.incrementa();
                    if (mes.getValor() == 1)
                    {
                        anno.incrementa();
                    }
                }
            }
        }
    }
    
        public void setMomento(int nuevoDia, int nuevoMes, int nuevoAnno, int nuevaHora, int nuevoMinutos)
    {
        if (nuevoDia <= 30 && nuevoMes <= 12 && nuevoAnno <= 99 && nuevaHora <= 23 && nuevoMinutos <= 59)
        {
            dia.setValor(nuevoDia);
            mes.setValor(nuevoMes);
            anno.setValor(nuevoAnno);
            hora.setValor(nuevaHora); 
            minutos.setValor(nuevoMinutos);   
        }
    }

    public String getMomento() 
    {
        displayString = hora.getValorDelDisplay() + ":" + minutos.getValorDelDisplay() + " " + dia.getValorDelDisplay() + "/" + mes.getValorDelDisplay() + "/" + anno.getValorDelDisplay();
        return displayString;
    }
}
    