// Nome: Abhimael Sidney Setni Rogatti RA: 2618001

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BDEquipe {
    private static BDEquipe bdEquipeUnic;
    private static Equipe bdEquipe;
    
    private BDEquipe(){
        bdEquipe = new Equipe();
    }
    
    //Singleton
    public static BDEquipe getInstancia(){
        if(bdEquipeUnic == null){
            bdEquipeUnic = new BDEquipe();
            return bdEquipeUnic;
        }
        return bdEquipeUnic;
    }
    
    public Equipe getBdEquipe(){
        return bdEquipe;
    }
    
    public Equipe consEquipe(Equipe equipe){
        if(bdEquipe.getNomeClube() != ""){
            return bdEquipe;
        }
        return null;
    }//fim consEquipe
    
    public Equipe cadEquipe(Equipe equipe){
        if(consEquipe(equipe) == null){
            bdEquipe = equipe;
            return bdEquipe;
        }
        return null;
    }//fim cadEquipe
    
    public Equipe attEquipe(Equipe equipe){
        try{
            if(consEquipe(equipe) != null){
                
                bdEquipe.setPais(equipe.getPais());
                bdEquipe.setEstado(equipe.getEstado());
                bdEquipe.setEsporte(equipe.getEsporte());
                bdEquipe.setPatrimonio(equipe.getPatrimonio());
                bdEquipe.setDataCriacao(equipe.getDataCriacao());
                return bdEquipe;
                
            }
        }
        
        catch(StringVaziaException sve){}
        catch(StringGrdException sge){}
        catch(ValPeqException vpe){}
        
        return null;
    }//fim attEquipe
    
    public Equipe attEquipeNome(Equipe equipe){
        try{
            if(consEquipe(equipe) != null){
                
                bdEquipe.setNomeClube(equipe.getNomeClube());
                return bdEquipe;
                
            }
        }
        catch(StringVaziaException sve){}
        catch(StringGrdException sge){}
        
        return null;
    }//fim attEquipeNome
    
    public Equipe delEquipe(Equipe equipe){
        if(consEquipe(equipe) != null){
            bdEquipe = new Equipe();
            return bdEquipe;
        }
        return null;
    }//fim delEquipe
    
    public void somaPatrimonio(double valor){
        try{
            bdEquipe.setPatrimonio(bdEquipe.getPatrimonio() + valor);
        }
        catch (ValPeqException ex) {}
    }
  
}
