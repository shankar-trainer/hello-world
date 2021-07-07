
public class DoctorMain {

	public static void main(String[] args) {
		Doctor doctor[]=new Doctor[4];
		
		int regId[]= {10009,1007,1005,1004};
		String name[]= {"s kumar","depmala","vaijanti","urmila devi"};
		float salary[]= {90000,80000, 92000,67000};
		String degree[]= {"MBBS","BAMS","BHMS","BUMS"};
		String location[]= {"chennai","madurai","kanchipuram","ooty"};
		
		for (int i = 0; i < degree.length; i++) {
			doctor[i]=new Doctor();
			doctor[i].setRegNo(regId[i]);
			doctor[i].setName(name[i]);
			doctor[i].setDegree(degree[i]);
			doctor[i].setSalary(salary[i]);
			doctor[i].setLocation(location[i]);
		}
		
		for (Doctor d:doctor) {
			System.out.println(d.getRegNo()+"  "+d.getName()+"  "+d.getSalary()+"   "
		+d.getDegree()+"  "+d.getLocation() );
		}
		
	}
}
