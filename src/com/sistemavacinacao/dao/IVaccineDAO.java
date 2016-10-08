package com.sistemavacinacao.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.sistemavacinacao.entity.Person;
import com.sistemavacinacao.entity.Vaccine;

/**
 * Interface DAO da classe Vacina
 * @author luiz
 *
 */
public interface IVaccineDAO {
	
	/**
	 * Método que busca vacinas pendentes para pessoa na base de dados
	 * @param pgDB
	 * @param person
	 * @return
	 * @throws SQLException
	 */
	public List<Vaccine> selectAllPendingVaccinesForPerson(Connection pgDB, Person person) throws SQLException;

	
}
