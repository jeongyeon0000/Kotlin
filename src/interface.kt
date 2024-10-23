fun main(){
    val dog: Animals = Dogs();
    val cat = Cats();

    // cat as Dogs // as로 강제 타입 캐스팅을 할 수 있다.
    if(dog is Dogs) // is로 타입을 체크한다.
        println("강아지들")
}
interface Drawable{ // 별도로 묶을 수 있는 기능 (공통된 기능으로)
    fun draw()
}
abstract class Animals{
    open fun move(){ // open이라는 키워드가 있어야 오버라이딩을 할 수 있다.
        print("이동")
    }
}

open class Dogs : Animals(), Drawable{
    override fun move() {
        println("껑충")
    }

    override fun draw() {
        println("강아지를 그린다.")
    }
}

class Cats : Animals() {
    override fun move() {
        println("살금살금")
    }
}