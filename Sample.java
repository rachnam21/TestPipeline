package vikas.test;

import java.util.ArrayList;
import java.util.List;

public class Sample {

    static Area twiceArea = (x, y) -> {return x*y*2;};

    public static String dosomething(int x){
        twiceArea.calculate(x,x);
        return String.valueOf(x);
    }

    public static void main(String arg[]) {
        List<Integer> myList = new ArrayList<>();
        
        for(int i = 0; i < 10; i++) {
            myList.add(i);
        }

        System.out.println("=====Simple Lambda or Anonymous=====");
        // Simple Lambda
        myList.forEach(n -> {System.out.println(n);});

        myList.forEach(data ->{
            String strData = dosomething(data);
            System.out.println("----"+strData);
        });

        int total = myList.stream().mapToInt(n -> n).sum();

        myList.parallelStream().forEach(data -> {

        });

        System.out.println(total);


        System.out.println("=====Use of Functional Interface=====");
        // Use of Functional Interface
        Area area = (a, b) -> a*b;

        System.out.println(area.square(8));

        System.out.println(area.calculate(5,6));

        Area newImpl = (a, b) -> {
            System.out.println("Input value is "+ a + " " + b + " for 'Area' functional interface");

            return a*b;
        };

        System.out.println(newImpl.calculate(9,10));

        System.out.println("=====Use of Twice Area calculate=====");
        System.out.println(twiceArea.calculate(3,4));

        System.out.println("=====Use of Singleton=====");
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();
        Singleton thirdInstance = Singleton.getInstance();



    }
}
