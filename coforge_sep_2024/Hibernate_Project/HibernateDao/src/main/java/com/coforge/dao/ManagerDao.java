package com.coforge.dao;

import com.coforge.exception.ManagerException;
import com.coforge.model.Manager;

import java.util.List;

public interface  ManagerDao {

    public List<Manager> getAllManagers() throws ManagerException;
    public Manager addManager(Manager manager) throws ManagerException;
    public Manager searchManager(long id) throws ManagerException;
    public Manager deleteManager(long id) throws ManagerException;
    public Manager updateManager(Manager manager) throws ManagerException;

}
