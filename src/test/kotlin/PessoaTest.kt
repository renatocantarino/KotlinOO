import Models.Analista
import Models.TipoPessoa
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith


class PessoaTest {

    @Test
    fun CriaAnalistaPessoaBrasilia()
    {
        val pessoa = Analista( "01551" , 12225.00,  "Renato" , "055448877451" , TipoPessoa.PF, "BRASILIA")
        Assertions.assertEquals("Brasilia", pessoa.cidade)
    }

    @Test
    fun AnalistaSemNomeErro()
    {
        val exception = assertFailsWith<IllegalArgumentException> {  val pessoa = Analista( "01551" , 12225.00,  "Renato" , "055448877451" , TipoPessoa.PF, "BRASILIA")}
        assertEquals("Name cannot be blank", exception.message)
    }

    @Test
    fun AnalistaSemCpfErro()
    {
        val exception = assertFailsWith<IllegalArgumentException> {  val pessoa = Analista( "01551" , 12225.00,  "Renato" , "055448877451" , TipoPessoa.PF, "BRASILIA") }
        assertEquals("Cpf cannot be blank", exception.message)
    }
}