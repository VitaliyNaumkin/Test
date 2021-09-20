fun main(args: Array<String>) {

    if (args.isEmpty()) {
        println("Ничего не передано в параметры командной строки")
    }

    var wordsList: MutableSet<String> = sortedSetOf<String>()
    wordsList.addAll(args)

    for (n in wordsList) {
        println(n)
    }

}

// the quick brown fox jumps over the lazy dog