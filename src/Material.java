public class Material {
   private String nome;
   private int quant;

    public Material(String n, int q) throws QuantidadeInvalidaException {
        this.setNome(n);
        this.setQuant(q);
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int q) throws QuantidadeInvalidaException {
        
        if(q<0)
            throw new QuantidadeInvalidaException("Quantidade Negativa");
        
        this.quant = q;
    }
    
    
    
}
