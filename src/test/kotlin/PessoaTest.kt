import Models.Pessoa
import Models.TipoPessoa
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith


class PessoaTest {

    @Test
    fun CriaPessoaBrasilia()
    {
        val pessoa = Pessoa("renato", "0118598344" , TipoPessoa.PJ,  "Brasilia")
        Assertions.assertEquals("Brasilia", pessoa._cidade)
    }

    @Test
    fun PessoaSemNomeErro()
    {
        val exception = assertFailsWith<IllegalArgumentException> {  val pessoa = Pessoa("", "0118598344" ,  TipoPessoa.PJ, "Brasilia") }
        assertEquals("Name cannot be blank", exception.message)
    }

    @Test
    fun PessoaSemCpfErro()
    {
        val exception = assertFailsWith<IllegalArgumentException> {  val pessoa = Pessoa("renato", "" ,  TipoPessoa.PJ,  "Brasilia") }
        assertEquals("Cpf cannot be blank", exception.message)
    }
}