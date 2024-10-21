fun main(){
    val items = listOf(1,2,3,4,5)

    // 자바: for(int i = 0; i < 3; i++)
    for(i in 0..(items.size-1)){ // 위의 코드를 코틀린으로
        print(items[i])
    }

    for(item in items){ // for in으로 접근한다. (for-each과 유사)
        print(item)
    }

    items.forEach { item -> // for-each문
        print(item)
    }

    // while 문 (자바와 동일하다.)
    var i: Int = 1
    while(i <= 5){
        print(i)
        i++
    }

    // do- while문 (자바와 동일하다.)
    do{
        i--
        print(i)
    }while(i > 1)

    // break와 continue도 자바와 동일하다.
}