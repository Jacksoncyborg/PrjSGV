package com.sistemavacinacao.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.sistemavacinacao.entity.Person;

/**
 * Interface DAO da classe Person
 * @author luiz
 *
 */
public interface IPersonDAO {
	
	/**
	 * Método responsável por inserir registros na base de dados
	 * @param pgDB
	 * @param person
	 * @return
	 * @throws SQLException
	 */
	public Boolean insertPerson(Connection pgDB, Person person) throws SQLException;
	
	/**
	 * Método responsável por buscar todos os registros de pessoas da base de dados
	 * @param pgDB
	 * @return
	 * @throws SQLException
	 */
	public List<Person> selectAllPeople(Connection pgDB) throws SQLException;
	
	/**
	 * Método responsável por buscar registro de uma pessoa na base de dados
	 * @param pgDB
	 * @param cpf
	 * @return
	 * @throws SQLException
	 */
	public List<Person> selectPerson(Connection pgDB, Long cpf) throws SQLException;
	
	/**
	 * Método responsável por deletar registro de uma pessoa na base de dados
	 * @param pgDB
	 * @param person
	 * @return
	 * @throws SQLException
	 */
	public Boolean deletePerson(Connection pgDB, Person person) throws SQLException;
	
	/**
	 * Método responsável por atualizar registro de pessoa na base de dados
	 * @param pgDB
	 * @param person
	 * @return
	 * @throws SQLException
	 */
	public Boolean updatePerson(Connection pgDB, Person person) throws SQLException;
	
	/**
	 * Método responsável por fazer login no sistema
	 * @param pgDB
	 * @param user
	 * @param password
	 * @return
	 * @throws SQLException
	 */
//	public Boolean login(Connection pgDB, String user, String password) throws SQLException;

}
