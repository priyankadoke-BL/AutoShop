public class Sedan extends Car{
   private int length;

   public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public double getSalePrice()
    {
        if(length>20)
        {
            double dis = 0.01*super.getSalePrice();
            return super.getSalePrice()-dis;
        }

        else
        {
            double  dis = 0.1*super.getSalePrice();
            return super.getSalePrice()-dis;
        }
    }
}
