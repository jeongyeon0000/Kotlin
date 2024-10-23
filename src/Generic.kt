fun main(){
    val box = Box(10) // 타입 추론을 하기 때문에 <Int>생략 가능
    val box2 = Box("hello")

    println(box.value)
    println(box2.value)
}
class Box<T>(var value: T){ // Generic class로 임의의 타입을 가질 수 있기에, 객체를 생성할 때 다양한 타입으로 만들 수 있다.

}