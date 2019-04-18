fun main(args: Array<String>) {
    var lists= listOf("买子弹","买炸弹","买飞机","买坦克")
    for((i,e) in lists.withIndex())
    {
        println("$i $e")
    }
}