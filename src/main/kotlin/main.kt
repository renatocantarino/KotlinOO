import Models.Banco
import Models.Pessoa
import Models.TipoPessoa

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val dtclass = Banco("kotlin" , 1)
            val dtclass2 = dtclass.copy(nome = "banco 2")

            TipoPessoa.show().forEach { item -> println("${item.name} - ${item.descricao}  ")  }


            println(dtclass2)
            println(Pessoa("Renato" , "055448877451" , TipoPessoa.PF, "BRASILIA").toString())
        }
    }
}