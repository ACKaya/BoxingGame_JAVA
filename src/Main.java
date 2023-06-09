public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("anil",7,77,20,70);
        Fighter f2=new Fighter("canberk",7,82,89,59);
        Match m1=new Match(20,90,f1,f2);
        m1.run();

    }
}
