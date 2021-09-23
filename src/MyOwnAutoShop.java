public class MyOwnAutoShop {

    public static void main(String args[]){

        Sedan sedan=new  Sedan(200,300,"yellow",30);
        Ford ford1=new Ford(300,500,"pink",2001,20);
        Ford ford2=new Ford(560,600,"pink",2006,60);
        Car car=new Car(400,600,"black");

        System.out.println(sedan.getSalePrice());
        System.out.println(ford1.getSalePrice());
        System.out.println(ford2.getSalePrice());
        System.out.println(car.getSalePrice());
    }
}
