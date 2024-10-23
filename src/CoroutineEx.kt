fun main(){
    /* suspend 함수는 다른 suspend 함수에서 실행할 수 있다.
    Func(10){
        println("함수 호출")
    } */
}
suspend fun Func(a:Int, callBack : () -> Unit){ // suspend 함수
    println("함수 시작!!!")
    callBack()
    println("함수 끝!!!")
}