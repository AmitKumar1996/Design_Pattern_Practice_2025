package Java_8;

import java.util.stream.Collectors;

public class Patients {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<Integer> NoBill=list.stream().map(patient-> patient.isBilled== null).collect(Collectors.toList());
		

	}

}
