// Nome: Abhimael Sidney Setni Rogatti	RA: 2618001

public class NumCamisaPeqException extends Exception {

    public void printNumCamisaPeq() {
        System.out.println("Numero da camisa deve ser positivo!");
    }

    public Jogador fixNumCamisaGrd(Jogador jogador) {
        try {
            jogador.setNumCamisa(0);        // ENTRADA JOPTION SHOWINPUTDIALOG
        } catch (NumCamisaGrdException ncg) {
            
        } catch (NumCamisaPeqException ncp) {
            
        }
        return jogador;
    }
}
