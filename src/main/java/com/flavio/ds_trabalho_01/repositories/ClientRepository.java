package com.flavio.ds_trabalho_01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flavio.ds_trabalho_01.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
