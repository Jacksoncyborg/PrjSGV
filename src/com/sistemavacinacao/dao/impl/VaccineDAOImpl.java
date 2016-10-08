package com.sistemavacinacao.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.sistemavacinacao.dao.IVaccineDAO;
import com.sistemavacinacao.entity.Person;
import com.sistemavacinacao.entity.Vaccine;

/**
 * Classe responsável por implementar a interface IVaccineDAO
 * @author luiiz
 *
 */
public class VaccineDAOImpl implements IVaccineDAO{

	@Override
	public List<Vaccine> selectAllPendingVaccinesForPerson(Connection pgDB, Person person) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
