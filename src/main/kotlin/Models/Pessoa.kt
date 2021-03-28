package Models

import org.jetbrains.annotations.NotNull

class Pessoa(nome: String, cpf: String , tipoPessoa: TipoPessoa, cidade: String) {

    @NotNull
    var _nome : String =  if(nome.isNullOrBlank()) throw IllegalArgumentException("Name cannot be blank") else nome

    @NotNull
    var _cpf: String = if(cpf.isNullOrBlank()) throw IllegalArgumentException("Cpf cannot be blank") else  cpf

    @NotNull
    var _cidade: String = cidade

    var _tipoPessoa: TipoPessoa = tipoPessoa


    inner class Endereco()
    {
        var completo  =  _cidade
    }


    override fun toString(): String =  "Nome => ${_nome} Cpf => ${_cpf} - Tipo => ${_tipoPessoa} - Endereco => ${this.Endereco().completo}"
}