package com.lannstark.lec03
/* java code
public class Lec03Main {

  public static void main(String[] args) {
  }

  public static void printAgeIfPerson(Object obj) {
    if (obj instanceof Person) { // 변수가 주어진 타입이면 true, 아니면 false
      Person person = (Person) obj;
      System.out.println(person.getAge());
    }
  }
}
 */
fun main(){
    val name = "오리"
    PrintAgeIfPerson(name)
    println("미운 아기 $name")
}
fun PrintAgeIfPerson(obj: Any){
    if(obj is Person) {  // is는 자바의 instanceof와 같은 의미
        println(obj.age) // 바로 obj.age로 인식하여 아래의 과정을 거치지 않아도 되는 스마트 캐스트가 가능하다.
        val person = obj as Person // as Person은 obj를 Person타입으로 간주한다는 말이다. 이 코드는 생략할 수 있다.
        println(person.age)
    }
}