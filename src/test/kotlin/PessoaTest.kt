import Models.Pessoa
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith


class PessoaTest {

    @Test
    fun CriaPessoaBrasilia()
    {
        val pessoa = Pessoa("renato", "01185983171" , "Brasilia")
        Assertions.assertEquals("Brasilia", pessoa._cidade)
    }

    @Test
    fun PessoaSemNomeErro()
    {
        val exception = assertFailsWith<IllegalArgumentException> {  val pessoa = Pessoa("", "01185983171" , "Brasilia") }
        assertEquals("Name cannot be blank", exception.message)
    }

    @Test
    fun PessoaSemCpfErro()
    {
        val exception = assertFailsWith<IllegalArgumentException> {  val pessoa = Pessoa("renato", "" , "Brasilia") }
        assertEquals("Cpf cannot be blank", exception.message)
    }
}