import Models.Pessoa

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(Pessoa("Renato" , "055448877451" , "BRASILIA").toString())
        }
    }
}