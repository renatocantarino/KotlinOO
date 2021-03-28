package Models

enum class TipoPessoa(val descricao: String) {
    PF("Pessoa fisica"),
    PJ("Pessoa Juridica");


    companion object {
        fun show() = TipoPessoa.values()
    }
}