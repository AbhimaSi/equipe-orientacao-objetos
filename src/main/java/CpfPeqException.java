// Nome: Abhimael Sidney Setni Rogatti	RA: 2618001

public class CpfPeqException extends Exception {

    public void printCpfNeg() {
        System.out.println("Cpf deve ser maior que zero!");
    }

    public Contratado fixCpfPeq(Contratado contratado) {
        try {
            contratado.setCpf(Integer.parseInt("0"));      //JOPTIONPANE.SHOWMESSAGEDIALOG   
        } catch (CpfGrdException cse) {
            cse.printCpfGrd();
            cse.fixCpfGrd(contratado);
        } catch (CpfPeqException cpe) {
            cpe.printCpfNeg();
            cpe.fixCpfPeq(contratado);
        }
        return contratado;
    }
}
