public class Calculator {
    public <T extends Number> double sum (T a, T b){
        return a.doubleValue()+b.doubleValue();
    }

    public <T extends Number> double subtract (T a, T b){
        return a.doubleValue()-b.doubleValue();
    }

    public <T extends Number> double multiple (T a, T b){
        return a.doubleValue()*b.doubleValue();
    }

    public <T extends Number> double divide (T a, T b){
        if(b.equals(0)){
            return b.doubleValue()/a.doubleValue();
        } else {
            return a.doubleValue()/b.doubleValue();
        }
    }
}