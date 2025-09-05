// Nome: Abhimael Sidney Setni Rogatti	RA: 2618001

import java.util.ArrayList;
import java.util.List;

public class BDFuncionario {
    private static BDFuncionario bdFuncUnic;
    private static List<Contratado> bdFuncionario;
    
    private BDFuncionario(){
        bdFuncionario = new ArrayList<Contratado>();
    }
    
    // Singleton
    public static BDFuncionario getInstancia(){
        if(bdFuncUnic == null){
            bdFuncUnic = new BDFuncionario();
        }
        return bdFuncUnic;
    }
    
    public List<Contratado> getBdFuncionario(){
        return bdFuncionario;
    }
    
    public int getNumFuncionarios(){
        int numFuncionarios = 0;
        
        numFuncionarios += bdFuncionario.size();
        return numFuncionarios;
    }
    
    public Contratado cadContrat(Contratado contratado){
        if(consContratCpf(contratado) == null){
            bdFuncionario.add(contratado);
            return contratado;
        }
        return null;
    }//fim cadContrat
    
    public Contratado attContratCpf(Contratado contratado){
        if(consContratCpf(contratado) != null){
            for(int i = 0; i < bdFuncionario.size(); i++){
                if(bdFuncionario.get(i).getCpf() == contratado.getCpf()){
                    bdFuncionario.set(i, contratado);
                    return bdFuncionario.get(i);
                }
            }
        }
        return null;
    }//fim attContratCpf
    
    public Contratado delContratCpf(Contratado contratado){
        if(consContratCpf(contratado) != null){
            for(int i = 0; i < bdFuncionario.size(); i++){
                if(bdFuncionario.get(i).getCpf() == contratado.getCpf()){
                    bdFuncionario.remove(i);
                    return contratado;
                }
            }
        }
        return contratado;
    }//fim delContratCpf
    
    public Contratado consContratCpf(Contratado contratado){
        for(Contratado contrat: bdFuncionario){
            if(contrat.getCpf() == contratado.getCpf()){
                return contrat;
            }
        }
        return null;
    }//fim consContratCpf
    
    public static void limparBD(){
        bdFuncionario.clear();
    }//fim limparBD
    
}//fim BDFuncionario

