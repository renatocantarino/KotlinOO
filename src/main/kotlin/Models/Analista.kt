package Models

import java.math.BigDecimal

class Analista(matricula: String, salario: Double, nome: String,
               cpf: String, tipoPessoa: TipoPessoa, cidade: String
) : Funcionario(matricula, salario, nome, cpf, tipoPessoa, cidade) {


    override fun CalculaAuxilioAlimentacao(): Double = salario * 0.1

}