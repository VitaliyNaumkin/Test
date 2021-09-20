import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.LinkedHashMap

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val inputString: String
    var words: MutableList<String> = ArrayList()

    if (args.isEmpty()) {
        println("Строка не передана в параметры командной строки")
        print("Введите текст:")

        inputString = scan.nextLine()

        words = inputString.split(" ") as MutableList<String>

    } else {
        for (word in args) {
            words.add(word)
        }
    }


    words.sort()

    val wordsMap: MutableMap<String, Int> = LinkedHashMap()
    var countOfRepeats: Int?
    for (word in words) {
        countOfRepeats = wordsMap[word]

        if (countOfRepeats == null) {
            countOfRepeats = 0
        }
        wordsMap[word] = ++countOfRepeats
    }

    val keyWords: MutableList<String> = ArrayList(wordsMap.keys)

    var temp: String

    for (i in keyWords.indices) {
        for (j in 0 until keyWords.size - 1) {

            if (wordsMap[keyWords[j]]!! < wordsMap[keyWords[j + 1]]!!) {
                temp = keyWords[j]
                keyWords[j] = keyWords[j + 1]
                keyWords[j + 1] = temp
            }
        }
    }

    
    val sortedWordsList: MutableMap<String, Int?> = mutableMapOf()

    for (n in keyWords) {
        sortedWordsList[n] = wordsMap[n]
    }

    for (n in sortedWordsList) {
        println("${n.key}: ${n.value}")
    }
}

// the quick brown fox jumps over the lazy dog