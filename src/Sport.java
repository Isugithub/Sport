public class Sport {

    String x = "Cricket";

}
class Fball extends Sport{
    String y = "Football" ;
}
class Rug extends Sport{
    String z = "Rugby";

    public static void main(String[] args) {
        Sport s = new Fball();
        System.out.println(s.x);
        Fball f = new Fball();
        System.out.println(f.y);
        Rug r = new Rug();
        System.out.println(r.z);

    }
}