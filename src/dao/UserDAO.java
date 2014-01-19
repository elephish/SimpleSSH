package dao;

import po.WebUser;

public interface UserDAO {
	
	public WebUser queryByName(String name);
	public void save(WebUser user);
}