package com.gabrieldias.pontointeligente.services.impl

import com.gabrieldias.pontointeligente.documents.Funcionario
import com.gabrieldias.pontointeligente.repositories.FuncionarioRepository
import com.gabrieldias.pontointeligente.services.FuncionarioService
import org.springframework.stereotype.Service

@Service
class FuncionarioServiceImpl (val funcionarioRepository: FuncionarioRepository) : FuncionarioService {

    override fun persistir(funcionario: Funcionario) = funcionarioRepository.save(funcionario)

    override fun buscarPorCpf(cpf: String) = funcionarioRepository.findByCpf(cpf)

    override fun buscarPorEmail(email: String) = funcionarioRepository.findByEmail(email)

    override fun buscarPorId(id: String) = funcionarioRepository.findById(id).get()

}
