// Nome: Abhimael Sidney Setni Rogatti	RA: 2618001

public final class Jogador extends Contratado implements SalBonus {

    private String tipo,
            pos,
            genero;
    private int numCamisa;
    private double salExtra;

    public Jogador() {
        tipo = "";
        pos = "";
        genero = "";
        numCamisa = 0;
        salExtra = 0;
    }

    // Construtor Sobrecarregado
    public Jogador(String tipo, String pos, String genero, int numCamisa) {
        this.tipo = tipo;
        this.pos = pos;
        this.genero = genero;
        this.numCamisa = numCamisa;
    }

    // Método Sobrescrito
    public void calcPremio(double premio, int numMembros) {
        // Reparticao do premio a+6:b+1:c
        double valRep = (premio / (numMembros + 7)) * (numMembros + (6 - 3));
        valRep = valRep / (numMembros - 2);
        setSalExtra(valRep);
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getPos() {
        return this.pos;
    }

    public String getGenero() {
        return this.genero;
    }

    public int getNumCamisa() {
        return this.numCamisa;
    }

    public double getSalExtra() {
        return this.salExtra;
    }

    public void setTipo(String tipo) throws EntradaIncorretaException {
        if (tipo == "Titular" || tipo == "Reserva") {
            this.tipo = tipo;
        } else {
            throw new EntradaIncorretaException();
        }
    }

    public void setPos(String pos) throws StringGrdException, StringVaziaException {
        if (pos.length() <= 25) {
            if (pos != "") {
                this.pos = pos;
            } else {
                throw new StringVaziaException();
            }
        } else {
            throw new StringGrdException();
        }
    }

    public void setGenero(String genero) throws EntradaIncorretaException {
        if (genero == "Masculino" || genero == "Feminino") {
            this.genero = genero;
        } else {
            throw new EntradaIncorretaException();
        }
    }

    public void setNumCamisa(int numCamisa) throws NumCamisaGrdException, NumCamisaPeqException {
        if (numCamisa <= 99) {
            if (numCamisa >= 0) {
                this.numCamisa = numCamisa;
            } else {
                throw new NumCamisaPeqException();
            }

        } else {
            throw new NumCamisaGrdException();
        }
    }

    public void setSalExtra(double salExtra) {
        this.salExtra = salExtra;
    }

}
