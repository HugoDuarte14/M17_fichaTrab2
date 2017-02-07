package m17b_fichatrab2;

public class Ponto2D {
    private int x;
    private int y;
    
    public Ponto2D(){
        x=0;
        y=0;        
    } 
    // Faltam construtor, getters e setters.
    
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    
    
    public double getX(double x){           //obtem o valor para x;
        
        return x;
    }
    
    public double getY(double y){           //obtem o valor para y;
        
        return y;
    }
    
    public double distancia(Ponto2D a){
                                        
        return x-y;
    }
    
    public void setX(){                     //devolve o valor do X;
        
        
    }
    
    public void setY(){                     //devolve o valor do y;    
        
       
    }
    
}
