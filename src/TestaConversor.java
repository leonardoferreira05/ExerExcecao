
public class TestaConversor {
    public static void main(String[] args) {
        
        try {
           ConversordeTemperatura cv = new ConversordeTemperatura();
           
           System.out.println(cv.converterParaCelsius(-300));
            
            ConversordeTemperatura cf = new ConversordeTemperatura();
           
           System.out.println(cf.converterParaFarenheit(-274));
           
            
        }catch(MenorQueZeroAbsolutoException ex){
            
            System.out.println(ex.getMessage());
        }
        
    }
    
}
