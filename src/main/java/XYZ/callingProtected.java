package XYZ;
import ABC.sampleProtected;

//callingProtected is a child class
// of sampleProtected, so it can access the protected method display() of the superclass.
public class callingProtected extends sampleProtected {
    public static void main(String[] args) {
        //super class - parent class object
//            sampleProtected obj = new sampleProtected();
//            obj.display();

            callingProtected obj1 = new callingProtected();
        obj1.display();

    }
}
