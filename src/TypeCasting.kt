fun main(){
    var i = 10
    var l = 20L

    // 업캐스팅, 다운캐스팅 모두 .to데이터형()을 해야한다.
    var name = "Kotlin"
    name = i.toString()

    l = i.toLong()
    i = l.toInt()
}