import kotlin.math.max
import kotlin.math.min
import kotlin.random.Random

fun main(){
    var i = 10
    var j = 20
    println(max(i,j)) // 최대값
    println(kotlin.math.max(i,j)) // Math를 사용해도 결과는 같지만 kotlin.math를 쓰는 것을 유도한다.
    println(min(i,j)) // 최소값

    val randomNumber= Random.nextInt(1,10) // ()안에 값의 범위를 적는다.
    println(randomNumber)

    val random = Random.nextDouble(1.0,5.0) // double형 중 1.0 ~ 5.0까지의 값을 얻는다.
    print(random)
}