package Models.base

import Models.TipoPessoa

abstract class Pessoa(val nome: String,
                      val cpf: String,
                      val tipoPessoa: TipoPessoa,
                      val cidade: String) {



}