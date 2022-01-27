package java_sample;

import java.util.ArrayList;
import java.util.List;
import java.util.*;  
import java.util.stream.Collectors;


interface StringFunction {
	  int run(int str);
	}

public class Testing {

	public static void main(String[] args) {
		System.out.println("hello world");
		String s = "helo";
		System.out.println(s);
		
		StringFunction c = (d) -> d*2;
		
		System.out.println(c.run(3));
		
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));
        
        //stream count
        long count = productsList.stream().filter(x -> x.price > 25000).count();
        System.out.println(count);
        
        //parallel stream count
        long countp = productsList.parallelStream().filter(x -> x.price > 25000).count();
        System.out.println(count);
        
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);
        
        String filtereds = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(","));
        System.out.println(filtereds);
        
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        
        List<Integer> t = numbers.stream().map(i -> i*2).filter(i -> i>6).collect(Collectors.toList());
        System.out.println(t);
        numbers.stream().map(i -> i*2).filter(i -> i>6).forEach(System.out::println);
        
	}
	


}
