fun main(){
    myFunc(10){ // 고차함수: 함수를 매개변수로 전달한다.
        println("함수 호출")
    } // 전달하는 인수가 함수인 경우 람다(lambda)식으로 적을 수 있으며, 이 함수만 있는 경우에는 () 생략이 가능하다.
}
fun myFunc(a:Int, callBack : () -> Unit){  // callBack 매개변수는 () -> Unit 타입이다.
    println("함수 시작!!!")
    callBack()
    println("함수 끝!!!")
}