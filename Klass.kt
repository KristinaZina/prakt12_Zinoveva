class Klass {
    fun Input():Int{
        println("введите сколько раз вы хотите выполнить действие")
        val n= readLine()!!.toInt()
        if (n>0)
        {
            return n
        }
        else
        {
            println("количество действий дожно быть боьше 0")
            return 1
        }
    }
    fun Operac(){
        try {
            println("введите первое число")
            var a= readLine()!!.toDouble()
            println("введите второе число")
            var b= readLine()!!.toDouble()
            if (a>0&&b>0)
            {
                println("Выберите операцию")
                println("1- сложение, 2- вычитание, 3- умножение, 4- деление")
                var oper = readLine()!!.toInt()
                if (oper == 1) {
                    val otv1 = (a + b)
                    println("Ответ = $otv1")
                } else
                    if (oper == 2) {
                        val otv2 = (a - b)
                        println("Ответ = $otv2")
                    } else
                        if (oper == 3) {
                            val otv3 = (a * b)
                            println("Ответ = $otv3")
                        } else
                            if (oper == 4) {
                                val otv4 = (a % b)
                                println("Ответ = $otv4")
                            }
            }
        }
        catch(E:Exception)
        {
            println("Введите данные корректно")
        }
    }
}




