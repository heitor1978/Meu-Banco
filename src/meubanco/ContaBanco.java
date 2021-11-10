package meubanco;

public class ContaBanco {
    // Atributos da classe
    public int numConta = 0;
    protected String tipo;
    private String dono;
    private float saldo = 0;
    private boolean status;
    
    // Metodo Especiais
    public void ContaBanco(){ //Metodo Construtor
         saldo = 0;
         status = false;
    }
    
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    // Metodos da classe
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if("CC".equals(tipo)){
            this.setSaldo(50); 
        }else if("CP".equals(tipo)){
            this.setSaldo(150);
        }
    }
    
    
    public void fecharConta(){
        if(this.getSaldo() == 0){
            this.setStatus(false);
        } 
    }
    
    public void depositar(float valor){
        if(this.getStatus() == true){
            this.setSaldo(getSaldo() + valor);
        }
    }
    
    public void sacar(float valor){
        if(this.getStatus() == true){
            if(this.getSaldo() >=  valor){
                this.setSaldo(this.getSaldo() - valor);
            }
        }
    }
    
    public void pagarMensal(){
        int valor = 0;
        if(this.getTipo() == "CP"){
           valor = 20; 
        }else if(this.getTipo() == "CC"){
           valor = 12;
        }
        
        if(this.getStatus()){
            if(saldo > valor){
                this.setSaldo(getSaldo() - valor);
            }
        }   
    }
    
    public void estadoAtual(){
        System.out.println("/////////////////////////////////////////////////////");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
}
