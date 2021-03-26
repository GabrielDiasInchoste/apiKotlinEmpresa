package com.gabrieldias.pontointeligente.services.impl

import com.gabrieldias.pontointeligente.documents.Empresa
import com.gabrieldias.pontointeligente.repositories.EmpresaRepository
import com.gabrieldias.pontointeligente.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl (val empresaRepository: EmpresaRepository) : EmpresaService {

    override fun buscarPorCnpj(cnpj: String) = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa) = empresaRepository.save(empresa)

}
