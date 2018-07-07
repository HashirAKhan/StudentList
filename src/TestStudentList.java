import java.util.*;

public class TestStudentList {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Nguyen","Christina",
					"Electrical Engineering", true, 6.5));
			studentList.add(new Student("Li","Angie",
							"Mathematics",true,8));
			studentList.add(new Student("Chen","Yu Feng",
							"Mathematics",false,9));
			studentList.add(new Student("Khan","Hashir",
							"Biological Sciences",false,12));
			studentList.add(new Student("Marin","Tayler",
							"Mechatronics",false,11));
			studentList.add(new Student("Mina","Andy",
							"Media",false,10));
			studentList.add(new Student("Middleton","Masiah",
							"Finance",false,10.5));
			studentList.add(new Student("Li","Simon",
							"Mechatronics",false,9));
			studentList.add(new Student("Zhong","Jeffrey",
							"Mathematics",false,10));
			studentList.add(new Student("Tom","Ethan",
							"Finance",false,8));
			studentList.add(new Student("Ngai","Richard",
							"Mechatronics",false,9.5));
			studentList.add(new Student("Pan","Zhen Yi",
							"Gateway",true,9.5));
			studentList.add(new Student("Zheng","Ye Cheng",
							"Chemistry",false,9.5));
			studentList.add(new Student("Loja","Luis",
							"Mathematics",false,7));
			studentList.add(new Student("Nasimov","Umarbek",
							"Aerospace",false,8.5));
			studentList.add(new Student("Andall Blake","Burlyn",
							"Biological Science",true,11));
			studentList.add(new Student("Tang","Carmen",
							"Industrial Design",true,7));
			studentList.add(new Student("Song","Kathy",
							"Law and Society",true,4.5));
			studentList.add(new Student("Shah","Divya",
							"Aerospace",true,7.5));
			studentList.add(new Student("Siddiqui","Hammad",
							"Chemistry",false,10));
			studentList.add(new Student("Paul","Lukasz",
							"Gateway",false,10));
			studentList.add(new Student("Hartley","Conor",
							"Industrial Design",false,8.5));
			studentList.add(new Student("Lei","Terry",
							"Finance",true,8));
			studentList.add(new Student("Zabin","Zaarib",
							"Civil Engineering",false,9.5));
			studentList.add(new Student("Sykakis","Nikos",
							"Law and Society",false,11));
			studentList.add(new Student("Hryhartsevich","Vlad",
							"Gateway",false,7));
			studentList.add(new Student("Gorovyy","Vova",
							"Gateway",false,9));
			studentList.add(new Student("Fang","Yuki",
							"Mechatronics",true,8));
			studentList.add(new Student("Huang","Amy",
							"Mechatronics",true,6));
			studentList.add(new Student("Liu","Sharon",
							"Industrial Design",true,7));
			studentList.add(new Student("Xue","David",
							"Mathematics",false,9.5));
			
//		for (int i = studentList.size() - 1; i > 0; i--) {
//			String currentMajor = studentList.get(i).getMajor();
//			
//			if (currentMajor.equals("Gateway")) {
//				studentList.remove(i);
//			}
//		}
			
		int i = 0;
		
		while (i < studentList.size()) {
			String currentMajor = studentList.get(i).getMajor();
			
			if (currentMajor.equals("Gateway")) {
				studentList.remove(i);
			} else {
				i++;
			}
		}
		
		for (Student s : studentList) {
			System.out.println(s);
		}
		
		System.out.println();
		
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(arg0)
	}

}
