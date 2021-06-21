package com.example.demo.model;

import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name = "car")
public class Car extends Object {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "color")
    private String color;

    @Column(name = "price")
    private long price;

    @Column(name = "age")
    private int age;

    public Car(String color, long price, int age) {
        this.color = color;
        this.price = price;
        this.age = age;
    }


    long squarePrice() {
        return price * price;
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "color='" + color + '\'' +
//                ", price=" + price +
//                ", age=" + age +
//                '}';
//    }

//    @Override
//    public boolean equals(Object o) {
//        Car c = (Car) o;
//
//        return color.equalsIgnoreCase(c.getColor());
//    }

    // DZ: Zasto moramo implementirati equals i hashcode. Navesti primjer (hint liste, setovi)

//    @Override
//    public int hashCode() {
//        return Objects.hash(color, price, age);
//    }
}
