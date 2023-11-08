public class Priceet {
    public static void main(String[] args) {
        double price=500;
        int count=1234;
       double k= priceCalculation(price,  count);

       System.out.println("Стоимость-" +k);


    }
    public static double priceCalculation(double price, int count) {//считать//цена//стоимость
        double rezult=price * count;
return rezult;

    }

    }
