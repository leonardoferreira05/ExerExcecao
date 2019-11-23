
public class TestaMaterial {
    public static void main(String[] args) {
        
        try{
            Material m1 = new Material("carbono",-12);
            
        }catch (QuantidadeInvalidaException ex){
            
            System.out.println(ex.getMessage());
                
        }
    }
    
}
