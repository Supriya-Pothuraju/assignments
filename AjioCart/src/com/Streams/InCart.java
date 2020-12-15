package com.Streams;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class InCart {
 public static void cart(){
     List<Products> carts =List.of(new Products("A100",1000,4.0,Cateogry.Shirt),
     new Products("A100",1000,4.0,Cateogry.Shirt),
     new Products("B200",550,3.0,Cateogry.Tshirt),
     new Products("EF00",300,400,Cateogry.Footwear),
     new Products("D00",4000,400,Cateogry.Accesories)
     );

     //   carts.stream()
                   //  .mapToDouble(cart-> cart.getPrice()).forEach(total-> System.out.println(carts));
    // carts.stream()
            // .forEach(n-> System.out.println(n.getPrice()));
     //Total Amount to be Paid
     double sum =carts.stream()
             .mapToDouble(Products::getPrice)
             .sum();
     System.out.println("Amount to Be Paid:"+ sum);

     carts.stream()
             .map(Products::getProductid)
             .distinct()
             .forEach(System.out::println);
     carts.stream()
             .sorted(Comparator.comparing(m->m.getPrice()))
             .forEach(m-> System.out.println(m.getPrice()));
     carts.stream()
             .collect(Collectors.groupingBy(Products::getProductid, LinkedHashMap::new,Collectors.counting()));
     System.out.println();


     carts.stream()
             .filter(m->m.getPrice()>500)
             .forEach(n-> System.out.println("Product:   " +n.getProductid() +"price:  "    +n.getPrice()));


     carts.stream().filter(m->m.getPrice()>500)
             .peek(m-> System.out.println(m.getProductid()))
             .map(Products::getPrice)
             .peek(n-> System.out.println(n))
             .forEach(System.out::println);



 }


 }

