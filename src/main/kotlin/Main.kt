import java.lang.Exception

fun main(args: Array<String>) {
    var firstCollection = ArrayDeque<Float>()
    var secondCollection = arrayListOf<Float>()

    while(true) {
        println("Введите элементы первой коллекции (ввести литерал любого типа данных, который невозможно преоброзовать в тип float для завершения ввода элементов):")
        while (true) {
            try {
                firstCollection.addLast(readLine()!!.toFloat())
            } catch (e: Exception) {
                break
            }
        }
        if (firstCollection.size > 1) {
            var firstelem: Float = firstCollection.removeFirst()
            var lastelem: Float = firstCollection.removeLast()
            firstCollection.addFirst(lastelem)
            firstCollection.addLast(firstelem)
        }

        println("Введите элементы второй коллекции (ввести литерал любого типа данных, который невозможно преоброзовать в тип float для завершения ввода элементов):")
        while (true) {
            try {
                secondCollection.add(readLine()!!.toFloat())
            } catch (e: Exception) {
                break
            }
        }
        var SecondAverage: Float = secondCollection.average().toFloat()
        for (i in 0 until secondCollection.size) {
            secondCollection[i] = SecondAverage
        }

        println(firstCollection.toString())
        println(secondCollection.toString())
        println("===========================================================================================")
    }
}