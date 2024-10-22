fun main(){
    hi()
    println("덧셈의 결과는? ${sum(10,20)}")
    println("뺄셈의 결과는? ${min(b = 10,a = 20)}") // 입력 파라미터를 명시적으로 지정할 수 있다.
    println("곱셈의 결과는? ${x(10,20)}")
}
fun hi() { // 반환값과 매개변수 모두 생략할 수 있다.
    println("안녕하세요, 계산을 시작하겠습니다!")
}
fun sum(a: Int, b: Int) : Int{ // Int형 변수 a,b를 매개변수로 갖고, 반환형이 Int타입인 sum 함수
    return a+b
}
fun min(a: Int, b: Int, c: Int = 0) : Int = a-b-c // 디폴트 값이 있는 매개변수는 인수가 없어도 된다.(오버로드는 파라미터를 조절하여 만들 수 있다.)

fun x(a: Int, b: Int) : Int = a*b // 함수의 실행코드가 한줄인 경우 이렇게 표현할 수 있다.