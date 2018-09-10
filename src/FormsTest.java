public class FormsTest {

    public static void  main (String[]agrs){

        Forms rect = new Rechteck(4,5);
        Forms drei = new Dreieck(3,5,7);
        Forms kreis = new Kreis(9);
       System.out.println(rect.toString());
       System.out.println(drei.toString());
       System.out.println(kreis.toString());
    }
}
