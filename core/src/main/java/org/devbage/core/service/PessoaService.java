package org.devbage.core.service;

import javax.enterprise.context.ApplicationScoped;

import org.devbage.core.model.Pessoa;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class PessoaService implements PanacheRepository<Pessoa> {

}