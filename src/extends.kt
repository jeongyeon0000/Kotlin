fun main(){

}

open class P // 일반 클래스도, open이라는 키워드가 있어야 상속할 수 있다.
class SuperMan: P()

abstract class Animal{
    open fun move(){ // open이라는 키워드가 있어야 오버라이딩을 할 수 있다.
        print("이동")
    }
}

class Dog : Animal(){
    override fun move() {
        println("껑충")
    }
}

class Cat : Animal() {
    override fun move() {
        println("껑충")
    }
}