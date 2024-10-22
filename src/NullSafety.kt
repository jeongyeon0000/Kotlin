fun main(){
    var name : String? = null // String? 타입으로 선언된 변수는 null을 대입할 수 있다.
    name = "준석"
    name = null

    var name2: String = ""

    // name2 = name // ?가 붙은 것과 안 붙은 것은 다른 타입으로 취급한다.
    if (name != null) { // null 체크
        name2 = name // name이 null이 아닌 경우에 name이 String타입으로 변환이 된다.(같은 타입임으로 대입이 가능하다.)
    }
    name2 = name!! // !!는 null이 아님을 강제로 선언하는 연산자 (null이 들어오면 예외 발생, 좋지 않은 방법)

    name?.let{ // null이 아니면 아래의 블럭을 실행한다.
        name2 = name
    }
}