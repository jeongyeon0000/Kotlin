fun main(){
    val john = People("John", 20)
    val john2 = People("John", 20)

    println(john) // 주소 출력
    println(john2)
    println(john == john2) // class 앞에 data를 붙이지 않았을때 출력결과: false (서로 주소가 다르기 때문에)
    println(john.hobby)
    john.hobby = "배구"
}
data class People( // equals and hashCode를 재정의한 것과 같은 결과
    val name: String,
    var age: Int
){
    var hobby = "축구"// 생성자 안에 별도의 프롬퍼티가 있는 경우
    // private set // private set을 하면 외부에서 값을 설정할 수 없다.
    get() = "취미: $field"

    init{
        print("init") // 실행 코드
    }
    fun some(){
        hobby = "농구"
    }
}