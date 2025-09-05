// Nome: Abhimael Sidney Setni Rogatti	RA: 2618001

public class NumCamisaGrdException extends Exception {

    public void printNumCamisaGrd() {
        System.out.println("Numero da camisa muito grande");
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
