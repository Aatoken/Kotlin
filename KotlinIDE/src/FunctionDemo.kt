fun main(args: Array<String>) {

    var i = { a: Int, b: Int -> a + b }

    var k:(Int,Int)->Int={x,y->x+y}
    println(i(3,4))
    println(k(4,5))

    println(ollAll(5))

    println(ollAll1(5,0))
}

fun ollAll(num:Int):Int
{

    if (num==1)
    {
        return 1;
    }else{
        return num+ollAll(num-1)
    }
}

 tailrec fun ollAll1(num:Int,result:Int):Int{
    if (num==1)
    {
        return result+1 ;
    }else{
       return ollAll1(num-1,result+num)
    }
} 