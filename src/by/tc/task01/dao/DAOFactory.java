package by.tc.task01.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import by.tc.task01.dao.impl.TxTFindApplianceDAO;

public final class DAOFactory {

	private static final DAOFactory instance = new DAOFactory();

	private final FindApplianceDAO findApplianceDAO = new TxTFindApplianceDAO();

	private DAOFactory() {
	}

	public FindApplianceDAO getFindApplianceDAO() {
		return findApplianceDAO;
	}

	public static DAOFactory getInstance() {
		return instance;
	}
}