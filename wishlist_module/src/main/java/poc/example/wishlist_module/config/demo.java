package poc.example.wishlist_module.config;

public class demo {
	

	
	public static void main(String [] args) {
		
		String s1 = "organization";
		String s2 = "industry";
		

		System.out.println(s1.charAt(0));
		System.out.println(s2.concat(s1));
		System.out.println(s1.contains("o"));
		System.out.println(s1.endsWith("n"));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.indexOf(1));
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.isEmpty());
		System.out.println(s1.length());
		System.out.println(s1.lastIndexOf("o"));
		System.out.println(s1.replace("o", "A"));
		System.out.println(s1.startsWith("s"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.trim());  // remove spaces between strings
		System.out.println(s1.split(s2));
		System.out.println(s1.substring(2, 5)); //from start endex and end index will print the string
		
		String s3 = "organization,industry,facilities";
		String s4 = ",";  //split method takes regular expression argement
		String[] v2solutions = s3.split(s4); //<---------------------
		for(String elements:v2solutions) {
			System.out.println(elements);
			
	    System.out.println(s1.replace("o", "z"));
	    
	    String s = "v2 organization";
	    System.out.println(s.replaceFirst("v2", "c2"));
	   
				
		}
		
	}

}
