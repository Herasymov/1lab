package 1lab;

public class ArOperations {

    public double add(double a, double b){
        return a + b;
    }

    public double sub(double a, double b){
        return a-b;
    }

    public double mul(double a, double b){
        return a*b;
    }

    public double div(double a, double b){
        return (double) a/b;
    }

    public int factorial(int a){
        if(a < 0)
            return -1;
        if(a == 0)
            return 1;
        else
            return a * factorial(a - 1);
    }

    public double lg(int a) {
        return Math.log10(a);
    }

    public double pow(double a, int d){
        double res = 1;
	boolean check = false; 

        if(d < 0){
	    check = true;
	}


        d = Math.abs(d);

        for(int i = 0; i < d; i++)
            res *= a;

        if(check)
            return 1 / res;

        return res;
    }

}
