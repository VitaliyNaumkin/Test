fun main(args: Array<String>) {

    if (args.isEmpty()) {
        println("Ничего не передано в параметры командной строки")
    }

    var wordsList: ArrayList<String> = arrayListOf<String>()
    wordsList.addAll(args)

    wordsList.sort()

    for (n in wordsList) {
        println(n)
    }
    
}