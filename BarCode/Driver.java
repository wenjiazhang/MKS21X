public class Driver{

    public static void main(String[]args){
	
    BarCode a = new BarCode("12345");
    BarCode b = new BarCode(a);
    System.out.println(b.toString());
    
    //System.out.println("Here come the errors!");
    
    //BarCode c = new BarCode("1235");
    //BarCode d = new BarCode("1234r");

    }
}
