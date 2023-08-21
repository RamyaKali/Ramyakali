package mypractice;

public class Stringconcepts {
		
		String name1 = " Besant Technology tambaram ";
		String name2 = " Besant Technology tambaraM ";
		
		public void stringConcpetsImplementation()
		{
			System.out.println(name1);
			int len = name1.length();
			System.out.println(len);
			System.out.println(name1.trim());
			System.out.println(name1.replace(" ", ""));
			System.out.println(name1.replace("ant", "A"));
			System.out.println(name1);
			System.out.println(name1.compareTo(name2));
			System.out.println(name1.equals(name2));
			System.out.println(name1.equalsIgnoreCase(name2));
			System.out.println(name1.charAt(3));
			System.out.println(name1.indexOf('a'));
			System.out.println(name1.lastIndexOf('a'));
			System.out.println(name1.substring(3));
			System.out.println(name1.substring(3,7));
			System.out.println(name1.contains("tambaram"));
			System.out.println(name1.startsWith(" Besname1.ant"));
			System.out.println(name1.endsWith("tambaram "));
			System.out.println(name1.toUpperCase());
			System.out.println(name1.toLowerCase());
			System.out.println(name1.isEmpty());
			String[] namearray = name1.split("sathish");
			for(String val :namearray)
			{
				System.out.println(val);
			}
			System.out.println(name1+name2);
			System.out.println(name1.concat(name2));
			char[] c =name1.toCharArray();
			for(char val :c)
			{
				System.out.println(val);
			}
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Stringconcepts s = new Stringconcepts();
			s.stringConcpetsImplementation();
		}

	}



