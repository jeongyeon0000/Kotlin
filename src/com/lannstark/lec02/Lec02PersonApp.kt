package com.lannstark.lec02

fun main(){
    val person = Person("공부하는 개발자")
    startsWithA(person.name) // 코틀린 코드에서 자바 코드를 가져다 쓸때는 코틀린이 어노테이션을 인식한다.(@Nullable이면 에러)

}
fun startsWithA(str:String): Boolean{
    return str.startsWith("A")
}