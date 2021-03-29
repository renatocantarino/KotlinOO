import Models.Analista
import Models.Banco
import Models.TipoPessoa

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val dtclass = Banco("kotlin" , 1)
            val dtclass2 = dtclass.copy(nome = "banco 2")

            TipoPessoa.show().forEach { item -> println("${item.name} - ${item.descricao}  ")  }


            println(dtclass2)
            val analista = Analista( "01551" , 12225.00,  "Renato" , "055448877451" , TipoPessoa.PF, "BRASILIA")
            println(analista.matricula)
        }
    }
}