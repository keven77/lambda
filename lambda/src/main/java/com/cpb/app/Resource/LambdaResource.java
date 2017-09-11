package com.cpb.app.Resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaResource {
    /**
     * 转换大小写
     * @return
     */
    public List lambda1() {
        String[] wordStr = {"a", "b", "c", "d"};
        List<String> result = Arrays.stream(wordStr).map(t -> t.toUpperCase()).collect(Collectors.toList());
        return result;
    }

    /**
     * 平方
     * @return
     */
    public List lambda2() {
        Integer[] wordStr = {1,2,3,4};
        List<Integer> result = Arrays.stream(wordStr).map(t->t*t).collect(Collectors.toList());
        return result;
    }
    public List lambda3() {
        Stream<List<Integer>> inputStream = Stream.of(Arrays.asList(1),Arrays.asList(2,3),Arrays.asList(4,5,6));
        Stream<Integer> outputStream = inputStream.flatMap((t)->t.stream());
        List<Integer> result = outputStream.map(t->t*t).collect(Collectors.toList());
        return result;
    }

    /**
     * filter
     * @param
     */
    public List lambda4() {
        Integer[] arr = {1,2,3,4,5,6};
        Integer[] result = Arrays.stream(arr).filter(t->t%2==0).toArray(Integer[]::new);
        List resultList = Arrays.asList(result);
        return resultList;
    }
    public static void main(String[] args) {
        LambdaResource lambdaResource = new LambdaResource();
        //() -> System.out.println("Hello Lambda Expressions")
        System.out.println(lambdaResource.lambda4());
    }
}
