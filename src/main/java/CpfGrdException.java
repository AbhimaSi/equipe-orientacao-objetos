// Nome: Abhimael Sidney Setni Rogatti	RA: 2618001

public class CpfGrdException extends Exception {

    public void printCpfGrd() {
        System.out.println("Cpf muito longo, deve conter menos que 10 digitos!");
    }

    public Contratado fixCpfGrd(Contratado contratado) {
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
