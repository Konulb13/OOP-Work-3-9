package sample;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Group {
	private String groupName;
	private List<Student>listStudent;

public Group(String groupName) {
		super();
		this.groupName = groupName;
		this.listStudent =new ArrayList<> ();
	}

	public Group() {
	super();
}

	public String getGroupName() {
	return groupName;
}

public void setGroupName(String groupName) {
	this.groupName = groupName;
}

public List<Student> getListStudent() {
	return listStudent;
}

public void setListStudent(List<Student> listStudent) {
	this.listStudent = listStudent;
}

	@Override
public int hashCode() {
	return Objects.hash(groupName, listStudent);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Group other = (Group) obj;
	return Objects.equals(groupName, other.groupName) && Objects.equals(listStudent, other.listStudent);
}


	public void addStudent(Student student) throws GroupOverflowException {
		if(listStudent.size()<10 ) {
			listStudent.add(student);
			}else 
		throw new GroupOverflowException();
	}

	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
		for (int i = 0; i < listStudent.size(); i++) {
				if (listStudent.get(i).getLastName().equals(lastName))
					return listStudent.get(i);
		}
		throw new StudentNotFoundException();
	}

	public boolean removeStudentByID(int id) {
		for (int i = 0; i < listStudent.size(); i++) {
				if (listStudent.get(i).getId() == id) {
					listStudent.remove(i);
					return true;
			}
		}
		return false;
	}

	public void sortStudentsByLastName() {
		Collections.sort(this.listStudent, Comparator.nullsFirst(new StudentLastNameComparator()));
	
	}
	

	@Override
	public String toString() {
		return "Group [groupName = " + groupName + "\n" +", listStudent = "	+ listStudent + "]";
	}

	public boolean eqequivalentStudent() {
		 for (int i = 0; i < listStudent.size(); i++) {
	            for (int j = i + 1; j < listStudent.size(); j++) {
	                if (listStudent.get(i).equals(listStudent.get(j))) {
	                    return true;
	                }
	            }
	        }
	        return false;	}
}