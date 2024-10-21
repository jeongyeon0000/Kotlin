fun main(){
    val items = arrayOf(1,2,3)
    items.size // 배열 크기
    items.set(0,10) // 인덱스 0의 값을 10으로 바꾼다.
    items[0] = 10 // 위와 같다.

    // 예외처리
    try{
        val item = items[4]
    }catch (e: Exception){
        print(e.message)
    }
}