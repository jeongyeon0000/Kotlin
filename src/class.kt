fun main(){
    val john = Person('여',"John", 20)
    print(john.name)
    print(john.age)

    // john.name = "jin" name은 val로 수정 불가
    john.age = 23
}

class Person(
    private val gender: Char, // 외부에 노출시키지 않고 싶을때는 private를 사용한다.(기본은 public)
    val name: String,
    var age: Int, // 뒤에 콤마 넣어도 에러 x
){
    /* java일 경우
    val name: String
    var age: Int */
}