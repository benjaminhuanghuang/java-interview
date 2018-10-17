package streamStudy;
/*
* https://stackify.com/streams-guide-java-8/
* */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    private static Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100000.0),
            new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0)
    };


    private void GetStreamFromArray() {
        //obtain a stream from an existing array
        Stream.of(arrayOfEmps);
    }

    // obtain a stream from an existing list:
    private void GetStreamFromList() {
        List<Employee> empList = Arrays.asList(arrayOfEmps);
        empList.stream();
    }


}
