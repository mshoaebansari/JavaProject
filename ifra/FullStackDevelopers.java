package a;

public class FullStackDevelopers extends Employee implements JavaDeveloper, PythonDeveloper{
	
	private String Company;
	
	public FullStackDevelopers(String Company, int eid, String name)
	{
		super(eid,name);
		this.Company=Company;
	}

	public void JavaSkills()
	{
		System.out.println("Java Skill: ");
		System.out.println("          Core Java");
		System.out.println("          Java Fx");
		System.out.println("          Java AWT");
		System.out.println("          Java OLEDB");
		System.out.println("          Java Spring");
		System.out.println();
	}
	
	public void PythonSkills()
	{
		System.out.println("Python Skill: ");
		System.out.println("            Core Python");
		System.out.println("            Numpy , Sympy, metplolib, pandas");
			
	}
	
	
	
}
