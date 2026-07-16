package test;

import java.util.Optional;

import clases.Employee;
import generics.records.Result;

public class TestRecord {
    public static void main(String[] args) {
        Result<String> result = new Result<>("Java 21");
        System.out.println(result.value());

        Result<Integer> result2 = new Result<>(23);
        System.out.println(result2);

        Result<Employee> result3 = new Result<>(new Employee(1L, "Juan"));
        System.out.println(result3);

    ++
    }
}
