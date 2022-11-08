public class Main {
    public static void main(String[] args) {
        int number = 100;
        int number2;
        number2 = 100;
        System.out.println(number);
        System.out.println(number2);

        double decimalNumber = 14.15;
        Integer number3 = 100;
        String texto = "Hola mundo";
        Byte number4 = 4;
        Double decimal2 = 2.3;


    }

    public String productFormatter(String productName, String date){
        String name;
        name = productName.trim();
        name = name.replace(" ", "_");
        name = name+date;
        name = name.toUpperCase();
        return name;
    }
}