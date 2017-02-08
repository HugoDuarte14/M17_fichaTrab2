package m17b_fichatrab2;
/**
 * Class Ponto2D 
 * @author Hugo Duarte
 * @author Nuno calvinho
 * @version 2.0
 */
public class Ponto2D {
    private int x;                              //atributo x;
    private int y;                              //atributo y;
    
    public Ponto2D(){                           //Construtor não parameterizado;
        x=0;
        y=0;        
    } 
    
    public Ponto2D(int x, int y){               // Construtor parameterezido;
        this.x = x;
        this.y = y;        
    }
    
    @Override
    public String toString(){                   //Mostra os valores dos pontos x
        return"X: "+getX()+" Y: "+getY();                 //e y
    }
    
   /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }
    
    /**
     * 
     * @param a
     * A função devolve a distância entre os dois pontos;
     * @return  
     */
         
    public double distancia(Ponto2D a){         
        double distancia= 0;                      
        
        distancia = Math.sqrt(Math.pow((getX()-a.getX()),2) + Math.pow((getY() - a.getY()),2 ));
    
        return distancia;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        
        this.y = y;
    }
    
}
