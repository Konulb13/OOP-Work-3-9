package sample;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class GroupFileStorage {
    private String del = ",";
    public void saveGroupToCSV(Group gr) throws IOException{
    	File file = new File(gr.getGroupName()+".csv");
    	try(PrintWriter pw = new PrintWriter(file)){
    		for (Student student: gr.getListStudent()) {
    			if(student != null) {
    				pw.println(student.getName()+del+ student.getLastName()+del+ student.getId()+del+student.getGender()+del+student.getGroupName());
    			}
    		}
    	}
    }
    public Group loadGroupFromCSV(File file)  throws IOException{
    	String groupName = file.getName().substring(0,file.getName().lastIndexOf("."));
    	Group group = new Group(groupName);
    	try(Scanner sc= new Scanner(file)){
    		for(;sc.hasNextLine();) {
    			String studentS = sc.nextLine();
    			String[] parts = studentS.split(del);
    			String name = parts[0];
    			String lastName = parts[1];
    			int id = Integer.valueOf(parts[2]);
    			Gender gender = Gender.valueOf(parts[3]);
    			String grpName = parts[4];
    			Student student = new Student(id,name,grpName,lastName,gender);
    			try {
    				group.addStudent(student);}
    			catch (GroupOverflowException e ) {
    				e.printStackTrace();
    			}
    		} return group;
    	}	
   }
    public File findFileByGroupName(String groupName, File workFolder) {
		File[] file = workFolder.listFiles();
		if (file != null) {
			for (int i = 0; i < file.length; i++) {
				if (file[i].isFile() && file[i].getName().equals(groupName + ".csv")) {
					return file[i];
			}}
		}
		return null;
	}
}