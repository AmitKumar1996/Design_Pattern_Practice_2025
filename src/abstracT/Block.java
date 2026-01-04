package abstracT;

public class Block  
{    
	
//	4️⃣ Official Rule (Interview Answer)
	
	//  From Java 7 onwards, a Java program cannot run without a main() method, even if static blocks are present.
	
	
	
	
    // 🔍 Static Block-1
    // This block runs when the class is loaded—only once.
    static  
    {  
        System.out.println("Static Block-1");  
    }    

    public static void main(String args[])  
    {    
        // ✅ This runs after all static blocks.
        System.out.println("Main Method");    
    }    

    // 🔍 Static Block-2
    // Multiple static blocks are allowed.
    // They execute in the order they appear in the class.
    static  
    {  
        System.out.println("Static Block-2");  
    }   
}

/*
🔍 Key Concepts:
1. Static blocks are executed once when the class is loaded, before the main() method.
2. If there are multiple static blocks, they execute in the order they appear in the class.
3. These blocks are often used for static initializations (e.g., loading drivers, setting up config).

✅ Output:
Static Block-1
Static Block-2
Main Method
*/
