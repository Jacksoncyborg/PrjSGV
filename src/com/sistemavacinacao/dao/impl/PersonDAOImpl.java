package com.sistemavacinacao.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.sistemavacinacao.dao.IPersonDAO;
import com.sistemavacinacao.entity.Person;

/**
 * Classe responsável por implementar a interface IPersonDAO
 * @author luiz
 *
 */
public class PersonDAOImpl implements IPersonDAO{

	@Override
	public Boolean insertPerson(Connection pgDB, Person person) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> selectAllPeople(Connection pgDB) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> selectPerson(Connection pgDB, Long cpf) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deletePerson(Connection pgDB, Person person) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updatePerson(Connection pgDB, Person person) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
