// Nome: Abhimael Sidney Setni Rogatti	RA: 2618001

public class IdadePeqException extends Exception {

    public void printIdadePeq() {
        System.out.println("A idade deve ser maior que 18!");
    }

    public Contratado fixIdadePeq(Contratado contratado) {
        try {
            contratado.setIdade(Integer.parseInt("0"));        // JOPTIONPANE.SHOWINPUTDIALOG (APENAS MOSTRAR ERRO)
        } catch (IdadePeqException ip) {
            ip.printIdadePeq();
            ip.fixIdadePeq(contratado);
        }
        return contratado;
    }
}
