package Models

class Pessoa {
    var nome :String = "renato"
    var cpf: String = "05441447784"


    inner class Endereco
    {
        var completo  = "BRASILIA"
    }


    override fun toString(): String =  "Nome => ${nome} Cpf => ${cpf} - Endereco => ${this.Endereco().completo}"
}