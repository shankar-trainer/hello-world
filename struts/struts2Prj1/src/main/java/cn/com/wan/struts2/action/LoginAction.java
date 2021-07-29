package cn.com.wan.struts2.action;

import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.HashSet;  
import java.util.List;  
import java.util.Map;  
import java.util.Set;  
  


import org.apache.struts2.interceptor.RequestAware;  
import org.apache.struts2.interceptor.SessionAware;  
  


import cn.com.wan.struts2.vo.Student;
import cn.com.wan.struts2.vo.User;

import com.opensymphony.xwork2.ActionSupport;  
  
@SuppressWarnings({"serial", "unchecked"})  
public class LoginAction extends ActionSupport implements RequestAware,SessionAware {  
    private User user;  
	private List testList = new ArrayList();  
    private Set testSet = new HashSet();  
    private Map testMap = new HashMap();  
    private List stus = new ArrayList();  
      
    /* 以上五个属性的setter和getter略 */  
      
    private Map request;  
    private Map session;  
    public void setRequest(Map request) {  
        this.request = request;  
    }  
    public void setSession(Map session) {  
        this.session = session;  
    }  
      
    public static String getStatic(){  
        return "这是LoginAction中的一个静态方法";  
    }  
    public String getCommon(){  
        return "这是LoginAction中的一个普通方法";  
    }  
      
    @Override  
    public String execute() throws Exception {  
        if(user.getUsername().trim().equalsIgnoreCase("admin") && user.getPassword().equals("jadyer")){  
            testList.add("list11");  
            testList.add("list22");  
            testList.add("list33");  
            testList.add("list44");  
            testList.add("list55");  
              
            testSet.add("set11");  
            testSet.add("set22");  
            testSet.add("set33");  
            testSet.add("set22");  
            testSet.add("set11");  
              
            testMap.put("m11", "map11");  
            testMap.put("m22", "map22");  
            testMap.put("m33", "map33");  
            testMap.put("m44", "map44");  
            testMap.put("m55", "map55");  
              
            stus.add(new Student("张三",88));  
            stus.add(new Student("李四",77));  
            stus.add(new Student("王五",66));  
            stus.add(new Student("马六",55));  
              
            request.put("req", "这是通过OGNL中的#号获取的request属性范围的值");  
            session.put("ses", "这是通过OGNL中的#号获取的session属性范围的值");  
            request.put("BB", "这是通过OGNL中的#号获取的request属性范围的BB");  
            session.put("BB", "这是通过OGNL中的#号获取的session属性范围的BB");  
            return SUCCESS;  
        }else{  
            return INPUT;  
        }  
    }
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List getTestList() {
		return testList;
	}
	public void setTestList(List testList) {
		this.testList = testList;
	}
	public Set getTestSet() {
		return testSet;
	}
	public void setTestSet(Set testSet) {
		this.testSet = testSet;
	}
	public Map getTestMap() {
		return testMap;
	}
	public void setTestMap(Map testMap) {
		this.testMap = testMap;
	}
	public List getStus() {
		return stus;
	}
	public void setStus(List stus) {
		this.stus = stus;
	}  
}  