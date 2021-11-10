package meubanco;

/**
 *
 * @author Heitor
 */
public class MeuBanco {

    public static void main(String[] args) {
      ContaBanco c1 = new ContaBanco();
      c1.setNumConta(2002);
      c1.setDono("Heitor");
      c1.abrirConta("CC");
      c1.depositar(200);
      c1.estadoAtual();
      
      
      
      //ContaBanco c2 = new ContaBanco();
      //c2.setNumConta(1996);
      //c2.setDono("Juliana");
      //c2.abrirConta("CP");
      //c2.depositar(150);
      //c2.estadoAtual();
            
    }
    
}
