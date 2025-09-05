// Nome: Abhimael Sidney Setni Rogatti	RA: 2618001

import java.util.ArrayList;
import java.util.List;

public class BDAgenda{
    private static BDAgenda bdAgdUnic;
    private static List<Jogo> agenda;
    private static int cod;
    
    private BDAgenda(){
        agenda = new ArrayList<Jogo>();
        cod = 1;
    }
    
    //Singleton
    public static BDAgenda getInstancia(){
        if(bdAgdUnic == null){
            bdAgdUnic = new BDAgenda();
            return bdAgdUnic;
        }
        return bdAgdUnic;
    }
    
    public List<Jogo> getAgenda(){
        return agenda;
    }
    
    public int getCod(){
        return cod;
    }
    
    public Jogo consJogo(Jogo jogo){
        for(Jogo j: agenda){
            if(jogo.equals(j)){
                return j;
            }
        }
        return null;
    }//fim consJogo
    
    public Jogo consJogoCod(Jogo jogo){
        for(Jogo j: agenda){
            if(jogo.getCodJogo() == j.getCodJogo()){
                return j;
            }
        }
        return null;
    
    }//fim consJogoCod
    
    public Jogo cadJogo(Jogo jogo){
        if(consJogo(jogo) == null){
            jogo.setCodJogo(cod);
            agenda.add(jogo);
            cod++;
            return jogo;
        }
        return null;
    }//fim cadJogo
    
    public Jogo attJogoCod(Jogo jogo){
        if(consJogoCod(jogo) != null){
            for(int i = 0; i < agenda.size(); i++){
                if(jogo.getCodJogo() == agenda.get(i).getCodJogo()){
                    agenda.set(i, jogo);
                    return agenda.get(i);
                }
            }
        }
        return null;
    }//fim attJogoCod
    
    public Jogo delJogoCod(Jogo jogo){
        if(consJogoCod(jogo) != null){
            for(int i = 0; i < agenda.size(); i++){
                if(jogo.getCodJogo() == agenda.get(i).getCodJogo()){
                    agenda.remove(i);
                    return jogo;
                }
            }
        }
        return null;
    }//fim delJogoCod

    
    public static void limpaAgenda(){
        agenda.clear();
        cod = 1;
    }
}
