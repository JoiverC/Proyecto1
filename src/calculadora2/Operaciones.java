
package calculadora2;


public class Operaciones {
    
    double var1;
    double var2;

    public Operaciones() {
        this.var1 = 0;
        this.var2 = 0;
    }

    public double getVar1() {
        return var1;
    }

    public void setVar1(double var1) {
        this.var1 = var1;
    }

    public double getVar2() {
        return var2;
    }

    public void setVar2(double var2) {
        this.var2 = var2;
    }
    
    
    public int suma(int num1,int num2){
        int suma = num1 + num2;
        return suma;
    }
    
     public double resta(){
        
        double resta = this.getVar1() - this.getVar2();
        return resta;
                
    }
    
    
}
