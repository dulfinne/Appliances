package by.tc.task01.dao;

import java.io.FileNotFoundException;
import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public interface FindApplianceDAO
{
	List<Appliance> find(Criteria criteria) throws DAOException, FileNotFoundException;
}
