package abstracT;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Test98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> l1= new ArrayList<>();
		List<String> l2=new ArrayList<>();

		l1.add("AA");
		l1.add("BB");
		l1.add("CC");
		
		l2.add("CC");
		l2.add("DD");
		l2.add("AA");
		
	//	List<String> newList=new ArrayList<>();
		
		List<String> collect = l1.stream().filter(i->i.startsWith("AA")).collect(Collectors.toList());
		List<String> collect1 = l2.stream().filter(i->i.startsWith("AA")).collect(Collectors.toList());
		
		collect.add(collect1.get(0));
		System.out.println(collect);
		
		
		
		
	}

}
