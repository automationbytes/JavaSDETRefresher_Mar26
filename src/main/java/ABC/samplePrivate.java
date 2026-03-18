package ABC;
//class sample{
//    private void display() {
//        System.out.println("This is a private method in the samplePrivate class.");
//    }
//}
public class samplePrivate {
    private void display() {
        System.out.println("This is a private method in the samplePrivate class.");
    }
    public static void main(String[] args) {
        samplePrivate obj = new samplePrivate();
        obj.display(); // This will cause a compile-time error because display() is private
    }
}
