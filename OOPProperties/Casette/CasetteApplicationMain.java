package Casette;

class CasetteApplicationMain {
    public static void main(String[] args) {
        Casette list[] = new Casette[10];// array of objects passed into the method
        Casette temp = new Casette();// object to invoke the methods

        for (int i = 0; i < 10; i++) {
            list[i] = new Casette();// this is to instantiate every object in the array of objects
        }
        temp.read(list);// calling the methods by passing the array
        temp.display(list);
    }
}