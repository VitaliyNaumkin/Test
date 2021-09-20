fun main(args: Array<String>) {

    if (args.isEmpty()) {
        println("Строка не передана в параметры командной строки")
    }

    args.sort()

    val wordsMap: MutableMap<String, Int> = LinkedHashMap()
    var countOfRepeats: Int?
    for (word in args) {
        countOfRepeats = wordsMap[word]

        if (countOfRepeats == null) {
            countOfRepeats = 0
        }
        wordsMap[word] = ++countOfRepeats
    }

    val keyWords: MutableList<String> = ArrayList(wordsMap.keys)

    var temp: String

    for (i in keyWords.indices) {
        for (j in 0 until keyWords.size-1) {

            if (wordsMap[keyWords[j]]!! < wordsMap[keyWords[j + 1]]!!) {
                temp = keyWords[j]
                keyWords[j] = keyWords[j + 1]
                keyWords[j + 1] = temp
            }
        }
    }

    println("отсортированные слова: ")

    println(keyWords)

    val sortedWordsList: MutableMap<String, Int?> = mutableMapOf()

    for (n in keyWords) {
        sortedWordsList[n] = wordsMap[n]
    }

    for (n in sortedWordsList) {
        println("${n.key}: ${n.value}")
    }
}

// the quick brown fox jumps over the lazy dog