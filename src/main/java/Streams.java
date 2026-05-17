import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        List<Integer> numbs = Arrays.asList(1,3,8,2,4,9);
        Stream<Integer> data = numbs.stream();

        /* doubling the values and that doubled values will be total value */
        int result = data.sorted().map(n -> n*2).reduce(0, Integer::sum);
        /*for count total adding value for doubled values*/
//        int duplicateresult = data.sorted().map(n -> n*2).reduce(0, (c,e)-> c+e);

        System.out.println("summing the values  "+ result);

        /* sorted & mapping & doubling & looping for every odd values*/
        /*data.filter(n -> n%2 == 1).
                sorted().
                map(n -> n*2).
                forEach(System.out::println);
        */



        /* counting using streams */
//        long data1 = data.count();
//        System.out.println(data1);

         /* sorting using streams */
//        Stream<Integer> sortedData = data.sorted();

//        sortedData.forEach(n -> System.out.println(n));
//        sortedData.forEach(System.out::println);

        /* doubling the values */
//        sortedData.forEach(n -> System.out.println(n*2));

         /* normal loop to double the values */
/*
        for (int n : numbs ){
            System.out.println("numbers are doubled    "+ n*2);
        }
        System.out.println(data.sorted());
*/



    }
}
