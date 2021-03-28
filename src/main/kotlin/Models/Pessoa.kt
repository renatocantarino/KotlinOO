package Models

class Pessoa(nome: String, cpf: String , cidade: String) {

    var _nome : String = nome
    var _cpf: String = cpf
    var _cidade: String = cidade


    inner class Endereco()
    {
        var completo  =  _cidade
    }


    override fun toString(): String =  "Nome => ${_nome} Cpf => ${_cpf} - Endereco => ${this.Endereco().completo}"
}