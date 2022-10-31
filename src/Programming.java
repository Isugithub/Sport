public class Programming {
    public void p(){
        System.out.println("Kamal can java");
    }
}
class Java extends Programming{
    @Override
    public void p() {
        System.out.println("Amal can not java");
    }
}
class Python extends Programming{
    @Override
    public void p() {
        System.out.println("Samal can Java & Python");
    }

    public static void main(String[] args) {
        Programming p,p1,p2;
               p = new Programming();
               p1 = new Java();
               p2 = new Python();
               p.p();
               p1.p();
               p2.p();

    }
}