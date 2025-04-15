import kotlinx.coroutines.*
suspend fun main() = coroutineScope {
    try {
        println("Ведите кол-во участников организации GitHub ")
        val x = readln().toInt()
        val polz = arrayOfNulls<Github>(x)
        for (i in 0..x - 1) {
            print(i + 1)
            println(" участник")
            println("Введите логин, пароль и кол-во репозиториев")
            polz[i] = Github(readln(), readln(), readln().toInt())
        }
        print("1 - Вывод участников\n2 - Блокировка " +
                "Выберите вариант: ")//вывод участников в порядке увеличения репозиториев
        when (readln().toInt())
        {
            1 -> {
                launch {
                    delay(1000L)
                    SortAndWrite(polz)
                }
                println("Загрузка участников организации GitHub")
                println("------------------------------------")
            }
            2 ->
            {
                println("Блокировка")
            }
        }
        runBlocking {
            delay(1000L)
        }
    }
    catch (e:Exception)
    {
        println("Неверный формат ввода")
    }
}

suspend fun SortAndWrite(users: Array<Github?>)//метод для сортировка
{
    for (i in 0..users.size-1)
    {
        for (j in 0..users.size - i - 2)
        {
            var one = users[j]?.kol_rep
            var two = users[j + 1]?.kol_rep
            if (one!! > two!!)
            {
                var temp = users[j]
                users[j] = users[j+1]
                users[j+1] = temp
            }
        }
    }
    for (i in 0..users.size-1)
    {
        println(users[i]?.login)
        println(users[i]?.password)
        println(users[i]?.kol_rep)
    }
}