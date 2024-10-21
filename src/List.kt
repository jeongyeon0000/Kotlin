fun main(){
    val items = listOf(1,2,3,4,5) // 정적 리스트(변경 O)
    val item = mutableListOf(1,2,3,4,5) // 동적 리스트(변경 X)
    val item1 : MutableList<Int> = mutableListOf<Int>(1,2,3,4,5) // MutableList<Int>, mutableListOf 뒤에 <Int> 부분은 생략가능(위와 같이)

    item.add(6)
    item.remove(0)
}
