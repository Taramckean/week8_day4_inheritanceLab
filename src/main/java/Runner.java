import db.DBHelper;
import db.DBManager;
import models.Administrator;
import models.Department;
import models.Manager;
import sun.security.pkcs11.Secmod;

import java.util.List;

public class Runner {

	public static void main(String[] args) {
		Manager manager1 = new Manager("Tara", 456789, 5000000, 5000);
		DBHelper.saveOrUpdate(manager1);

		Department department1 = new Department("Finance", manager1);
		DBHelper.saveOrUpdate(department1);

		Administrator administrator1 = new Administrator("Matt", 5678, 20, manager1);
		DBHelper.saveOrUpdate(administrator1);
		Administrator administrator2 = new Administrator("Steve", 8465, 150, manager1);
		DBHelper.saveOrUpdate(administrator2);

		Administrator foundAdmin = DBHelper.find(Administrator.class, administrator1.getId());


		List<Administrator> adminEmployeesForManager = DBManager.getEmployeesForManager(manager1);

		Department whichDepartment = DBManager.getDepartment(manager1);


	}
}
