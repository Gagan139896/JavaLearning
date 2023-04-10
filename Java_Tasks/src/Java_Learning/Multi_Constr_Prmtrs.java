package Java_Learning;

public class Multi_Constr_Prmtrs {
	int modelYear;
	  String modelName;

	  public Multi_Constr_Prmtrs(int year, String name) {
	    modelYear = year;
	    modelName = name;
	  }
	public static void main(String[] args) {
		Multi_Constr_Prmtrs myCar = new Multi_Constr_Prmtrs(1969, "Mustang");
	    System.out.println(myCar.modelYear + " " + myCar.modelName);
	}

}
