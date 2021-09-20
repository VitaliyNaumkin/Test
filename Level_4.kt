fun main(args: Array<String>) {

    if (args.isEmpty()) {
        println("Строка не передана в параметры командной строки")
    }

    args.sort()

    var wordsList: MutableMap<String, Int> = mutableMapOf()


    var countOfRepeats: Int?

    for (n in args) {

        countOfRepeats = wordsList[n]

        if (countOfRepeats == null) {
            countOfRepeats = 0
        }

        wordsList[n] = ++countOfRepeats

    }

    for (n in wordsList) {
        println("${n.key}: ${n.value}")
    }
}
