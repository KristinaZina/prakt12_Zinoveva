import kotlinx.coroutines.*
suspend fun main(){
    try {
        var per1: Klass = Klass()
        var K = per1.Input()
        GlobalScope.launch {
            for (i in 1..K) {
                println("$i раз")
                per1.Operac()
            }
        }
        runBlocking { delay(30000L) }
    }catch(E:Exception)
    {
        println("Введите данные корректно")
    }
}