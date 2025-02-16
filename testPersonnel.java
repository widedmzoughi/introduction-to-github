import java.util.*;
interface ConsServices(){
    public void suscrube();
    public void payement();
    }
abstract class Personnel{
    int id;
    Personnel(int id){ this.id=id;}
}
class directeur extends Personnel implements ConsServices{
    public directeur (int id){super(id);}
        public void suscribe(){
            system.out.println("souscrire Directeur" + id);
    
        }
        public void payement(){
            system.out.println("payer Directeur" + id);
    
        }
        

}
class Ingenieur extends Personnel implements ConsServices{
    public Ingenieur(int id){super(id);}
        public void suscribe(){
            system.out.println("souscrire Ingenieur" + id);
    
        }
        public void payement(){
            system.out.println("payer Ingenieur" + id);
    
        }
}
class Stagiaire extends Personnel implements ConsServices{
    public Stagiaire (int id){super(id);}
        public void suscribe(){
            system.out.println("souscrire Stagiaire" + id);
    
        }
        public void payement(){
            system.out.println("payer Stagiaire" + id);
    
        }
}
public class TestPersonnel{
    public static void main(String []args){
        vector<Personnel> dessin = new vector<Personnel>();
        dessin.add(new Ingenieur(100,50,1));
        dessin.add(new Ingenieur(10 ,3));
        dessin.add(new Ingenieur(70,20,4));
         dessin.add(new Ingenieur(100 ,50,1));

         for(Personnel F:staff)
         if(P instancoef Stagiaire)
            ((ConsServices)F).suscribe();
        for(Personnel F:dessin)
           ((PayService)P).payement();
        

    }
}
