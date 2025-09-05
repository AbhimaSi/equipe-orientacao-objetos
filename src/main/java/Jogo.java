// Nome: Abhimael Sidney Setni Rogatti	RA: 2618001

public class Jogo {
    
    private int codJogo;
    private String dataHora,
            equipeAdv;

    public Jogo() {
        codJogo = 0;
        dataHora = "";
        equipeAdv = "";
    }

    // Construtor Sobrecarregado
    public Jogo(int codJogo, String dataHora, String equipeAdv) {
        this.dataHora = dataHora;
        this.equipeAdv = equipeAdv;
    }

    public int getCodJogo(){
        return codJogo;
    }
    
    public String getDataHora() {
        return this.dataHora;
    }

    public String getEquipeAdv() {
        return this.equipeAdv;
    }

    public void setCodJogo(int codJogo){
        this.codJogo = codJogo;
    }
    
    public void setDataHora(String dataHora) throws StringVaziaException, StringGrdException {
        if (dataHora.length() <= 25) {
            if (dataHora != "") {
                this.dataHora = dataHora;
            } else {
                throw new StringVaziaException();
            }
        } else {
            throw new StringGrdException();
        }
    }

    public void setEquipeAdv(String equipeAdv) throws StringGrdException, StringVaziaException {
        if (equipeAdv.length() <= 25) {
            if (equipeAdv != "") {
                this.equipeAdv = equipeAdv;
            } else {
                throw new StringVaziaException();
            }
        } else {
            throw new StringGrdException();
        }
    }
}
