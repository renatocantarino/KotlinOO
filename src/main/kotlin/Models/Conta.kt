package Models

import java.math.BigDecimal

class Conta(
    val agencia: String,
    val numero: String,
    val saldo: BigDecimal,
)
{

    fun deposito(valor: BigDecimal)
    {
        //this.saldo += valor;
    }

    fun saque(valor: BigDecimal)
    {
        //this.saldo -= valor;
    }



}