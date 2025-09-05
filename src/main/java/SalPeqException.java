// Nome: Abhimael Sidney Setni Rogatti	RA: 2618001

public class SalPeqException extends Exception {

    public void printSalPeq() {
        System.out.println("Salario deve ser maior que 1400!");
    }

    public void printSalExtraPeq() {
        System.out.println("Salario Extra deve ser maior que 0!");
    }

    public Contratado fixSalPeq(Contratado con) {
        try {
            con.setSalario(Double.parseDouble("0"));    // JOPTIONPANE.SHOWINPUTDIALOG (APENAS ERRO)
        } catch (SalPeqException spe) {
            spe.printSalPeq();
            spe.fixSalPeq(con);
        }
        return con;
    }
}
