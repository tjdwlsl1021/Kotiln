package com.example.myapplication

fun main() {
    helloworld();

    println(add(4, 5));

    val b: Int = 4 // 발 - 수정X
    var a: Int = 5 // 바지 - 수정O
    println("hello $a world")

    println("hello \$a world")

}

fun helloworld(): Unit {
    println("helloworld")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun maxBy2(a: Int, b: Int) = if (a < b) a else b

fun chechNum(score: Int) {
    when (score) {
        0 -> println("1")
        1 -> println("2")
    }

    var b = when (score) {
        0 -> 1
        2 -> 2
        else -> 4
    }

    when (score) {
        in 90..100 -> println("genuus")
        in 10..80 -> println("not")
    }
}


// Expression 값을 반환 하는 것 - 코틀린은 다 Expression, Unit이걸로 반환한다.
// Statement 이렇게 동작을 해라고 하는 것


// list
// 1. List 수정불가, 2. MutableList 수정가능
fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "d", 2.3f)
    val list2 = listOf(1, "d", 123L)

    array[0] = 3
    var result = list.get(0)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    // val 발 수정불가 arrayList는 그대로고 그 안에 값만 변하는 것

//    array = arrayListOf<Int>() // 다시 할당될 수 없다 val 발 수정X
}


// 반복분
fun forAndWhile() {
    val students = arrayListOf("a", "b", "c")

    for (name in students) {
        println("${name}")
    }

    var sum = 0
//    for(i in 1..10) { // 1부터 10까지
//    for(i in 1..10 step 2) { // 1부터 2씩 증가해서 10까지
//    for(i in 10 downTo 1) { // 10부터 1까지 감소
    for (i in 1 until 100) { // 1부터 99까지, 100포함X
        sum += i
    }
    println(sum)

    var index = 0
    while (index < 10) {
        println("current index : ${index}")
        index++;
    }

    for ((index, name) in students.withIndex()) {
        println("${index + 1}번째 : ${name}")
    }
}


// Nullable / NonNull

//null에러를 컴파일 시점에 못 잡고, 런타임에서 잡을 수 있었다.
// 그걸 컴파일 시점에 잡기 위해서
fun nullcheck() {
    // NPE : NULL point Exception

    var name: String = "joyce"
    var nullName: String? = null // ? 물음표를 붙이면 null허용

    var nameInUpperCase = name.toUpperCase()

//    var nullNameInUpperCase = nullName.toUpperCase() // nullName이 null인지 아닌지 몰라서 표시를 해줘야한다. ?물음표 추가
    var nullNameInUpperCase = nullName?.toUpperCase() // nullName이 null인지 아닌지 몰라서 표시를 해줘야한다. ?물음표 추가

    // 컴파일 시점에 null인걸 알려주니까 런타임에서는 null에러가 나지 않느다.

    // ?:
    var lastName: String? = null
    val fullName = name + " " + (lastName
        ?: "No lastName") // lastName있으면 이거 출력, 없으면 No lastName 출력, default값 만든거
    // 엘비스 연산자

    // !! 널 아니다라는걸 알려주는 값
}

fun ignoreNulls(str: String?) {
//    val mNotNull : String = str // 에러표시
    val mNotNull: String = str!! // 절대로 널 되지 않는경우 선언 <- 확실한 경우에만 사용, 아니면 널 에러남

    val email: String? = "tjdwlsl@abc.com"
    email?.let {
        // email이 널이 아니면 동작
        println("email is ${email}")
    }
}
