package StdProject;


import java.util.LinkedList;
import java.util.Scanner;

// Class
public class StudentManagement {

	// Creating an empty LinkedList
	LinkedList<Student> list;

	// Default Constructor
	public StudentManagement()
	{
		list = new LinkedList<>();
	}

	// Method 1
	// Adding Record
	// @param record
	public void add(Student student)
	{

		// Checking if a record already exists or not,
		// if not add it to Record list, Otherwise
		// error display message
		if (!find( student.getIdNumber())) {
			list.add( student);
		}
		else {

			// Print statement
			System.out.println(
				"Record already exists in the Record list");
		}
	}

	// Method 2
	// Searching Record
	// @param idNumber
	// @return
	public boolean find(int idNumber)
	{

		// Iterating record list
		// using for each loop
		for ( Student l : list) {

			// Checking record by id Number
			if (l.getIdNumber() == idNumber) {

				System.out.println(l);
				return true;
			}
		}
		return false;
	}

	// Method 3
	// Delete Record
	// @param recIdNumber
	public void delete(int recId)
	{
		Student studentDel = null;

		// Iterating record list
		for (Student ll : list) {

			// Finding record to be deleted by id Number
			if (ll.getIdNumber() == recId) {
				studentDel = ll;
			}
		}

		// If recordDel is null, then show error message,
		// otherwise remove the record from Record list
		if (studentDel == null) {

			// Displaying no record found
			System.out.println("Invalid record Id");
		}
		else {

			list.remove(studentDel);

			// Display message for successful deletion of
			// record
			System.out.println(
				"Successfully removed record from the list");
		}
	}

	// Method 4
	// Finding Record
	// @param idNumber
	// @return
	public  Student findStudent(int idNumber)
	{

		// Iterate Record list
		// using for each loop
		for ( Student l : list) {

			// Checking record by id Number.
			if (l.getIdNumber() == idNumber) {
				return l;
			}
		}

		return null;
	}

	// Method 5
	// Update Record
	// @param id
	// @param input
	public void update(int id, Scanner input)
	{

		if (find(id)) {
            Student rec = findStudent(id);

			// Display message only
			System.out.print(
				"What is the new Student id Number ? ");
			@SuppressWarnings("unused")
            int idNumber = input.nextInt();

			// Display message only
			System.out.print(
				"What is the new Student contact Number ");
			int contactNumber = input.nextInt();
			input.nextLine();

			// Display message only
			System.out.print(
				"What is the new Student Name ? ");
			String name = input.nextLine();

			rec.setIdNumber(id);
			rec.setName(name);
			rec.setContactNumber(contactNumber);
			System.out.println(
				"Record Updated Successfully");
		}
		else {

			// Print statement
			System.out.println(
				"Record Not Found in the Student list");
		}
	}

	// Method 6
	// Display Records
	public void display()
	{

		// If record list is empty then
		// print the message below
		if (list.isEmpty()) {

			// Print statement
			System.out.println("The list has no records\n");
		}
		// Iterating Record list
		// using for each loop
		for (Student student: list) {

			// Printing the list
			System.out.println(student.toString());
		}
	}
}


