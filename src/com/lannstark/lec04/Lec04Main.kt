package com.lannstark.lec04
/*
import com.lannstark.lec04.JavaMoney;

public class Lec04Main {

  public static void main(String[] args) {
    JavaMoney money1 = new JavaMoney(1_000L);
    JavaMoney money2 = new JavaMoney(2_000L);
    System.out.println(money1.plus(money2));
  }

}
 */
fun main(){
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)
    if(money1>money2){
        println("Money1이 Money2보다 금액이 큽니다.")
    }

    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)

    println(money3 === money4) // 주소를 비교한다.
    println(money3 == money5) // 코틀린에서는 내용을 비교한다.

    if(fun1() || fun2()){
        println("안녕하세요")
    }

    val money6 = Money(1_000L)
    val money7 = Money(2_000L)
    println(money6+money7) // 연산자 오버로딩
}
fun fun1(): Boolean{
    println("fun 1")
    return true
}
fun fun2(): Boolean{
    println("fun 1")
    return false
}
