package com.gabrieldias.pontointeligente.repositories

import com.gabrieldias.pontointeligente.documents.Funcionario
import org.springframework.data.mongodb.repository.MongoRepository

interface FuncionarioRepository: MongoRepository<Funcionario, String> {

    fun findByCpf(cpf: String): Funcionario?

    fun findByEmail(email: String): Funcionario?

}
