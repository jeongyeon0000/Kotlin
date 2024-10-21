fun main(){
    var name = "JeongYeon"

    println("제 이름은 $name 입니다.") // string interpolation 기능을 제공하여 바로 변수를 넣을 수 있다.
    println("저는 ${"Song" + name}") // 공백 없이 쓰고싶을때는 {}을 사용한다. (중괄호 안에는 수식을 적을 수 있다.)

    print(name[0]) // 인덱스로 접근이 가능하다.

    print(name.uppercase()) // 모두 대문자
    print(name.lowercase()) // 모두 소문자
}