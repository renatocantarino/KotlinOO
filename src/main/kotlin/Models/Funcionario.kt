package Models

import Models.base.Pessoa
import java.math.BigDecimal

abstract class Funcionario(
    val matricula: String,
    val salario : Double,
    nome: String,
    cpf: String ,
    tipoPessoa: TipoPessoa,
    cidade: String
) : Pessoa(nome ,cpf , tipoPessoa ,cidade ) {

   protected abstract fun  CalculaAuxilioAlimentacao(): Double

}