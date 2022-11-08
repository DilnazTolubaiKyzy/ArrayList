import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws MyException{

        ArrayList<Students>arrayList= new ArrayList<>();
        try {
            arrayList.add(new Students(0, "Jack"));
            arrayList.add(new Students(-5, "Roza"));
            arrayList.add(3,null);
        }catch (MyException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Бутту");
        }
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(3));
    }
}