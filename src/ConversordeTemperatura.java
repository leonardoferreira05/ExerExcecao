
public class ConversordeTemperatura {
    
    public double converterParaCelsius( double f) throws MenorQueZeroAbsolutoException{
        
        if(f < -273.15)
           throw new MenorQueZeroAbsolutoException("Menor que o zero absoluto");

        
        return (f-32)/1.8;
    }
    
    public double converterParaFarenheit(double c) throws MenorQueZeroAbsolutoException{
        if(c < -273.15)
            throw new MenorQueZeroAbsolutoException("Menor que o zero absoluto");
        
        return (1.8*c)+32 ;
    }
    
}
