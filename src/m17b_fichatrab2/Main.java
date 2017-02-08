package m17b_fichatrab2;
/**
 * Class Main  
 * @author Hugo Duarte
 * @author Nuno calvinho
 * @version 2.0
 */
public class Main {
    /**
    * 
    * @param args 
    */
    public static void main(String[] args) {
        
        Ponto2D p1 = new Ponto2D(5,7);          //Coordenadas do primeiro ponto
        Ponto2D p2 = new Ponto2D(2,8);          //Coordenadas do segundo ponto
       
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println(p2.distancia(p1));
    }
    
}
