package com.lannstark.lec02
/*java code
public class Lec02Main {

  public static void main(String[] args) {

  }

  public boolean startsWithA1(String str) {
    if (str == null) {
      throw new IllegalArgumentException("null이 들어왔습니다");
    }
    return str.startsWith("A");
  }


  public Boolean startsWithA2(String str) {
    if (str == null) {
      return null;
    }
    return str.startsWith("A");
  }


  public boolean startsWithA3(String str) {
    if (str == null) {
      return false;
    }
    return str.startsWith("A");
  }

}
 */
fun main(){
    val str: String? = "ABC"
    println(str?.length ?: 0) // Safe Call과 Elvis
}

fun startsWithA1(str: String?): Boolean { // Exception
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? { // null 반환
    return str?.startsWith("A")
}

fun startsWithA3(str:String?): Boolean{ // false 반환
    return str?.startsWith("A") ?: false
}

fun startWith(str:String?): Boolean {
    return str!!.startsWith("A")
}