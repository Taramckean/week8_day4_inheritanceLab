import db.DBHelper;
import db.DBManager;
import models.Administrator;
import models.Manager;

import java.util.List;

public class Runner {

	public static void main(String[] args) {
		Manager manager1 = new Manager("Tara", 456789, 5000000, 5000, "Boss department");
		DBHelper.saveOrUpdate(manager1);

		Administrator administrator1 = new Administrator("Matt", 5678, 20, manager1);
		DBHelper.saveOrUpdate(administrator1);
		Administrator administrator2 = new Administrator("Steve", 8465, 150, manager1);
		DBHelper.saveOrUpdate(administrator2);

		Administrator foundAdmin = DBHelper.find(Administrator.class, administrator1.getId());

		List<Administrator> adminEmployeesForManager = DBManager.getEmployeesForManager(manager1);


	}
}
