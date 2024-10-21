fun main(){
    /* 삼항 연산
     자바: boolean max2 = l > 10 ? true : false; */
    var l = 5
    var result = if(l > 10) true else false // 위의 코드를 코틀린으로

    var i = 5;
    // if문
    if(i > 10)
        println("10보다 크다") // 한 줄이면 중괄호를 생략할 수 있다.
    else if (i > 5)
        println("5보다 크다")
    else
        println("5보다 같거나 작다")

    var result1 = if(i > 10) // 리턴되는 값을 받는 변수
        "10보다 크다" // 리턴되는 값
    else if (i > 5)
        "5보다 크다"
    else
        "5보다 같거나 작다" // if문을 식으로 취급할 수 있다.
    println(result1)

    // when문
    when {
        i > 10 -> println("10보다 크다")
        i > 5 -> println("5보다 크다")
        else -> println("")
    }

    var result2 = when { // when문도 식으로 취급할 수 있다.
        i > 10 -> "10보다 크다"
        i > 5 -> "5보다 크다"
        else -> "5보다 같거나 작다"
    }
    println(result2)
}